package javaStudy_0906;

public class Ex02 {
	public static void main(String[] args) {
		String[] team = {"�ں���", "�̿���", "������", "�輭��", "������"};
		String[] food = {"����", "ġŲ", "����"};
		
		food = team;
		food[4] = "��ġȸ";
		
		// for -each, Ȯ�� for
		// for(�ӽú��� : �迭�̸�) : �迭�� ���Ҹ� �Ѱ��� ����
		
		for(String temp : team) {
			System.out.print(temp + " ");
		}
	}
}