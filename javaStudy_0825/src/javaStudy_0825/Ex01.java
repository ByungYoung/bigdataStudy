package javaStudy_0825;

import java.util.Scanner;

public class Ex01 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int timePrice = 5000;
		double payment = 0;
		
		System.out.print("���� �ð��� �Է��ϼ��� >> ");
		int time = sc.nextInt();
		sc.close();
		
		if(time > 8) payment = 8 * timePrice + (time-8)*timePrice*1.5;
		else payment = time * timePrice;
		System.out.println("�� �ӱ��� " + (int)payment + "�� �Դϴ�.");
	}
}