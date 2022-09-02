package javaStudy_0902;

public class Ex03 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int count = 20;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[j][i] = ++count;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}