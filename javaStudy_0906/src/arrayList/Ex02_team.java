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
		System.out.printf("��ü������ �Է��ϼ��� >> ");
		size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			System.out.printf("%d���� ������ �Է��ϼ��� >> ", i + 1);
			team.add(sc.next());
		}

		System.out.printf("�� ������ >>");
		for(String index : team) {
			System.out.print(team);
		}
		System.out.printf("�Դϴ�.\n");
		String deleteName = "";
		System.out.print("\n������ ������ �Է��ϼ��� >> ");
		deleteName = sc.next();
		
		if(find) {
			System.out.print(deleteName + "���� �����Ͻðڽ��ϱ� ? (y/n) >> ");
			istrue = sc.next();
			if(istrue.equals("y") || istrue.equals("Y")) team.remove(deleteName);
		}
		
		else System.out.println("\n�Է��Ͻ� �̸��� ���� �������� �ʽ��ϴ�.");
		
		for(int i = 0; i < team.size(); i++) {
			if(i==0)
				System.out.print("�� ������ >> ");
			System.out.printf(" %s ", team.get(i));
			if(i==team.size()-1)
				System.out.printf("�Դϴ�.");
		}
	}
}