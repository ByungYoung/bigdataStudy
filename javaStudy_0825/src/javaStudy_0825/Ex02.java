package javaStudy_0825;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0, changeNum = 0;
		
		System.out.print("���� �Է� >> ");
		num = sc.nextInt();
		sc.close();
		
		if(num % 10 >= 0 && num % 10 < 5) changeNum = num / 10 * 10;
		else changeNum = (num / 10 + 1) * 10;
		
		System.out.println("�� �ø� �� : " + changeNum);
	}
}