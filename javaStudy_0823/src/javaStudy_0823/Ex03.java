package javaStudy_0823;

public class Ex03 {

	public static void main(String[] args) {
		//num1, num2
		int num1 = 10, num2 = 3;
		
		//������ �켱���� (���а� ����)
		System.out.println("���� ��� : " + (num1 + num2));
		//���ڿ� - ���� : JAVA���� ������� ����
		System.out.println("�� ��� : " + (num1 - num2));
		System.out.println("���� ��� : " + num1 * num2);
		System.out.println("���� �� : " + num1 / num2);
		System.out.println("������ : " + num1 % num2);
		//(������ų �ڷ���)������ : ������ ������ ����ȯ
		System.out.println("���� �� : " + (double)num1 / num2);
		
		int number1 = 10;
		String number2 = "3";
		//String : reference type
		//String->int : Integer.parseInt('�ٲٰ� ���� ���ڿ�')
		System.out.println(number1+Integer.parseInt(number2));
	}
}