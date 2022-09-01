package javaStudy_0901;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String[] team = {"박병영", "김서은", "김유진", "이영광", "정다은"};
		String name = " ";
		int[] found = new int [2];
		Scanner sc = new Scanner(System.in);
		System.out.print("찾으실 이름을 입력하세요 >> ");
		name = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < team.length; i++) {
			if(team[i].equals(name)){
				found[0] = i;
				found[1] = 1;
				break;
			}
		}
		if(found[1] == 1)
			System.out.println(name + "님은 " + found[0] + "번째 인덱스에 존재합니다.");
		else
			System.out.println("입력하신 값이 존재하지 않습니다.");
		return;
	}
}