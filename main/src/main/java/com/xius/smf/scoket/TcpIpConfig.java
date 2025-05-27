package com.xius.smf.scoket;

public class TcpIpConfig {

	private Integer port;
	private String urlAddress;
	
	private int readTimeout;
	private int connectTimeout;
	
	private int maxSizeOfRespBytes;
	
	public int getMaxSizeOfRespBytes() {
		return maxSizeOfRespBytes;
	}
	public void setMaxSizeOfRespBytes(int maxSizeOfRespBytes) {
		this.maxSizeOfRespBytes = maxSizeOfRespBytes;
	}
	public int getReadTimeout() {
		return readTimeout;
	}
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}
	public int getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	/**
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
		this.port = port;
	}
	/**
	 * @return the urlAddress
	 */
	public String getUrlAddress() {
		return urlAddress;
	}
	/**
	 * @param urlAddress the urlAddress to set
	 */
	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}
}
