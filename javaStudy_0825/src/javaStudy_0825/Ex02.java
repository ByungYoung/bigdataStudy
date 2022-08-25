package javaStudy_0825;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0, changeNum = 0;
		
		System.out.print("숫자 입력 >> ");
		num = sc.nextInt();
		sc.close();
		
		if(num % 10 >= 0 && num % 10 < 5) changeNum = num / 10 * 10;
		else changeNum = (num / 10 + 1) * 10;
		
		System.out.println("반 올림 수 : " + changeNum);
	}
}