package javaStudy_0914;

public class model {
	private String name;
	private int age;
	private String address;
	private String phonenum;
	
	public model() {}
	public model(String name, int age, String address, String phonenum) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phonenum = phonenum;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
}