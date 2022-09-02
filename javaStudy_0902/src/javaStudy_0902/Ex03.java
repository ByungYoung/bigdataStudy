package javaStudy_0902;

public class Ex03 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int count = 20;
//		//순서 (오른쪽 아래 -> 왼쪽 위)
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				array[j][i] = ++count;
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][array[i].length-1-j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		count = 20;
//		//순서 (우 -> 좌)
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				array[i][j] = ++count;
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][array[i].length-1-j] + "\t");
//			}
//			System.out.println();
//		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = ++count;
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
			}
			else {
				for(int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][array[i].length - 1 - j] + "\t");
				}
			}
			System.out.println();
		}
	}
}