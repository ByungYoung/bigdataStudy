package javaStudy_0831;

public class Ex04 {
	public static void main(String[] args) {
		int countOdd = 0, countEven = 0;
		int[] numArray = {11,16,13,54,91};

		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2==0) {
				countOdd++;
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.println("礎熱曖 偃熱 : " + countOdd);

		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2==1) {
				countEven++;
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.println("�汝鶺� 偃熱 : " + countEven);
	}
}