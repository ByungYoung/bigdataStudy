package javaStudy_0824;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//		int num = 7;
//		if(num == 3) System.out.println("���� 3�Դϴ�.");
//		System.out.println("���α׷� ����");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� >> ");
		int age = sc.nextInt();
		
		sc.close();
//		ũ�ų� ���ٸ� >= : �۰ų� ���ٸ� <=
//		if(age >= 20) System.out.println("���� �Դϴ�.");
//		else System.out.println("�̼����� �Դϴ�.");
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