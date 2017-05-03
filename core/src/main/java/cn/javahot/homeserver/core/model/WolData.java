package cn.javahot.homeserver.core.model;

/**
 * Wake On Lan 数据
 * @author sunan
 *
 */
public class WolData {
	
	/**
	 * 机器标识名
	 */
	private String name;
	
	/**
	 * IP地址
	 */
	private String ip;
	
	/**
	 * Mac 地址
	 */
	private String mac;
	
	/**
	 * 端口号
	 */
	private String port;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	

}
