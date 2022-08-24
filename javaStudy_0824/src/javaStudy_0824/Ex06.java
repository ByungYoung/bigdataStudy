package javaStudy_0824;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//		int num = 7;
//		if(num == 3) System.out.println("숫자 3입니다.");
//		System.out.println("프로그램 종료");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		sc.close();
//		크거나 같다면 >= : 작거나 같다면 <=
		if(age >= 20) System.out.println("성인입니다.");
		else System.out.println("성인이 아닙니다.");
	}
}