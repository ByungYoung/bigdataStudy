package OOP;

public class phoneName {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//Ŭ���� -> ����� ������ �ڷ���
		//ĸ��ȭ(emcapsulation), �߻�ȭ(Abstract)�� ���� ���� �� �ִ�
		//���(Inheritance) : ���� + Ȯ��, �پ缺
		//������(�������̵�)
		phone p1 = new phone();
		p1.setName("�ں���");
		p1.setkind("IPHONE");
		p1.setphoneNum("01012345678");
		
		System.out.println(p1.getName());
		System.out.println(p1.getphoneNum());
		System.out.println(p1.getkind());
		p1.playGame();
		p1.map();
		
		phone p2 = new phone();
		p2.setName("hello");
		p2.setphoneNum("01011111111");
		p2.setkind("Galaxy");
		
		System.out.println(p2.getName());
		System.out.println(p2.getphoneNum());
		System.out.println(p2.getkind());
		p2.playGame();
		p2.map();
	}
}