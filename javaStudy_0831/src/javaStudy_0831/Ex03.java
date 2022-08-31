package javaStudy_0831;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] numArray = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.print("숫자 입력 >> ");
			numArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(i+1 + " 번째 숫자 " + numArray[i]);
		}
		sc.close();
	}
}