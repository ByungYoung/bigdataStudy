package javaStudy_0826;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int num = 0, odd = 0, even = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� >> ");
			num = sc.nextInt();
			
			if(num%2==0) {
				odd++;
			}
			else {
				even++;
			}
			if (num == -1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println("¦�� ���� >> " + odd);
			System.out.println("Ȧ�� ���� >> " + even);
		}
		sc.close();
	}
}