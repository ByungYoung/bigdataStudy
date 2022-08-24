package javaStudy_0824;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int no = sc.nextInt();
//		sc.close();
//		
//		System.out.println(no+"는(은) "+(no % 2 != 0?"홀수":"짝수")+" 입니다.");
//		논리 연산자(AND, OR, NOT)
//		A AND B : A,B 둘다 참이어야 참
		System.out.println(2<5 && 2>1);
//		A OR B : A,B 둘 중 하나라도 참이면 참
		System.out.println(2<5 || 2<1);
//		NOT : 부정
		System.out.println(!(2>5));
	}
}