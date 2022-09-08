package buildUp;

public class Ex01_divide_0 {
	public static void main(String[] args) {
		/*
		 * 1. compile 오류 | 문법적 오류 System.out.prinl("출력문");
		 * 
		 * 2. Runtime 오류 | 실행시 나타나는 오휴 try 예외처리 문구 catch 예외발생시 오류 잡아주는 역할
		 * System.out.println(100/0); System.out.println("다음 코드");
		 */
		
		try {
			System.out.println(100/0);
		} catch(ArithmeticException e){
			System.out.println("수학적 오류 발생");
		}
	}
}