package javaStudy_0826;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num = 1, no = 0, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(num<=10) {
			System.out.print(num + "��° ������ �Է��ϼ���. >> ");
			no = sc.nextInt();
			sum += no;
			num++;
		}
		sc.close();
		
		System.out.println("�� : " + sum);
	}
}