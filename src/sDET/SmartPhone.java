package sDET;

public class SmartPhone {
	int screenSize;
	int phoneSize;
	String name;
	
	public boolean returnABool() {
		return true;
	}
	
	public String returnAString(String x) {
		
		return x;
	}
	
	public SmartPhone() {
		
	}


	public SmartPhone(int screenSize, int phoneSize) {
		super();
		this.screenSize = screenSize;
		this.phoneSize = phoneSize;
	}


	public SmartPhone(int screenSize, int phoneSize, String name) {
		super();
		this.screenSize = screenSize;
		this.phoneSize = phoneSize;
		this.name = name;
	}


	public int getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}


	public int getPhoneSize() {
		return phoneSize;
	}


	public void setPhoneSize(int phoneSize) {
		this.phoneSize = phoneSize;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
