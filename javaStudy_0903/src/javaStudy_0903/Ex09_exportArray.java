package javaStudy_0903;

import java.util.Arrays;

public class Ex09_exportArray {
	public static void arraytoString(int[] arr) {
		System.out.println("배열의 정보 >> " + Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		arraytoString(array);
	}
}