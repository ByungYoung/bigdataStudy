package javaStudy_0826;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int num = 0, count = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(count + " ��° ���� �Է� >> ");
		num = sc.nextInt();
		
		while(num <= 10) {
			count++;
			System.out.print(count + " ��° ���� �Է� >> ");
			num = sc.nextInt();
		}
		sc.close();
		System.out.print("����Ǿ����ϴ�.");
	}
}