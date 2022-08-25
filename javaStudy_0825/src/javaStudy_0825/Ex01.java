package javaStudy_0825;

import java.util.Scanner;

public class Ex01 {
	public static int timePrice = 5000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		timePrice = 7000;
		double payment = 0;
		
		System.out.print("일한 시간을 입력하세요 >> ");
		int time = sc.nextInt();
		sc.close();
		
		if(time > 8) {
			payment = 8 * timePrice + (time-8)*timePrice*1.5;
		}
		else {
			payment = time * timePrice;
		}
		System.out.println("총 임금은 " + (int)payment + "원 입니다.");
	}
}