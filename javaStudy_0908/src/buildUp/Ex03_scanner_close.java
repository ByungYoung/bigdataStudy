package buildUp;

import java.util.Scanner;

public class Ex03_scanner_close {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("달러 입력 : ");
			int input = sc.nextInt();
			if(input == -1) {
				break;
			}else {
				System.out.println(input * 1380 + "원 입니다.");
			}	
		}
		sc.close();
	}
}