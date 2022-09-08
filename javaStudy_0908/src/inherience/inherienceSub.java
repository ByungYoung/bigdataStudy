package inherience;

public class inherienceSub extends inherienceSuper {
	inherienceSub() {
		super(); // <- 상위클래스의 생성자 호출하는 명령어
		/*
		 * super()는 반드시 생성자에서만 호출 가능 super()는 반드시 맨 첫출에만 사용 가능 상위클래스의 생성자에 매개변수가 없으면
		 * super() 생략가능
		 */
		System.out.println("Sub 생성자 실행!");
	}
	
	public void waffle() {
		System.out.println("와플 레시피");
	}
	
	@Override
	public void coffee() {
		System.out.println("1호점");
	}
}