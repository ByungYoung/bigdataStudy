package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.memberVO;
import Controller.DAO;

public class main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// DB와 관련된 일을 수행하는 객체
		DAO dao = new DAO();

		while (true) {
			System.out.print("1.등록 2.조회 3.수정 4.삭제 5.종료 6.개별조회 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====등록====");
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
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}

			} else if (choice == 2) {
				System.out.println("====전체조회====");

				ArrayList<memberVO> list = dao.select();

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getId() + "/");
					System.out.print(list.get(i).getPw() + "/");
					System.out.print(list.get(i).getName() + "/");
					System.out.println(list.get(i).getNick() + "/");
				}

			} else if (choice == 3) {
				System.out.println("====수정====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();

				int cnt = dao.update(id, nick);

				if (cnt > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

			} else if (choice == 4) {
				System.out.println("====삭제====");
				// 삭제할 ID를 입력받아 동일한 ID를 가진 녀석을 삭제하시오
				System.out.print("ID : ");
				String id = sc.next();

				int cnt = dao.delete(id);

				if (cnt > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}

			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 6) {
				System.out.println("====개별조회====");
				System.out.print("ID : ");
				String searchId = sc.next();

				memberVO vo = dao.selectOne(searchId);

				if (vo != null) {
					System.out.println(vo.getId() + "/" + vo.getPw() + "/" + vo.getName() + "/" + vo.getNick());
				} else {
					System.out.println("존재하지 않습니다.");
				}

			}
		}
	}
}