package arrayList;

import java.util.ArrayList;

public class Ex01_arrayList {
	public static void main(String[] args) {
		// 1. 선언 및 생성
		// 배열
		int arr[] = new int[5];
		
		// ArrayList(가변리스트)
		// Generic
		// ArrayList<dataType> var = new ArrayList<dataType>()
		// import java.util.ArrayList
		// () : 메소드를 사용하여 생성
		// 데이터타입 -> 객체타입으로 존재
		// int -> Integer,char -> Character, double -> Double, boolean -> Boolean
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		System.out.println("배열의 길이 " + arr.length);
		System.out.println("ArrayList 길이 " + arrList.size());
		
		// 2. 값 추가(add)
		// 배열
		arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5; 
		
		// ArrayList -> 번수명.add(value);
		//				변수명.add(index,value);
		arrList.add(0); arrList.add(1); arrList.add(2); arrList.add(3); arrList.add(4);
		
		System.out.println("값 추가 후 배열의 길이 " + arr.length);
		System.out.println("값 추가 후 ArrayList 길이 " + arrList.size());
		
		// 3. 값 조회(get)
		// 배열
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		// ArrayList
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + "\t");
		}
		System.out.println();
		
		// 4. 값 삭제(remove)
		// ArrayList -> 변수명.remove(index)
		//				변수명.clear() 변수명.removeAll()
		arrList.remove(4);
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + "\t");
		}
		System.out.println();
		arrList.clear();
		System.out.println("값 전부 삭제 후 ArrayList 길이 " + arrList.size());
	}
}