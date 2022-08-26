package javaStudy_0825;

import java.util.Scanner;

public class Ex06 {	
	static void translateMoney(int num) {
		int thousand = num/1000;
		int fivHundred = (num-thousand*1000)/500;
		int oneHundred = ((num-thousand*1000)-fivHundred*500)/100;
		System.out.println("천원 : " + thousand +" 개 " + "500원 : " + fivHundred + " 개 " + "100원 : " + oneHundred + " 개 ");
	}
	
	public static void main(String[] args) {
		int inputMoney = 0, buy = 0, restMoney = 0;
		int cola = 800, water = 500, vitaWater = 1500;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요. >> ");
		inputMoney = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 콜라(" + cola +"원) " + "2. 생수(" + water + "원) " + "3. 비타민워터(" + vitaWater + "원) ");
		buy = sc.nextInt();
		sc.close();

		switch(buy) {
			case 1:
				restMoney = inputMoney - cola;
				if(restMoney >= 0) System.out.println("콜라를 구입하였습니다." + '\n' + "잔돈 : " + restMoney + "원");
				else System.out.println("돈이 부족해요 ㅜㅜ" +'\n'+ "잔돈 :" + inputMoney + "원");
				break;
			case 2:
				restMoney = inputMoney - water;
				if(restMoney >= 0) System.out.println("생수를 구입하였습니다." + '\n' + "잔돈 : " + restMoney + "원");
				else System.out.println("돈이 부족해요 ㅜㅜ" +'\n'+ "잔돈 :" + inputMoney + "원");
				break;
			case 3:
				restMoney = inputMoney - vitaWater;
				if(restMoney >= 0) System.out.println("비타민워터를 구입하였습니다." + '\n' + "잔돈 : " + restMoney + "원");
				else System.out.println("돈이 부족해요 ㅜㅜ" +'\n'+ "잔돈 :" + inputMoney + "원");
				break;
			default:
				restMoney = inputMoney;
				System.out.println("I'm sorry.");
				break;
		}
		translateMoney(restMoney);
	}
}