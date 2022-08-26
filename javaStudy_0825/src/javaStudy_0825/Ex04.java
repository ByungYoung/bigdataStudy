package javaStudy_0825;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5까지의 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		sc.close();
		switch(num) {
		case 1:
			System.out.println("1을 입력했습니다.");
			break;
		case 2:
			System.out.println("2를 입력했습니다.");
			break;
		case 3:
			System.out.println("3을 입력했습니다.");
			break;
		case 4:
			System.out.println("4를 입력했습니다.");
			break;
		case 5:
			System.out.println("5를 입력했습니다.");
			break;
		default:
			System.out.println("숫자를 잘 못 입력하셨씁니다.");
			break;
		}
		if(num > 0 && num < 6) {
			if(num == 1) System.out.println("1을 입력했습니다.");
			else if(num == 2) System.out.println("2을 입력했습니다.");
			else if(num == 3) System.out.println("3을 입력했습니다.");
			else if(num == 4) System.out.println("4을 입력했습니다.");
			else System.out.println("5을 입력했습니다.");
		}
		else System.out.println("숫자를 잘 못 입력하셨습니다.");
	}
}