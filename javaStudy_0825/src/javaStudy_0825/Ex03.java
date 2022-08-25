package javaStudy_0825;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int grade = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		grade = sc.nextInt();
		sc.close();
		
//		if(grade >= 0 && grade <= 100) {
//			if(grade < 70) System.out.println("휴학을 추천합니다.");
//			else if(grade < 80) System.out.println("C 학점입니다.");
//			else if(grade < 90) System.out.println("B 학점입니다.");
//			else System.out.println("A 학점입니다.");
//		}
//		else System.out.println("점수가 0보다 작거나 100보다 클 수 없습니다.");
		if(grade >= 0 && grade <= 100) {
			switch(grade / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("휴학을 추천합니다.");
				break;
			case 7:
				System.out.println("C 학점입니다.");
				break;
			case 8:
				System.out.println("B 학점입니다.");
				break;
			case 9:
				System.out.println("A 학점입니다.");
				break;
			case 10:
				System.out.println("A 학점입니다.");
				break;
			}
		}
		else System.out.println("점수가 0보다 작거나 100보다 클 수 없습니다.");
	}
}