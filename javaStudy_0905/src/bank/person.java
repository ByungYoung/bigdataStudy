package bank;

public class person {
	//���� ���ϴ� ���
	private int age;
	String gender;		//���� 0 ���� 1
	private String name;
	int height;

	public int getAge() {
		return age;
	}public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}
	// ������
	// ��Ŭ�� -> source -> Generator Constructor using Fields
	// ������ �����ε� (������) 
	person(String name, int age, String gender, int height) {
		this.setName(name);
		this.setAge(age);
		this.gender = gender;
		this.height = height;
	}
	person(){
	}
	
	void talk() {
		System.out.println("�ȳ��ϼ���!!");
	}void eat() {
		System.out.println("�ȳ� ");
	}void walk() {
		System.out.println("���� ��å�ϱ�");
	}void sleep() {
		System.out.println("�����ڱ�");
	}void showPerson() {
		System.out.println("�̸� >> " + getName());
		System.out.println("���� >> " + getAge());
		System.out.println("���� >> " + gender);
		System.out.println("Ű >> " + height);
		System.out.println("==============================");
	}
}