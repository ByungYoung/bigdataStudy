package inherience;

public class inherienceMain {
	public static void main(String[] args) {
		// 1. ����� ������ ���� Ŭ������ ����� ���� �޴´�.
		inherienceSuper store1 = new inherienceSuper();
		store1.coffee();
		
		inherienceSub store2 = new inherienceSub();
		store2.coffee();
		store2.waffle();
		
		// 2. ����Ŭ���� Ÿ���� ��ü�� ���� Ŭ���� Ÿ������ �ຯȯ�� �����ϴ�.
		// => UpCasting(�ڵ� ����ȯ)
		inherienceSuper store3 = new inherienceSub();
		
		// ����Ŭ������ ��ĳ���� �� ��ü�� �ٽ� ����Ŭ���� Ÿ������ ����ȯ ����
		// => ����� ����ȯ(���� ����ȯ)
		((inherienceSub)store3).waffle();	//DownCasting
		
		// 3. �޼ҵ� �������̵� (������) : ���� Ŭ������ ����� �޼ҵ带 ����Ŭ�������� ������
		// => ��ĳ���� �Ǿ��ִ� ���¿��� �������̵��� �޼ҵ带 ȣ���ϸ� ���� �޼ҵ� ����
		store3.coffee();				//UpCasting
		
		// 4. �޼ҵ� �����ε�(�ߺ�����) : �� Ŭ���� ������ �޼ҵ��� �̸��� �����ϰ� �����ϴ� ��
		// => �ߺ�����(�Ű������� Ÿ���̳� ������ �ٸ���)
	}
}