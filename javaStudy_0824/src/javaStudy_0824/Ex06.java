package javaStudy_0824;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� >> ");
		int age = sc.nextInt();
		sc.close();
		
		if(age >= 0) {
			if(age < 10) System.out.println("0~9�� �Դϴ�.");
			else if(age < 20) System.out.println("10�� �Դϴ�.");
			else if(age < 30) System.out.println("20�� �Դϴ�.");
			else if(age < 40) System.out.println("30�� �Դϴ�.");
			else System.out.println("40�� �̻��Դϴ�.");
		}
		else System.out.println("���̰� ������ �� �����ϴ�.");
	}
}