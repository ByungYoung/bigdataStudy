package inherience;

public class inherienceMain {
	public static void main(String[] args) {
		/*
		 * 1. 상속을 받으면 상위 클래스의 기능을 물려 받는다.
		 * 
		 * inherienceSub store2 = new inherienceSub(); store2.coffee(); store2.waffle();
		 * 
		 * 2. 하위클래스 타입의 객체는 상위 클래스 타입으로 행변환이 가능하다. => UpCasting(자동 형변환) inherienceSuper
		 * store3 = new inherienceSub();
		 * 
		 * 상위클래스로 업캐스팅 된 객체는 다시 하위클래스 타입으로 형변환 가능 => 명시적 형변환(강제 형변환)
		 * ((inherienceSub)store3).waffle(); //DownCasting
		 * 
		 * 3. 메소드 오버라이딩 (재정의) : 상위 클래스에 설계된 메소드를 하위클래스에서 재정의 => 업캐스팅 되어있는 상태에서 오버라이딩된
		 * 메소드를 호출하면 하위 메소드 실행 store3.coffee(); //UpCasting
		 * 
		 * 4. 메소드 오버로딩(중복정의) : 한 클래스 내에서 메소드의 이름을 동일하게 정의하는 것 => 중복정의(매개변수의 타입이나 개수를
		 * 다르게) inherienceSuper store4 = new inherienceSub2(); store4.coffee();
		 * 
		 * 5. 추상 메소드가 1개 이상있는 클래스 => 추상클래스 모든 하위클래스에서 오버라이딩 -> 공통된 메소드가 존재 모든 하위클래스는 해당
		 * 메소드를 오버라이딩 해야함 => 구현의 강제성 추상클래스 객체생성 불가 업캐스팅 용도로만 사용 => 규격 store4.water();
		 * 
		 * 6. 메소드가 모두 abstract => Interface 추상클래스 : 추상메소드 + 일반 메소드 인터페이스 : 추상메소드만 존재 상속
		 * 키워드 : extends 인터페이스 키워드 : implements
		 * 
		 * 7. 상속관계에서의 생성자 생성자 메소드란?? 일반적 메소드는 호출해야 실행됨. 하지만, 생성자 메소드는 객체를 생성할 때 함께 딱한번 실행됨
		 * 메소드의 이름이 클래스의 이름과 같다. 리턴 타입을 명시하지 않음.
		 * - 객체를 생성할 때 함께 호출되는 특징 때문에 주로 필드(클래스 속성)를 초기화(메모리 할당 후 최초로 값을 지정)할 때 사용
		 */
		inherienceSub s1 = new inherienceSub();
		inherienceSub s2 = new inherienceSub();
		/*
		 * 생성자가 실행될때 상위클래스의 생성자를 먼저 실행한다.
		 * 상위클래스에 매개변수가 있는 생성자가 있다면 하위클래스에서 반드시 호출해야함.
		 * => 상위클래스의 생성자 호출 명령어는 하위클래스 생성자 에서만 가능.
		 */
	}
}