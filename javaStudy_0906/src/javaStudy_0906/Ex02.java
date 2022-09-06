package javaStudy_0906;

public class Ex02 {
	public static void main(String[] args) {
		String[] team = {"박병영", "이영광", "김유진", "김서은", "정다은"};
		String[] food = {"피자", "치킨", "족발"};
		
		food = team;
		food[4] = "참치회";
		
		// for -each, 확장 for
		// for(임시변수 : 배열이름) : 배열의 원소를 한개씩 꺼냄
		
		for(String temp : team) {
			System.out.print(temp + " ");
		}
	}
}