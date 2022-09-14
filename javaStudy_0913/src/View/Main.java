package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.DAO;
import Model.memberVO;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();

		while (true) {
			System.out.print("[1] ��� [2] ��ȸ [3] ���� [4] ���� [5] ���� [6] ���� ��ȸ >> ");
			int choice;
			choice = sc.nextInt();
			switch (choice) {
			case 1:
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
				break;
			case 2:
				System.out.println("====��ü��ȸ====");
				ArrayList<memberVO> list = dao.select();

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getId() + "/");
					System.out.print(list.get(i).getPw() + "/");
					System.out.print(list.get(i).getName() + "/");
					System.out.println(list.get(i).getNick());
				}
				break;
			case 3:
				System.out.println("====����====");
	            System.out.print("ID : ");
	            String id1 = sc.next();
	            System.out.print("NICK : ");
	            String nick1 = sc.next();

	            int cnt1 = dao.update(id1, nick1);

	            if (cnt1 > 0) {
	               System.out.println("���� ����");
	            } else {
	               System.out.println("���� ����");
	            }
	            break;
			case 4: 
				System.out.println("====����====");
				// ������ ID�� �Է¹޾� ������ ID�� ���� �༮�� �����Ͻÿ�
				System.out.print("ID : ");
				String id2 = sc.next();

				int cnt2 = dao.delete(id2);

				if (cnt2 > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			case 6:
				System.out.println("====������ȸ====");
				System.out.print("ID : ");
				String searchId = sc.next();

				memberVO vo = dao.selectOne(searchId);

				if (vo != null) {
					System.out.println(vo.getId() + "/" 
										+ vo.getPw() + "/" 
										+ vo.getName() + "/" 
										+ vo.getNick());
				} else {
					System.out.println("�������� �ʽ��ϴ�.");
				}
				break;
			default:
				System.out.println("�ٽ� �Է��� �ּ���");
				break;
			}
		}
	}
}