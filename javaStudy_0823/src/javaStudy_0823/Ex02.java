package javaStudy_0823;

public class Ex02 {

	public static void main(String[] args) {
		//변수명 규칙
		//1. 특수기호 사용불가 : 예외(_)
		//2. 키워드 사용 불가
		//3. 띄어쓰기 불가
		//4. 숫자로 시작 불가
		//5. 변수명 재선언 불가
		//Camel 표기법(int stringBuffer), Snake 표기법(int string_buffer)
		
		//변수(Variable) : 변할 수 있는 값
		int a = 5;			//정수형 변수 선언 및 초기화
		System.out.println(a);
		char b = 97;		//문자열 변수 선언 및 초기화
		System.out.println(b);
		float c = 10.5f;	//소수값 저장 키워드 : float, double
		double num1 = 10.5;
		int num = 30;
		//데이터 연산 시 : 더 큰 자료형으로 형 변환
		System.out.println(c+num1+num);
	}
}