package javaStudy_0902;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int count = 0;
		int[][] array = new int [5][5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = ++count;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}