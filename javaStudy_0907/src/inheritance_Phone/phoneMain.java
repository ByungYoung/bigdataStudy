package inheritance_Phone;

public class phoneMain {
	public static void main(String[] args) {
		phone phone = new phone();
		phone.call();
		phone.send();
		phone.sms();
		
		// 1. ����� ������ ���� Ŭ������ �Ӽ��� ����� ��� ���� ����.
		FeaturePhone feature = new FeaturePhone();
		feature.call();
		feature.send();
		feature.sms();
		
		smartPhone smart = new smartPhone();
		smart.call();
		smart.send();
		smart.sms();
		smart.wifi();
		
		// 2. ��Ӱ��迡�� ����Ŭ������ ��ü�� ����Ŭ���� Ÿ������ ����ȯ�� ����(��ĳ����)
		phone p1 = new ios();
		
		ios iPhone = new ios();
		iPhone.call();	// smartPhone ��ü�� ����� phone ��ü�� ���� ���
		iPhone.send();	// smartPhone ��ü�� ����� phone ��ü�� ���� ���
		iPhone.sms();	// smartPhone ��ü�� ����� phone ��ü�� ���� ���
		iPhone.wifi();	// smartPhone ��ü�� ���� ���
		iPhone.siri();
	}
}