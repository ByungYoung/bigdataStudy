package javaStudy_0826;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int num1 = 1, num2 = 1, res = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("A 입력 >> ");
			num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			res = num1 - num2;
			System.out.println("결과 >> " + res);
		}
		sc.close();
	}
}