package javaStudy_0826;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int num = 0, count = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(count + " 번째 정수 입력 >> ");
		num = sc.nextInt();
		
		while(num <= 10) {
			count++;
			System.out.print(count + " 번째 정수 입력 >> ");
			num = sc.nextInt();
		}
		sc.close();
		System.out.print("종료되었습니다.");
	}
}