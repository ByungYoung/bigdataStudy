package inheritance_Phone;

public class phoneMain {
	public static void main(String[] args) {
		phone phone = new phone();
		phone.call();
		phone.send();
		phone.sms();
		
		// 1. 상속을 받으면 상위 클래스의 속성과 기능을 모두 물려 받음.
		FeaturePhone feature = new FeaturePhone();
		feature.call();
		feature.send();
		feature.sms();
		
		smartPhone smart = new smartPhone();
		smart.call();
		smart.send();
		smart.sms();
		smart.wifi();
		
		// 2. 상속관계에서 하위클래스의 객체는 상위클래스 타입으로 형변환이 가능(업캐스팅)
		phone p1 = new ios();
		
		ios iPhone = new ios();
		iPhone.call();	// smartPhone 객체가 상속한 phone 객체로 부터 상속
		iPhone.send();	// smartPhone 객체가 상속한 phone 객체로 부터 상속
		iPhone.sms();	// smartPhone 객체가 상속한 phone 객체로 부터 상속
		iPhone.wifi();	// smartPhone 객체로 부터 상속
		iPhone.siri();
	}
}