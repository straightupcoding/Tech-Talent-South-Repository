package sDET;

public class Pet {
	
	private String name;
	private int age;
	private String location;
	private int type;
	
	public Pet(String name, int age, String location, int type) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
