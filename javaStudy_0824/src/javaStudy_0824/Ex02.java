package javaStudy_0824;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int plus = num1+num2;	//두 수의 합
		int minus = num1-num2;	//두 수의 차
		int mul = num1*num2;	//두 수의 곱
		int div = num1/num2;	//두 수의 나누기
		
		System.out.println("두 수의 더하기 : " + plus);
		System.out.println("두 수의 빼기 : " + minus);
		System.out.println("두 수의 곱하기 : " + mul);
		System.out.println("두 수의 나누기(몫) : " + div);
		sc.close();
	}
}