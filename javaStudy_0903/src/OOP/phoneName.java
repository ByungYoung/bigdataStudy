package OOP;

public class phoneName {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//클래스 -> 사용자 임의의 자료형
		//캡슐화(emcapsulation), 추상화(Abstract)를 통해 만들 수 있다
		//상속(Inheritance) : 재사용 + 확장, 다양성
		//재정의(오버라이딩)
		phone p1 = new phone();
		p1.setName("박병영");
		p1.setkind("IPHONE");
		p1.setphoneNum("01012345678");
		
		System.out.println(p1.getName());
		System.out.println(p1.getphoneNum());
		System.out.println(p1.getkind());
		p1.playGame();
		p1.map();
		
		phone p2 = new phone();
		p2.setName("hello");
		p2.setphoneNum("01011111111");
		p2.setkind("Galaxy");
		
		System.out.println(p2.getName());
		System.out.println(p2.getphoneNum());
		System.out.println(p2.getkind());
		p2.playGame();
		p2.map();
	}
}