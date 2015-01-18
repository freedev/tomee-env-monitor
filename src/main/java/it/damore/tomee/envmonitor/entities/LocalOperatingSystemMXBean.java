/**
 * 
 */
package it.damore.tomee.envmonitor.entities;

/**
 * @author freedev
 *
 */
public class LocalOperatingSystemMXBean {
    private String name;

    private String arch;

    private String getVersion;

    private int availableProcessors;

    private double systemLoadAverage;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the arch
	 */
	public String getArch() {
		return arch;
	}

	/**
	 * @param arch the arch to set
	 */
	public void setArch(String arch) {
		this.arch = arch;
	}

	/**
	 * @return the getVersion
	 */
	public String getGetVersion() {
		return getVersion;
	}

	/**
	 * @param getVersion the getVersion to set
	 */
	public void setGetVersion(String getVersion) {
		this.getVersion = getVersion;
	}

	/**
	 * @return the availableProcessors
	 */
	public int getAvailableProcessors() {
		return availableProcessors;
	}

	/**
	 * @param availableProcessors the availableProcessors to set
	 */
	public void setAvailableProcessors(int availableProcessors) {
		this.availableProcessors = availableProcessors;
	}

	/**
	 * @return the systemLoadAverage
	 */
	public double getSystemLoadAverage() {
		return systemLoadAverage;
	}

	/**
	 * @param systemLoadAverage the systemLoadAverage to set
	 */
	public void setSystemLoadAverage(double systemLoadAverage) {
		this.systemLoadAverage = systemLoadAverage;
	}

    
}
