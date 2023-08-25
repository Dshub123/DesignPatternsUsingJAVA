package com.demo.prototypepattern;

//cloneable interface is a marker interface 
public class NetworkConnection implements Cloneable{

	private String ip;
	private String importantData;
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getImportantData() {
		return importantData;
	}
	
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void loadVeryImportantData() throws InterruptedException {
		this.importantData = "Very very important data";
		Thread.sleep(5000);
		//this will takes time to load 
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
	}
	
	
}
