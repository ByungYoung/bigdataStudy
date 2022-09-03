package OOP;

public class studentScore {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		student s1 = new student();
		s1.setname("È«±æµ¿");
		s1.setnumber("20150675");
		s1.setage(22);
		s1.scoreJava = 50;
		s1.scoreAndroid = 77;
		s1.scoreWeb = 89;
		s1.show();
		
		student s2 = new student();
		s2.setname("±è¿µÈñ");
		s2.setnumber("20090541");
		s2.setage(29);
		s2.scoreJava = 90;
		s2.scoreAndroid = 30;
		s2.scoreWeb = 25;
		s2.show();
		
		return;
	}
}