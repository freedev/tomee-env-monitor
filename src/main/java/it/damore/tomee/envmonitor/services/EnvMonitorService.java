/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package it.damore.tomee.envmonitor.services;

import it.damore.tomee.envmonitor.entities.EnvironmentConfig;
import it.damore.tomee.envmonitor.entities.LocalMemoryMXBean;
import it.damore.tomee.envmonitor.entities.LocalOperatingSystemMXBean;
import it.damore.tomee.envmonitor.entities.LocalRuntimeMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.beanutils.BeanUtils;

@Path("env")
public class EnvMonitorService {
	
	@GET
    @Path("monitor")
    @Produces({ MediaType.APPLICATION_JSON })
    public EnvironmentConfig getEnvConfig() throws IllegalAccessException, InvocationTargetException 
    {
        int mb = 1024*1024;
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
		EnvironmentConfig b = new EnvironmentConfig();
		b.setMaxMemory(runtime.maxMemory()/mb);
		b.setFreeMemory(runtime.freeMemory()/mb);
		b.setTotalMemory(runtime.totalMemory()/mb);
		b.setSystemProperties(System.getProperties());
		
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		LocalRuntimeMXBean myRuntimeMXBean = new LocalRuntimeMXBean();
		BeanUtils.copyProperties(myRuntimeMXBean, runtimeMXBean);
		b.setRuntimeMXBean(myRuntimeMXBean);
		
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
		LocalMemoryMXBean myMemoryMXBean = new LocalMemoryMXBean();
		myMemoryMXBean.setHeapMemoryUsage(memoryMXBean.getHeapMemoryUsage());
		myMemoryMXBean.setNonHeapMemoryUsage(memoryMXBean.getNonHeapMemoryUsage());
		myMemoryMXBean.setObjectPendingFinalizationCount(memoryMXBean.getObjectPendingFinalizationCount());
		b.setMemoryMXBean(myMemoryMXBean);
				  
		OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
		LocalOperatingSystemMXBean myOperatingSystemMXBean = new LocalOperatingSystemMXBean();
		BeanUtils.copyProperties(myOperatingSystemMXBean, operatingSystemMXBean);
		b.setOperatingSystemMXBean(myOperatingSystemMXBean);
		
		return b;
    }

}
