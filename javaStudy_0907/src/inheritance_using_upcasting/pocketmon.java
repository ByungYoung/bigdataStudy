package inheritance_using_upcasting;

public abstract class pocketmon {
	// 모든 pocketmon 등릉 pick 메소드가 존재
	// 동작은 하위클래스에서 결정 (오버라이딩 필수적으로 발생)
	// 추상클래스, 추상메소드	
	
	// 추상메소드를 하나 이상 포함하고 있는 클래스 = 추상클래스
	public abstract void pick();
}