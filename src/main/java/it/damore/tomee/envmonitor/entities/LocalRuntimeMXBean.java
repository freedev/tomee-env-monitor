/**
 * 
 */
package it.damore.tomee.envmonitor.entities;

/**
 * @author freedev
 *
 */
public class LocalRuntimeMXBean {
	
	private String name;
	private String vmName;
	private String vmVendor;

    private String vmVersion;

    private String specName;

    private String specVendor;

    private String specVersion;

    private String managementSpecVersion;

    private String classPath;

    private String libraryPath;

    private boolean bootClassPathSupported;

    private String bootClassPath;

    private java.util.List<String> inputArguments;

    private long uptime;

    private long startTimes;

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
	 * @return the vmName
	 */
	public String getVmName() {
		return vmName;
	}

	/**
	 * @param vmName the vmName to set
	 */
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	/**
	 * @return the vmVendor
	 */
	public String getVmVendor() {
		return vmVendor;
	}

	/**
	 * @param vmVendor the vmVendor to set
	 */
	public void setVmVendor(String vmVendor) {
		this.vmVendor = vmVendor;
	}

	/**
	 * @return the vmVersion
	 */
	public String getVmVersion() {
		return vmVersion;
	}

	/**
	 * @param vmVersion the vmVersion to set
	 */
	public void setVmVersion(String vmVersion) {
		this.vmVersion = vmVersion;
	}

	/**
	 * @return the specName
	 */
	public String getSpecName() {
		return specName;
	}

	/**
	 * @param specName the specName to set
	 */
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	/**
	 * @return the specVendor
	 */
	public String getSpecVendor() {
		return specVendor;
	}

	/**
	 * @param specVendor the specVendor to set
	 */
	public void setSpecVendor(String specVendor) {
		this.specVendor = specVendor;
	}

	/**
	 * @return the specVersion
	 */
	public String getSpecVersion() {
		return specVersion;
	}

	/**
	 * @param specVersion the specVersion to set
	 */
	public void setSpecVersion(String specVersion) {
		this.specVersion = specVersion;
	}

	/**
	 * @return the managementSpecVersion
	 */
	public String getManagementSpecVersion() {
		return managementSpecVersion;
	}

	/**
	 * @param managementSpecVersion the managementSpecVersion to set
	 */
	public void setManagementSpecVersion(String managementSpecVersion) {
		this.managementSpecVersion = managementSpecVersion;
	}

	/**
	 * @return the classPath
	 */
	public String getClassPath() {
		return classPath;
	}

	/**
	 * @param classPath the classPath to set
	 */
	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}

	/**
	 * @return the libraryPath
	 */
	public String getLibraryPath() {
		return libraryPath;
	}

	/**
	 * @param libraryPath the libraryPath to set
	 */
	public void setLibraryPath(String libraryPath) {
		this.libraryPath = libraryPath;
	}

	/**
	 * @return the bootClassPathSupported
	 */
	public boolean isBootClassPathSupported() {
		return bootClassPathSupported;
	}

	/**
	 * @param bootClassPathSupported the bootClassPathSupported to set
	 */
	public void setBootClassPathSupported(boolean bootClassPathSupported) {
		this.bootClassPathSupported = bootClassPathSupported;
	}

	/**
	 * @return the bootClassPath
	 */
	public String getBootClassPath() {
		return bootClassPath;
	}

	/**
	 * @param bootClassPath the bootClassPath to set
	 */
	public void setBootClassPath(String bootClassPath) {
		this.bootClassPath = bootClassPath;
	}

	/**
	 * @return the inputArguments
	 */
	public java.util.List<String> getInputArguments() {
		return inputArguments;
	}

	/**
	 * @param inputArguments the inputArguments to set
	 */
	public void setInputArguments(java.util.List<String> inputArguments) {
		this.inputArguments = inputArguments;
	}

	/**
	 * @return the uptime
	 */
	public long getUptime() {
		return uptime;
	}

	/**
	 * @param uptime the uptime to set
	 */
	public void setUptime(long uptime) {
		this.uptime = uptime;
	}

	/**
	 * @return the startTimes
	 */
	public long getStartTimes() {
		return startTimes;
	}

	/**
	 * @param startTimes the startTimes to set
	 */
	public void setStartTimes(long startTimes) {
		this.startTimes = startTimes;
	}

    
    
}
