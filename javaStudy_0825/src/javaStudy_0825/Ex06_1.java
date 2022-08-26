package javaStudy_0825;

import java.util.Scanner;

public class Ex06_1 {
	public static void main(String[] args) {
		int price = 0, buy = 0, restMoney = 0;
		int [][] food = {{1,800},{2,800},{3,1500}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요. >> ");
		price = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 콜라(" + food[0][1] +"원) " + "2. 생수(" + food[1][1] + "원) " + "3. 비타민워터(" + food[2][1] + "원) ");
		buy = sc.nextInt();
		sc.close();
		
		restMoney = price - food[buy-1][1];
		
		if(restMoney >= 0) {
			switch(buy) {
			case 1:
				System.out.println("콜라를 구입하였습니다.");
				break;
			case 2:
				System.out.println("생수를 구입하였습니다.");
				break;
			case 3:
				System.out.println("비타민워터를 구입하였습니다.");
				break;
			}
			System.out.println("잔돈 : " + restMoney + "원");
		}
		else System.out.println("잔돈 : " + price + "원");
	}
}