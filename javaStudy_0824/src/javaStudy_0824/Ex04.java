package javaStudy_0824;

public class Ex04 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		int num3 = 50;
		num3 = num3 + num2;
		num1 += num3; // ���մ��Կ�����
		System.out.println(num1);
		//���� ������(++, --)
		int num4 = 100;
		//�������� : �� ���� ������ ����
		num4++;
		//�������� : ���ٿ��� ���� ���� ����
		System.out.println(++num4);
		//���׿��� : ���� 3�� > ���� ? �� : ����
		//System.out.println(10<5?10:5);
	}
}