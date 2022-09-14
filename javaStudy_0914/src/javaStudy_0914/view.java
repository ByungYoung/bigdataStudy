package javaStudy_0914;

import java.util.ArrayList;
import java.util.Scanner;

public class view {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		controller ct = new controller();

		while (true) {
			System.out.print("[1] ��� [2] ��ȸ [3] ���� [4] ���� [5] ���� >> ");
			int choice;
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("====���====");
				System.out.print("NAME : ");
				String name = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();
				System.out.print("ADDRESS : ");
				String address = sc.next();
				System.out.print("PHONENUM : ");
				String phonenum = sc.next();

				int cnt = ct.insert(name, age, address, phonenum);

				if (cnt > 0) {
					System.out.println("��� ����");
				} else {
					System.out.println("��� ����");
				}
				break;
			case 2:
				System.out.println("====��ü��ȸ====");
				ArrayList<model> list = ct.select();

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getName() + "/");
					System.out.print(list.get(i).getAge() + "/");
					System.out.print(list.get(i).getAddress() + "/");
					System.out.println(list.get(i).getPhonenum());
				}
				break;
			case 3:
				System.out.println("====����====");
	            System.out.print("AGE : ");
	            int age2 = sc.nextInt();
	            System.out.print("NAME : ");
	            String name2 = sc.next();

	            int cnt1 = ct.update(name2, age2);

	            if (cnt1 > 0) {
	               System.out.println("���� ����");
	            } else {
	               System.out.println("���� ����");
	            }
	            break;
			case 4: 
				System.out.println("====����====");
				// ������ ID�� �Է¹޾� ������ ID�� ���� �༮�� �����Ͻÿ�
				System.out.print("NAME : ");
				String name3 = sc.next();

				int cnt2 = ct.delete(name3);

				if (cnt2 > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է��� �ּ���");
				break;
			}
		}
	}
}