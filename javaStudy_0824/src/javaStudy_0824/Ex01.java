package javaStudy_0824;

public class Ex01 {
	public static void main(String[] args) {
		int orange = 3729;
		int number = 52;
		int box = orange / number;
		System.out.println("김모씨가 귤 박스를 줄 수 있는 박스의 수 "+box+"개");
		System.out.println("남은 귤 수 : " + orange%number);
	}
}