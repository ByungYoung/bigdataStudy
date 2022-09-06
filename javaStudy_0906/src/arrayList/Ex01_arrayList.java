package arrayList;

import java.util.ArrayList;

public class Ex01_arrayList {
	public static void main(String[] args) {
		// 1. ���� �� ����
		// �迭
		int arr[] = new int[5];
		
		// ArrayList(��������Ʈ)
		// Generic
		// ArrayList<dataType> var = new ArrayList<dataType>()
		// import java.util.ArrayList
		// () : �޼ҵ带 ����Ͽ� ����
		// ������Ÿ�� -> ��üŸ������ ����
		// int -> Integer,char -> Character, double -> Double, boolean -> Boolean
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		System.out.println("�迭�� ���� " + arr.length);
		System.out.println("ArrayList ���� " + arrList.size());
		
		// 2. �� �߰�(add)
		// �迭
		arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5; 
		
		// ArrayList -> ������.add(value);
		//				������.add(index,value);
		arrList.add(0); arrList.add(1); arrList.add(2); arrList.add(3); arrList.add(4);
		
		System.out.println("�� �߰� �� �迭�� ���� " + arr.length);
		System.out.println("�� �߰� �� ArrayList ���� " + arrList.size());
		
		// 3. �� ��ȸ(get)
		// �迭
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		// ArrayList
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + "\t");
		}
		System.out.println();
		
		// 4. �� ����(remove)
		// ArrayList -> ������.remove(index)
		//				������.clear() ������.removeAll()
		arrList.remove(4);
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + "\t");
		}
		System.out.println();
		arrList.clear();
		System.out.println("�� ���� ���� �� ArrayList ���� " + arrList.size());
	}
}