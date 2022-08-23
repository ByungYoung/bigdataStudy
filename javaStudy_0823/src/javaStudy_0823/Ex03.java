package javaStudy_0823;

public class Ex03 {

	public static void main(String[] args) {
		//num1, num2
		int num1 = 10, num2 = 3;
		
		//연산자 우선순위 (수학과 동일)
		System.out.println("더한 결과 : " + (num1 + num2));
		//문자열 - 숫자 : JAVA에서 허용하지 않음
		System.out.println("뺀 결과 : " + (num1 - num2));
		System.out.println("곱한 결과 : " + num1 * num2);
		System.out.println("나눈 몫 : " + num1 / num2);
		System.out.println("나머지 : " + num1 % num2);
		//(변형시킬 자료형)변수명 : 변수를 강제로 형변환
		System.out.println("나눈 값 : " + (double)num1 / num2);
		
		int number1 = 10;
		String number2 = "3";
		//String : reference type
		//String->int : Integer.parseInt('바꾸고 싶은 문자열')
		System.out.println(number1+Integer.parseInt(number2));
	}
}