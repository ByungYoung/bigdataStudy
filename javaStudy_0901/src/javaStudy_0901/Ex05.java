package javaStudy_0901;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int menu = 0;
		boolean success = false;
		
		String newId, newPw;
		String[] id = new String[3];
		String[] pw = new String[3];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		id[0] = "�ں���";
		pw[0] = "1234";
		
		id[1] = "BigData";
		pw[1] = "1209";
		
		while(true) {
			System.out.print("[1]ȸ������ [2]�α��� [3]���� >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("============ȸ������============");

				System.out.print("����� ID�� �Է��� �ּ��� >> ");
				id[2] = sc.next();
				
				System.out.print("����� PW�� �Է��� �ּ��� >> ");
				pw[2] = sc.next();
				
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.\n");
				break;
			case 2:
				System.out.println("============�α���============");
				
				System.out.print("����� ID�� �Է��� �ּ��� >> ");
				newId = sc.next();
				
				System.out.print("����� PW�� �Է��� �ּ��� >> ");
				newPw = sc.next();
				
				for(int i = 0; i < id.length; i++) {
					if(newId.equals(id[i]) && newPw.equals(pw[i])) {
						success = true;
						System.out.println("�α��ο� �����Ͽ����ϴ�.");
						System.out.println("���α׷��� �����մϴ�.\n");
						break;
					}
				}
				
				if(!success) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.\n");
					return;
				}
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�!\n");
				return;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.\n");
				break;
			}
		}
	}
}