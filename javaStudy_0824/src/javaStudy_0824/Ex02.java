package javaStudy_0824;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int plus = num1+num2;	//�� ���� ��
		int minus = num1-num2;	//�� ���� ��
		int mul = num1*num2;	//�� ���� ��
		int div = num1/num2;	//�� ���� ������
		
		System.out.println("�� ���� ���ϱ� : " + plus);
		System.out.println("�� ���� ���� : " + minus);
		System.out.println("�� ���� ���ϱ� : " + mul);
		System.out.println("�� ���� ������(��) : " + div);
		sc.close();
	}
}