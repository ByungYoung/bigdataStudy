package javaStudy_0903;

import java.util.Scanner;

public class Ex06_cal {
	public static int cal(int a, int b, String op) {
		switch(op) {
		case "+":	return a+b;
		case "-":	return a-b;
		case "*":	return a*b;
		case "/":	return a/b;
		case "%":	return a%b;
		default:	return 0;
		}
	}
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		String op;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ڸ� �Է��ϼ��� >> ");
		op = sc.next();
		sc.close();
		System.out.println("�Է°�� >> " + cal(num1, num2, op));
	}
}