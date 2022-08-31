package javaStudy_0831;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < num ; i++) {
			for(int j = 0; j < num; j++) {
				if(j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j = 0; j <= num; j++) {
				if(j > i)
					System.out.print("*");
			}
			System.out.print('\n');
		}
		for(int i = 0; i < num ; i++) {
			for(int j = num ; j > 0;j--) {
				if(j - 1 > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for(int j = 0; j < num; j++) {
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}