package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.memberVO;
import Controller.DAO;

public class main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// DB�� ���õ� ���� �����ϴ� ��ü
		DAO dao = new DAO();

		while (true) {
			System.out.print("1.��� 2.��ȸ 3.���� 4.���� 5.���� 6.������ȸ >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====���====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NAME : ");
				String name = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();

				int cnt = dao.insert(id, pw, name, nick);

				if (cnt > 0) {
					System.out.println("��� ����");
				} else {
					System.out.println("��� ����");
				}

			} else if (choice == 2) {
				System.out.println("====��ü��ȸ====");

				ArrayList<memberVO> list = dao.select();

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getId() + "/");
					System.out.print(list.get(i).getPw() + "/");
					System.out.print(list.get(i).getName() + "/");
					System.out.println(list.get(i).getNick() + "/");
				}

			} else if (choice == 3) {
				System.out.println("====����====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();

				int cnt = dao.update(id, nick);

				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}

			} else if (choice == 4) {
				System.out.println("====����====");
				// ������ ID�� �Է¹޾� ������ ID�� ���� �༮�� �����Ͻÿ�
				System.out.print("ID : ");
				String id = sc.next();

				int cnt = dao.delete(id);

				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}

			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (choice == 6) {
				System.out.println("====������ȸ====");
				System.out.print("ID : ");
				String searchId = sc.next();

				memberVO vo = dao.selectOne(searchId);

				if (vo != null) {
					System.out.println(vo.getId() + "/" + vo.getPw() + "/" + vo.getName() + "/" + vo.getNick());
				} else {
					System.out.println("�������� �ʽ��ϴ�.");
				}

			}
		}
	}
}