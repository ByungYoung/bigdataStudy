package javaStudy_0825;

import java.util.Scanner;

public class Ex06 {	
	static void translateMoney(int num) {
		int thousand = num/1000;
		int fivHundred = (num-thousand*1000)/500;
		int oneHundred = ((num-thousand*1000)-fivHundred*500)/100;
		System.out.println("õ�� : " + thousand +" �� " + "500�� : " + fivHundred + " �� " + "100�� : " + oneHundred + " �� ");
	}
	
	public static void main(String[] args) {
		int inputMoney = 0, buy = 0, restMoney = 0;
		int cola = 800, water = 500, vitaWater = 1500;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���. >> ");
		inputMoney = sc.nextInt();
		
		System.out.println("�޴��� ������.");
		System.out.print("1. �ݶ�(" + cola +"��) " + "2. ����(" + water + "��) " + "3. ��Ÿ�ο���(" + vitaWater + "��) ");
		buy = sc.nextInt();
		sc.close();

		switch(buy) {
			case 1:
				restMoney = inputMoney - cola;
				if(restMoney >= 0) System.out.println("�ݶ� �����Ͽ����ϴ�." + '\n' + "�ܵ� : " + restMoney + "��");
				else System.out.println("���� �����ؿ� �̤�" +'\n'+ "�ܵ� :" + inputMoney + "��");
				break;
			case 2:
				restMoney = inputMoney - water;
				if(restMoney >= 0) System.out.println("������ �����Ͽ����ϴ�." + '\n' + "�ܵ� : " + restMoney + "��");
				else System.out.println("���� �����ؿ� �̤�" +'\n'+ "�ܵ� :" + inputMoney + "��");
				break;
			case 3:
				restMoney = inputMoney - vitaWater;
				if(restMoney >= 0) System.out.println("��Ÿ�ο��͸� �����Ͽ����ϴ�." + '\n' + "�ܵ� : " + restMoney + "��");
				else System.out.println("���� �����ؿ� �̤�" +'\n'+ "�ܵ� :" + inputMoney + "��");
				break;
			default:
				restMoney = inputMoney;
				System.out.println("I'm sorry.");
				break;
		}
		translateMoney(restMoney);
	}
}