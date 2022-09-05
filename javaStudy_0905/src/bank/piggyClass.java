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
		// 저금
		money = getMoney() + input;
	}
	
	void withdraw(int out) {
		// 출금
		money = getMoney() - out;
	}
	
	void showMoney() {
		// 잔액을 보여줌 (사용자의 현재자산)
		System.out.println("현재 잔액은 " + money + "원 입니다.");
	}
}