package buildUp;

public class Ex01_divide_0 {
	public static void main(String[] args) {
		/*
		 * 1. compile ���� | ������ ���� System.out.prinl("��¹�");
		 * 
		 * 2. Runtime ���� | ����� ��Ÿ���� ���� try ����ó�� ���� catch ���ܹ߻��� ���� ����ִ� ����
		 * System.out.println(100/0); System.out.println("���� �ڵ�");
		 */
		
		try {
			System.out.println(100/0);
		} catch(ArithmeticException e){
			System.out.println("������ ���� �߻�");
		}
	}
}