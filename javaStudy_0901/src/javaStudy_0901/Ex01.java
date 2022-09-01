package javaStudy_0901;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 8, 10, 7, 45, 38, 22, 68, 55, 41, 87};
		int max = arr[0];
		int min = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("가장 큰 수는 " + max + " 입니다.");
		for(int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
	}
}