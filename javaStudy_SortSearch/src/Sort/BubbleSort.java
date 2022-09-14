package Sort;

public class BubbleSort {
	public static void main(String[] args) {
		String[] fruits = { "����", "���", "������", "Ű��", "���" };

		int size = fruits.length - 1;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (fruits[j].compareTo(fruits[j + 1]) > 0) {
					// ���� - ���� > 0 ���� ���ڰ� �� �ڿ� ����
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