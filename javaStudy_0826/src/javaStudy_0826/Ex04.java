package javaStudy_0826;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int num = 0, odd = 0, even = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 >> ");
			num = sc.nextInt();
			
			if(num%2==0) {
				odd++;
			}
			else {
				even++;
			}
			if (num == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("짝수 개수 >> " + odd);
			System.out.println("홀수 개수 >> " + even);
		}
		sc.close();
	}
}