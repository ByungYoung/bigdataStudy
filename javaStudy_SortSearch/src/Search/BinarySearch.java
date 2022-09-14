package Search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 12, 15, 18, 20, 23, 25 };

		int target = 5;
		int start = 0;
		int end = array.length - 1;
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;

			if (array[mid] == target) {
				System.out.println(mid + "��°�� �ִ�!!");
				return;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println("������� �����ϴ�.");
	}
}