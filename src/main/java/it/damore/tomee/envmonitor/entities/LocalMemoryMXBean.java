/**
 * 
 */
package it.damore.tomee.envmonitor.entities;

import java.lang.management.MemoryUsage;

/**
 * @author freedev
 *
 */
public class LocalMemoryMXBean {

	private int objectPendingFinalizationCount;

	private MemoryUsage heapMemoryUsage;

	private MemoryUsage nonHeapMemoryUsage;

	private boolean verbose;

	/**
	 * @return the objectPendingFinalizationCount
	 */
	public int getObjectPendingFinalizationCount() {
		return objectPendingFinalizationCount;
	}

	/**
	 * @param objectPendingFinalizationCount the objectPendingFinalizationCount to set
	 */
	public void setObjectPendingFinalizationCount(int objectPendingFinalizationCount) {
		this.objectPendingFinalizationCount = objectPendingFinalizationCount;
	}

	/**
	 * @return the heapMemoryUsage
	 */
	public MemoryUsage getHeapMemoryUsage() {
		return heapMemoryUsage;
	}

	/**
	 * @param heapMemoryUsage the heapMemoryUsage to set
	 */
	public void setHeapMemoryUsage(MemoryUsage heapMemoryUsage) {
		this.heapMemoryUsage = heapMemoryUsage;
	}

	/**
	 * @return the nonHeapMemoryUsage
	 */
	public MemoryUsage getNonHeapMemoryUsage() {
		return nonHeapMemoryUsage;
	}

	/**
	 * @param nonHeapMemoryUsage the nonHeapMemoryUsage to set
	 */
	public void setNonHeapMemoryUsage(MemoryUsage nonHeapMemoryUsage) {
		this.nonHeapMemoryUsage = nonHeapMemoryUsage;
	}

	/**
	 * @return the verbose
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * @param verbose the verbose to set
	 */
	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	
}
