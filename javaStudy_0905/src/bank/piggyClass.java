package bank;

public class piggyClass {
	private static int money;
	
	static int getMoney() {
		return money;
	}
	void setMoney(int money) {
		piggyClass.money = money;
	}
	
	void deposit(int input) {
		// ����
		money = getMoney() + input;
	}
	
	void withdraw(int out) {
		// ���
		money = getMoney() - out;
	}
	
	void showMoney() {
		// �ܾ��� ������ (������� �����ڻ�)
		System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
	}
}