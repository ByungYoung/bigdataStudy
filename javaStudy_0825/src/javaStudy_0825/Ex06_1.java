package javaStudy_0825;

import java.util.Scanner;

public class Ex06_1 {
	public static void main(String[] args) {
		int price = 0, buy = 0, restMoney = 0;
		int [][] food = {{1,800},{2,800},{3,1500}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���. >> ");
		price = sc.nextInt();
		
		System.out.println("�޴��� ������.");
		System.out.print("1. �ݶ�(" + food[0][1] +"��) " + "2. ����(" + food[1][1] + "��) " + "3. ��Ÿ�ο���(" + food[2][1] + "��) ");
		buy = sc.nextInt();
		sc.close();
		
		restMoney = price - food[buy-1][1];
		
		if(restMoney >= 0) {
			switch(buy) {
			case 1:
				System.out.println("�ݶ� �����Ͽ����ϴ�.");
				break;
			case 2:
				System.out.println("������ �����Ͽ����ϴ�.");
				break;
			case 3:
				System.out.println("��Ÿ�ο��͸� �����Ͽ����ϴ�.");
				break;
			}
			System.out.println("�ܵ� : " + restMoney + "��");
		}
		else System.out.println("�ܵ� : " + price + "��");
	}
}