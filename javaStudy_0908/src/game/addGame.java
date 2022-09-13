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
		
		while(true) {
			num1 = random.nextInt(50) + 1;
			num2 = random.nextInt(50) + 1;
			System.out.printf("%d + %d = ", num1, num2);
			result = sc.nextInt();
			
			if(result == add(num1, num2)) System.out.println("Success!!");
			else {
				count++;
				switch(count) { 
				case 1: 
					System.out.println("좀 더 노력하세요"); 
					break; 
				case 2:
					System.out.println("분발하세요... 기회가 1번 남았어요"); 
					break; 
				case 3:
					System.out.println("게임이 종료되었어요."); 
					return;
				default: 
					continue; 
				}
			}
		}
	}
}