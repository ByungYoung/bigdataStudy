package OOP;

public class phone {
	private static String name;
	private static String phoneNum;
	private static String kind;
	
	public void playGame() {
		System.out.println("게임을 하다");
	}
	public void map() {
		System.out.println("지도를 보다");
	}
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		phone.name = name;
	}
	
	public static String getphoneNum() {
		return phoneNum;
	}
	public static void setphoneNum(String phoneNum) {
		phone.phoneNum = phoneNum;
	}
	

	public static String getkind() {
		return kind;
	}
	public static void setkind(String kind) {
		phone.kind = kind;
	}
}