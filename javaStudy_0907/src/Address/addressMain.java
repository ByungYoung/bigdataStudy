package Address;

import java.util.ArrayList;
import java.util.Scanner;

public class addressMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		address ad1 = new address("박병영", 1, "010-0000-1111");
		address ad2 = new address("이영광", 2, "010-2222-3333");
		address ad3 = new address("김유진", 3, "010-4444-5555");
		address ad4 = new address("김서은", 4, "010-6666-7777");
		address ad5 = new address("정다은", 5, "010-8888-9999");
		
		ArrayList<address> map = new ArrayList<address>();
		map.add(ad1); map.add(ad2); map.add(ad3); map.add(ad4); map.add(ad5);
		map.clear();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + 1 +" 번째 사람의 주소록입니다\n");
			System.out.print("이름을 입력하세요 >> ");
			String name = sc.next();
			System.out.print("전화번호을 입력하세요 >> ");
			String tel = sc.next();
			

			System.out.print("주소를 입력하세요 >> ");
			int address = sc.nextInt();
			map.add(i,new address(name, address, tel));
			
			System.out.println("==================================");
		}
		
		for(int i = 0; i < map.size(); i++) {
			System.out.println(i + 1 +" 번째 사람의 주소록입니다\n");
			System.out.printf("%d. %s(%s) : %d\n", i + 1, map.get(i).getName(),
														  map.get(i).getTel(),
														  map.get(i).getMail() );
			System.out.println("==================================");
		}
	}
}