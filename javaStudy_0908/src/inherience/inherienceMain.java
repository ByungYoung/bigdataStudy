package inherience;

public class inherienceMain {
	public static void main(String[] args) {
		// 1. 상속을 받으면 상위 클래스의 기능을 물려 받는다.
		inherienceSuper store1 = new inherienceSuper();
		store1.coffee();
		
		inherienceSub store2 = new inherienceSub();
		store2.coffee();
		store2.waffle();
		
		// 2. 하위클래스 타입의 객체는 상위 클래스 타입으로 행변환이 가능하다.
		// => UpCasting(자동 형변환)
		inherienceSuper store3 = new inherienceSub();
		
		// 상위클래스로 업캐스팅 된 객체는 다시 하위클래스 타입으로 형변환 가능
		// => 명시적 형변환(강제 형변환)
		((inherienceSub)store3).waffle();	//DownCasting
		
		// 3. 메소드 오버라이딩 (재정의) : 상위 클래스에 설계된 메소드를 하위클래스에서 재정의
		// => 업캐스팅 되어있는 상태에서 오버라이딩된 메소드를 호출하면 하위 메소드 실행
		store3.coffee();				//UpCasting
		
		// 4. 메소드 오버로딩(중복정의) : 한 클래스 내에서 메소드의 이름을 동일하게 정의하는 것
		// => 중복정의(매개변수의 타입이나 개수를 다르게)
	}
}