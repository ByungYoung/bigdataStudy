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
		if(age >= 20) System.out.println("�����Դϴ�.");
		else System.out.println("������ �ƴմϴ�.");
	}
}