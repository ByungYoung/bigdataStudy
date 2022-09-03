package OOP;

public class student {
	private static String name;
	private static String number;
	private static int age;
	int scoreJava, scoreWeb, scoreAndroid;
	
	//Á¢±Ù Á¦ÇÑÀÚ
	//public(¸ğµÎ)
	//protected(°°Àº ÆĞÅ°Áö => »ó¼Ó°ü°è Æ÷ÇÔ x)
	//private(°°Àº Å¬·¡½º)
	//default(¯˜Àº ÆĞÅ°Áö => »ó¼Ó°ü°è Æ÷ÇÔ x)
	
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
		System.out.println(getname() + "´Ô ¾È³çÇÏ¼¼¿ä");
		System.out.println("[ " + getnumber() + ", " + getage() + "¼¼ ]");
		System.out.println(getname() + "´ÔÀÇ Java Á¡¼ö´Â " + scoreJava + "ÀÔ´Ï´Ù.");
		System.out.println(getname() + "´ÔÀÇ Web Á¡¼ö´Â " + scoreWeb + "ÀÔ´Ï´Ù.");
		System.out.println(getname() + "´ÔÀÇ Android Á¡¼ö´Â " + scoreAndroid + "ÀÔ´Ï´Ù.");
		System.out.println("========================================");
	}
}