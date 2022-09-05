package bank;

public class contact {
	private String name;
	private int age;
	private String phoneNum;

	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	contact(String name, int age, String phoneNum){
		this.setName(name);
		this.setAge(age);
		this.setPhoneNum(phoneNum);
	}
	
	void show() {
		System.out.printf("%s(%d¼¼) : %s\n", getName(), getAge(), getPhoneNum());
	}
}