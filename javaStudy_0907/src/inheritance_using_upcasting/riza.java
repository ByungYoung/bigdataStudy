package inheritance_using_upcasting;

public class riza extends pocketmon {
	@Override
	public void pick() {
		// 추상 클래스를 상속 받은 하위클래스 반드시 추상 메소드를 오버라이딩 해야함
		// => 구현의 강제성
		System.out.println("리자몽을 뽑았습니다.");
	}
}