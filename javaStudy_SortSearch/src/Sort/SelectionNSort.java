package Sort;

public class SelectionNSort {
	public static void main(String[] args) {
		int[] array = { 8, 5, 3, 7, 2 };

		int size = array.length - 1;

		for (int i = 0; i < size; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < size + 1; j++) {
				int max = array[maxIndex];
				maxIndex = max < array[j] ? j : maxIndex;
			}
			
			if(maxIndex != i) {
				int temp = array[maxIndex];
				array[maxIndex] = array[i];
				array[i] = temp;
			}
		}

		for (int temp : array) {
			System.out.print(temp + "\t");
		}
	}
}