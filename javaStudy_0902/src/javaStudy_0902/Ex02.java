package javaStudy_0902;

public class Ex02 {
	public static void main(String[] args) {
		int count = 0;
		int[][] array = new int [5][5];
		int verLen = array[0].length;
		int parLen = array.length;
		
		//������� (�� -> ��)
		for(int i = 0; i < parLen; i++) {
			for(int j = 0; j < verLen; j++) {
				array[i][j] = ++count;
			}
		}
		
		for(int i = 0; i < parLen; i++) {
			for(int j = 0; j < verLen; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		//������� (�� -> �Ʒ�)
		for(int i = 0; i < parLen; i++) {
			for(int j = 0; j < verLen; j++) {
				array[j][i] = ++count;
			}
		}
		
		for(int i = 0; i < parLen; i++) {
			for(int j = 0; j < verLen; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}