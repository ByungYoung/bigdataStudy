package javaStudy_0831;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] numArray = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.print("���� �Է� >> ");
			numArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(i+1 + " ��° ���� " + numArray[i]);
		}
		sc.close();
	}
}