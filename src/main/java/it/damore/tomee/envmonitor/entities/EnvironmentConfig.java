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
package it.damore.tomee.envmonitor.entities;

import java.util.Properties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnvironmentConfig {

    private Long maxMemory;
    private Long freeMemory;
    private Long totalMemory;
    
    private Properties systemProperties;
    private LocalRuntimeMXBean runtimeMXBean;
    private LocalMemoryMXBean memoryMXBean;
    private LocalOperatingSystemMXBean operatingSystemMXBean;

	/**
	 * @return the systemProperties
	 */
	public Properties getSystemProperties() {
		return systemProperties;
	}

	/**
	 * @param systemProperties the systemProperties to set
	 */
	public void setSystemProperties(Properties systemProperties) {
		this.systemProperties = systemProperties;
	}

	/**
	 * @return the maxMemory
	 */
	public Long getMaxMemory() {
		return maxMemory;
	}

	/**
	 * @param maxMemory the maxMemory to set
	 */
	public void setMaxMemory(Long maxMemory) {
		this.maxMemory = maxMemory;
	}

	/**
	 * @return the freeMemory
	 */
	public Long getFreeMemory() {
		return freeMemory;
	}

	/**
	 * @param freeMemory the freeMemory to set
	 */
	public void setFreeMemory(Long freeMemory) {
		this.freeMemory = freeMemory;
	}

	/**
	 * @return the totalMemory
	 */
	public Long getTotalMemory() {
		return totalMemory;
	}

	/**
	 * @param totalMemory the totalMemory to set
	 */
	public void setTotalMemory(Long totalMemory) {
		this.totalMemory = totalMemory;
	}

	/**
	 * @return the runtimeMXBean
	 */
	public LocalRuntimeMXBean getRuntimeMXBean() {
		return runtimeMXBean;
	}

	/**
	 * @param runtimeMXBean the runtimeMXBean to set
	 */
	public void setRuntimeMXBean(LocalRuntimeMXBean runtimeMXBean) {
		this.runtimeMXBean = runtimeMXBean;
	}

	/**
	 * @return the memoryMXBean
	 */
	public LocalMemoryMXBean getMemoryMXBean() {
		return memoryMXBean;
	}

	/**
	 * @param memoryMXBean the memoryMxBean to set
	 */
	public void setMemoryMXBean(LocalMemoryMXBean memoryMXBean) {
		this.memoryMXBean = memoryMXBean;
	}

	
	/**
	 * @return the operatingSystemMXBean
	 */
	public LocalOperatingSystemMXBean getOperatingSystemMXBean() {
		return operatingSystemMXBean;
	}

	/**
	 * @param operatingSystemMXBean the operatingSystemMXBean to set
	 */
	public void setOperatingSystemMXBean(
			LocalOperatingSystemMXBean operatingSystemMXBean) {
		this.operatingSystemMXBean = operatingSystemMXBean;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnvironmentConfig [maxMemory=" + maxMemory + ", freeMemory="
				+ freeMemory + ", totalMemory=" + totalMemory
				+ ", systemProperties=" + systemProperties + "]";
	}
}

