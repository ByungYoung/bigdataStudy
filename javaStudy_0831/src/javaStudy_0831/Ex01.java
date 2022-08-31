package javaStudy_0831;

public class Ex01 {
	public static void main(String[] args) {		
		for(int i = 2; i <= 30; i++) {
			System.out.print(i+ " ÀÇ ¾à¼ö: ");
			
			for(int j= 1; j <= i; j++) {
				if(i%j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.print('\n');
		}
	}
}