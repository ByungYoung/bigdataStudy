package javaStudy_0823;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		//����ڷ� ���� �����͸� �Է� ���� �� �ִ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ��� >> ");
		int num = sc.nextInt();
		sc.close();
		//nextInt(): ����ڷ� ���� �Է��� ���� ���� ������ �ν�
		int result = num/10*10;
		System.out.println("��� ��� >> "+result);
	}
}