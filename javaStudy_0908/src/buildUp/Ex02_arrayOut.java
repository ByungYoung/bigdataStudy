package buildUp;

public class Ex02_arrayOut {
	public static void main(String[] args) {
		int arr[] = new int[2];
		
		try {
			System.out.println(arr[2]);
			System.out.println(100/0);
		} catch(Exception e) {
			// printstackTrace ������ �ܼ�â�� ���
			e.printStackTrace();
			System.out.println("������ ��� �����Դϴ�.");
		} finally {
			// try -> catch -> finally
			// 1ȸ�� ������ ����
			System.out.println("!!");
		}
	}
}