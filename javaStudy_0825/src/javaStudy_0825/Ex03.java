package javaStudy_0825;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int grade = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		grade = sc.nextInt();
		sc.close();
		
//		if(grade >= 0 && grade <= 100) {
//			if(grade < 70) System.out.println("������ ��õ�մϴ�.");
//			else if(grade < 80) System.out.println("C �����Դϴ�.");
//			else if(grade < 90) System.out.println("B �����Դϴ�.");
//			else System.out.println("A �����Դϴ�.");
//		}
//		else System.out.println("������ 0���� �۰ų� 100���� Ŭ �� �����ϴ�.");
		if(grade >= 0 && grade <= 100) {
			switch(grade / 10) {
			case 10:
				System.out.println("A+ �����Դϴ�.");
				break;
			case 9:
				System.out.println("A �����Դϴ�.");
				break;
			case 8:
				System.out.println("B �����Դϴ�.");
				break;
			case 7:
				System.out.println("C �����Դϴ�.");
				break;
			default:
				System.out.println("������ ��õ�մϴ�.");
				break;
			}
		}
		else System.out.println("������ 0���� �۰ų� 100���� Ŭ �� �����ϴ�.");
	}
}