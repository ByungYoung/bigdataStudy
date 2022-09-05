package bank;

public class Ex_temp {
	public static void temp(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int num = 10;
		int num2 = 5;
		
		temp(num, num2);
	}
}