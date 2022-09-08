package inherience;

public abstract class inherienceSuper {
	inherienceSuper(){
		System.out.println("Super 생성자 호출!");
	}
	
	public abstract void coffee();
	public void water() {
		System.out.println("Regular Water");
	}
}