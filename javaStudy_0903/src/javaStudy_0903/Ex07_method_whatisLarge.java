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
		
		System.out.print("첫 번째 숫자 입력 >> ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 >> ");
		num2 = sc.nextInt();
		sc.close();
		
		int result = large(num1,num2);
		System.out.println("더 큰 수 >> " + result);
	}
}