package javaStudy_0825;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int month = 0;
		String weather =  "\0";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		month = sc.nextInt();
		sc.close();
		
		if(month >= 1 && month <= 12) {
			switch(month) {
			case 12:
			case 1:
			case 2:
				weather = "�ܿ�";
				break;
			case 3:
			case 4:
			case 5:
				weather = "��";
				break;
			case 6:
			case 7:
			case 8:
				weather = "����";
				break;
			default:
				weather = "����";
				break;
			}
			System.out.println(month + "���� " + weather + "�Դϴ�!");
		}
		else System.out.println("�ٽ� �Է����ּ���");
	}
}