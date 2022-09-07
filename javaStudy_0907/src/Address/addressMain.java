package Address;

import java.util.ArrayList;
import java.util.Scanner;

public class addressMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		address ad1 = new address("�ں���", 1, "010-0000-1111");
		address ad2 = new address("�̿���", 2, "010-2222-3333");
		address ad3 = new address("������", 3, "010-4444-5555");
		address ad4 = new address("�輭��", 4, "010-6666-7777");
		address ad5 = new address("������", 5, "010-8888-9999");
		
		ArrayList<address> map = new ArrayList<address>();
		map.add(ad1); map.add(ad2); map.add(ad3); map.add(ad4); map.add(ad5);
		map.clear();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + 1 +" ��° ����� �ּҷ��Դϴ�\n");
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String name = sc.next();
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� >> ");
			String tel = sc.next();
			

			System.out.print("�ּҸ� �Է��ϼ��� >> ");
			int address = sc.nextInt();
			map.add(i,new address(name, address, tel));
			
			System.out.println("==================================");
		}
		
		for(int i = 0; i < map.size(); i++) {
			System.out.println(i + 1 +" ��° ����� �ּҷ��Դϴ�\n");
			System.out.printf("%d. %s(%s) : %d\n", i + 1, map.get(i).getName(),
														  map.get(i).getTel(),
														  map.get(i).getMail() );
			System.out.println("==================================");
		}
	}
}