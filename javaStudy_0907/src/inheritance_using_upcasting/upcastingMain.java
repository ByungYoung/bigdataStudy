package inheritance_using_upcasting;

public class upcastingMain {
	public static void machine(pocketmon k) {
		k.pick();
		// �������̵�
		// ��Ӱ��¿��� ����Ŭ������ ����� �޼ҵ带 ����Ŭ�������� ������
		// => ��ĳ���õ� ���¿��� �������̵��� �޼ҵ带 ȣ���ϸ� ����Ŭ������ �޼ҵ尡 �����.
	}
	
	public static void main(String[] args) {
		// Why Upcasting?
		// �����̱� ���
		// ��� - MainŬ���� �� machine �޼ҵ�
		// ������ - ������ Ŭ������ ����
		//pocketmon p = new pocketmon();
		
		pairi p1 = new pairi();
		pika p2 = new pika();
		kko k = new kko();
		riza r = new riza();
		
		machine(p2); machine(r);
		/* machine(p2); machine(k); upcasting*/
	}
}