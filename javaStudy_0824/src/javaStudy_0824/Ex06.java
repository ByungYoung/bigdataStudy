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
//		if(age >= 20) System.out.println("성인 입니다.");
//		else System.out.println("미성년자 입니다.");
		if(age >= 0) {
			if(age < 10) System.out.println("0~9세 입니다.");
			else if(age < 20) System.out.println("10대 입니다.");
			else if(age < 30) System.out.println("20대 입니다.");
			else if(age < 40) System.out.println("30대 입니다.");
			else System.out.println("40대 이상입니다.");
		}
		else System.out.println("나이가 음수일 수 없습니다.");
	}
}