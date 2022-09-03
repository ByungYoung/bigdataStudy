package javaStudy_0903;

import java.util.Scanner;

public class Ex08_close10 {
	public static int absolute(int num) {
		if(num - 10 > 0)
			return num-10;
		else
			return 10-num;
	}
	public static int close10(int num1, int num2) {
		if(absolute(num1) == absolute(num2))
			return 0;
		else
			return absolute(num1) > absolute(num2) ? num2 : num1;
	}
	/*	
 	public static int close10(int a, int b) {
		if(Math.abs(a-10) == Math.abs(b-10))
			return 0;
		else
			return Math.abs(a-10) > Math.abs(b-10) ? b : a;
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 >> ");
		int num2 = sc.nextInt();
		sc.close();
		
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 >> " + result);
	}
}