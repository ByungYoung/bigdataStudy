package javaStudy_0901;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String[] team = {"�ں���", "�輭��", "������", "�̿���", "������"};
		String name = " ";
		int[] found = new int [2];
		Scanner sc = new Scanner(System.in);
		System.out.print("ã���� �̸��� �Է��ϼ��� >> ");
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
			System.out.println(name + "���� " + found[0] + "��° �ε����� �����մϴ�.");
		else
			System.out.println("�Է��Ͻ� ���� �������� �ʽ��ϴ�.");
		return;
	}
}