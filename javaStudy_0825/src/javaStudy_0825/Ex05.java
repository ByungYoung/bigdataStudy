package javaStudy_0825;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int month = 0;
		String weather =  "\0";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >> ");
		month = sc.nextInt();
		sc.close();
		
		if(month >= 1 && month <= 12) {
			switch(month) {
			case 12:
			case 1:
			case 2:
				weather = "겨울";
				break;
			case 3:
			case 4:
			case 5:
				weather = "봄";
				break;
			case 6:
			case 7:
			case 8:
				weather = "여름";
				break;
			default:
				weather = "가을";
				break;
			}
			System.out.println(month + "월은 " + weather + "입니다!");
		}
		else System.out.println("다시 입력해주세요");
	}
}