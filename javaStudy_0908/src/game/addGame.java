package game;

import java.util.Random;
import java.util.Scanner;

public class addGame {
	public static int add(int no1, int no2) {
		int result = no1 + no2;
		return result;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Random random = new Random();
		int num1 = 0, num2 = 0, result = 0, count = 0;;
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(true) {
			num1 = random.nextInt(50) + 1;
			num2 = random.nextInt(50) + 1;
			System.out.printf("%d + %d = ", num1, num2);
			result = sc.nextInt();
			
			if(result != add(num1, num2)) count++;
			else System.out.println("Success!!");
			
			switch(count) { 
			case 1: 
				if(check) { 
					System.out.println("�� �� ����ϼ���"); 
					check = false; 
				} 
				break; 
			case 2: if(!check) {
					System.out.println("�й��ϼ���... ��ȸ�� 1�� ���Ҿ��"); 
					check = true; 
				}
				break; 
			case 3:
				if(check) { 
					System.out.println("������ ����Ǿ����."); 
					check = false; 
				} 
				return;
			default: 
				continue; 
			}
		}
	}
}