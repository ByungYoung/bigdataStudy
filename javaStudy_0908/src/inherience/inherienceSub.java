package inherience;

public class inherienceSub extends inherienceSuper {
	inherienceSub() {
		super(); // <- ����Ŭ������ ������ ȣ���ϴ� ��ɾ�
		/*
		 * super()�� �ݵ�� �����ڿ����� ȣ�� ���� super()�� �ݵ�� �� ù�⿡�� ��� ���� ����Ŭ������ �����ڿ� �Ű������� ������
		 * super() ��������
		 */
		System.out.println("Sub ������ ����!");
	}
	
	public void waffle() {
		System.out.println("���� ������");
	}
	
	@Override
	public void coffee() {
		System.out.println("1ȣ��");
	}
}