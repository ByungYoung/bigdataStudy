package javaStudy_0903;

public class Ex_practice {
	public static void ch1(int num) {
		num = 30;
	}
	
	public static void ch2(int[] numArray) {
		numArray[0] = 30;
	}
	public static void main(String[] args) {
		int num = 10;
		int[] numArray = {10, 20};
		ch1(num);		//call-by-value
		ch2(numArray);	//call-by-reference
	}
}