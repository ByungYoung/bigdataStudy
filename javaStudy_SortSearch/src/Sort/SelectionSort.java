package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		String[] fruits = { "포도", "사과", "복숭아", "키위", "멜론" };

		int size = fruits.length - 1;

		for (int i = 0; i < size; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < size; j++) {
				String max = fruits[maxIndex];
				maxIndex = max.compareTo(fruits[j]) < 0 ? j : maxIndex;
			}
			if(maxIndex != i) {
				String temp = fruits[maxIndex];
				fruits[maxIndex] = fruits[i];
				fruits[i] = temp;
			}
		}

		for (String temp : fruits) {
			System.out.print(temp + "\t");
		}
	}
}