package bank;

import java.util.Scanner;

public class piggybankMain {
	public static void main(String[] args) {
		piggyClass p1 = new piggyClass();
		
		p1.setMoney(2000);
		
		int money = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է��ϼ��� >> ");
		money = sc.nextInt();
		p1.deposit(money);
		p1.showMoney();
		
		System.out.print("����� ���� �Է��ϼ��� >> ");
		money = sc.nextInt();
		p1.withdraw(money);
		p1.showMoney();
		sc.close();
	}
}