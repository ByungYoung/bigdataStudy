package inheritance_using_upcasting;

public class upcastingMain {
	public static void machine(pocketmon k) {
		k.pick();
		// 오버라이딩
		// 상속관걔에서 상위클래스에 설계된 메소드를 하위클래스에서 재정의
		// => 업캐스팅된 상태에서 오버라이딩한 메소드를 호출하면 하위클래스의 메소드가 실행됨.
	}
	
	public static void main(String[] args) {
		// Why Upcasting?
		// 인형뽑기 기계
		// 기계 - Main클래스 내 machine 메소드
		// 인형들 - 각각의 클래스로 구현
		//pocketmon p = new pocketmon();
		
		pairi p1 = new pairi();
		pika p2 = new pika();
		kko k = new kko();
		riza r = new riza();
		
		machine(p2); machine(r);
		/* machine(p2); machine(k); upcasting*/
	}
}