package javaStudy_0903;

import java.util.Scanner;

public class Ex07_method_whatisLarge {
	public static int large(int a, int b) {
		int result = 0;
		if(a==b)
			return 0;
		result = a > b ? a: b;
		return result;
	}
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� >> ");
		num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� >> ");
		num2 = sc.nextInt();
		sc.close();
		
		int result = large(num1,num2);
		System.out.println("�� ū �� >> " + result);
	}
}