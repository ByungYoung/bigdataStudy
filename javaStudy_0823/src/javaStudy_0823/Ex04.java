package javaStudy_0823;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		//사용자로 부터 데이터를 입력 받을 수 있는 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 >> ");
		int num = sc.nextInt();
		//nextInt(): 사용자로 부터 입력을 받은 값을 정수로 인식
		int result = num/10*10;
		System.out.println("계산 결과 >> "+result);
	}
}