package javaStudy_0824;

public class Ex04 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		int num3 = 50;
		num3 = num3 + num2;
		num1 += num3; // 복합대입연산자
		System.out.println(num1);
		//증감 연산자(++, --)
		int num4 = 100;
		//후위연산 : 한 줄이 끝나고 실행
		num4++;
		//전위연산 : 한줄에서 제일 먼저 실행
		System.out.println(++num4);
		//삼항연산 : 항이 3개 > 조건 ? 참 : 거짓
		//System.out.println(10<5?10:5);
	}
}