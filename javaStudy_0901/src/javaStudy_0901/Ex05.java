package javaStudy_0901;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int menu = 0, success = 0;
		String newId,newPw;
		String[] id = new String[3];
		String[] pw = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		id[0] = "박병영";
		pw[0] = "1234";
		
		id[1] = "BigData";
		pw[1] = "1209";
		
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("============회원가입============");

				System.out.print("사용할 ID를 입력해 주세요 >> ");
				id[2] = sc.next();
				
				System.out.print("사용할 PW를 입력해 주세요 >> ");
				pw[2] = sc.next();
				
				System.out.println("회원가입이 완료되었습니다.\n");
				break;
			case 2:
				System.out.println("============로그인============");
				
				System.out.print("사용할 ID를 입력해 주세요 >> ");
				newId = sc.next();
				
				System.out.print("사용할 PW를 입력해 주세요 >> ");
				newPw = sc.next();
				
				for(int i = 0; i < id.length; i++) {
					if(newId.equals(id[i]) && newPw.equals(pw[i])) success = 1; 
				}
				if(success == 1) {
					System.out.println("로그인에 성공하였습니다.");
					System.out.println("프로그램을 종료합니다.\n");
					return;
				}
				else System.out.println("로그인에 실패하였습니다.\n");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다!\n");
				return;
			default:
				System.out.println("잘못 입력했습니다.\n");
				break;
			}
		}
	}
}