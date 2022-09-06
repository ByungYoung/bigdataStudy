package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_team {
	public static void main(String[] args) {
		int size = 0;
		boolean find = true;
		String istrue = "y";
		ArrayList<String> team = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("전체팀원을 입력하세요 >> ");
		size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			System.out.printf("%d번쩨 팀원을 입력하세요 >> ", i + 1);
			team.add(sc.next());
		}
		
		for(int i = 0; i < team.size(); i++) {
			if(i==0)
				System.out.printf("팀 구성은 >>");
			System.out.printf(" %s ", team.get(i));
			if(i == team.size() - 1)
				System.out.printf("입니다.\n");
		}
		
		String deleteName = "";
		System.out.print("\n삭제할 팀원을 입력하세요 >> ");
		deleteName = sc.next();
		
		if(find) {
			System.out.print(deleteName + "님을 삭제하시겠습니까 ? (y/n) >> ");
			istrue = sc.next();
			if(istrue.equals("y") || istrue.equals("Y")) team.remove(deleteName);
		}
		
		else System.out.println("\n입력하신 이름이 팀에 존재하지 않습니다.");
		
		for(int i = 0; i < team.size(); i++) {
			if(i==0)
				System.out.print("팀 구성은 >> ");
			System.out.printf(" %s ", team.get(i));
			if(i==team.size()-1)
				System.out.printf("입니다.");
		}
	}
}