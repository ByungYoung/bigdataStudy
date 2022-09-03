package OOP;

public class student {
	private static String name;
	private static String number;
	private static int age;
	int scoreJava, scoreWeb, scoreAndroid;
	
	//���� ������
	//public(���)
	//protected(���� ��Ű�� => ��Ӱ��� ���� x)
	//private(���� Ŭ����)
	//default(���� ��Ű�� => ��Ӱ��� ���� x)
	
	public int sum() {
		return scoreJava + scoreWeb + scoreAndroid;
	}
	
	public double avg(){
		return Math.ceil(sum()*100/3.0)/100;
	}
	
	public static String getname() {
		return name;
	}
	public static void setname(String name) {
		student.name = name;
	}
	
	public static String getnumber() {
		return number;
	}
	public static void setnumber(String number) {
		student.number = number;
	}
	

	public static int getage() {
		return age;
	}
	public static void setage(int age) {
		student.age = age;
	}
	
	void show() {
		System.out.println(getname() + "�� �ȳ��ϼ���");
		System.out.println("[ " + getnumber() + ", " + getage() + "�� ]");
		System.out.println(getname() + "���� Java ������ " + scoreJava + "�Դϴ�.");
		System.out.println(getname() + "���� Web ������ " + scoreWeb + "�Դϴ�.");
		System.out.println(getname() + "���� Android ������ " + scoreAndroid + "�Դϴ�.");
		System.out.println("========================================");
	}
}