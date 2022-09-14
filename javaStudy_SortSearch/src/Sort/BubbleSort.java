package Sort;

public class BubbleSort {
	public static void main(String[] args) {
		String[] fruits = { "포도", "사과", "복숭아", "키위", "멜론" };

		int size = fruits.length - 1;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (fruits[j].compareTo(fruits[j + 1]) > 0) {
					// 글자 - 글자 > 0 앞의 글자가 더 뒤에 있음
					String temp = fruits[j];
					fruits[j] = fruits[j + 1];
					fruits[j + 1] = temp;
				}
			}
		}

		for (String temp : fruits) {
			System.out.print(temp + "\t");
		}
	}
}