package javaStudy_0914;

import java.util.ArrayList;
import java.util.Scanner;

public class view {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		controller ct = new controller();

		while (true) {
			System.out.print("[1] 등록 [2] 조회 [3] 수정 [4] 삭제 [5] 종료 >> ");
			int choice;
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("====등록====");
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
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}
				break;
			case 2:
				System.out.println("====전체조회====");
				ArrayList<model> list = ct.select();

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getName() + "/");
					System.out.print(list.get(i).getAge() + "/");
					System.out.print(list.get(i).getAddress() + "/");
					System.out.println(list.get(i).getPhonenum());
				}
				break;
			case 3:
				System.out.println("====수정====");
	            System.out.print("AGE : ");
	            int age2 = sc.nextInt();
	            System.out.print("NAME : ");
	            String name2 = sc.next();

	            int cnt1 = ct.update(name2, age2);

	            if (cnt1 > 0) {
	               System.out.println("수정 성공");
	            } else {
	               System.out.println("수정 실패");
	            }
	            break;
			case 4: 
				System.out.println("====삭제====");
				// 삭제할 ID를 입력받아 동일한 ID를 가진 녀석을 삭제하시오
				System.out.print("NAME : ");
				String name3 = sc.next();

				int cnt2 = ct.delete(name3);

				if (cnt2 > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력해 주세요");
				break;
			}
		}
	}
}