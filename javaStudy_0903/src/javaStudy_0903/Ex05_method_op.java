package javaStudy_0903;

public class Ex05_method_op {
	public static void add(int a, int b) {
		System.out.println("�� >> " + (a + b));
	}
	public static void sub(int a, int b) {
		System.out.println("�� >> " + (a - b));
	}
	public static void mul(int a, int b) {
		System.out.println("�� >> " + (a * b));
	}
	public static void div(int a, int b) {
		System.out.println("���� >> " + Math.ceil((double)a*100 / b)/100);
	}
	
	public static void main(String[] args) {
		add(1,2);
		sub(2,3);
		mul(5,2);
		div(3,5);
	}
}