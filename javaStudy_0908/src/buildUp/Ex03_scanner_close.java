package buildUp;

import java.util.Scanner;

public class Ex03_scanner_close {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�޷� �Է� : ");
			int input = sc.nextInt();
			if(input == -1) {
				break;
			}else {
				System.out.println(input * 1380 + "�� �Դϴ�.");
			}	
		}
		sc.close();
	}
}