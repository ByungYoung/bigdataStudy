package javaStudy_0903;

import java.util.Scanner;

public class Ex01_method_cal {
	public static int op(int a, char op, int b) {
		switch(op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '%':
			return a % b;
		}
		return 0;
	}
	public static double op1(int a, char op, int b) {
		if(op == '/')
			return (double) a/b;
		return op(a,op,b);
	}
	
	public static void main(String[] args) {
		int a, b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 입니다.");
		
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		a = sc.nextInt();

		System.out.print("연산자를 입력하세요 >> ");
		op = sc.next().charAt(0);
		
		System.out.print("두번째 숫자를 입력하세요 >> ");
		b = sc.nextInt();
		sc.close();

		System.out.println("결과 >> " + op1(a,op,b));
		return;
	}
}