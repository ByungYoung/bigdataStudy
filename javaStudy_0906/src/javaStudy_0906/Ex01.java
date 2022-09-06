package javaStudy_0906;

import java.util.Scanner;

public class Ex01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID 입력 >> ");
		String newId = sc.next();
		sc.close();
		
		String id1 = "Person1";
		String id2 = "Person2";
		String id3 = "Person3";
		String pw1 = "Password1";
		String pw2 = "Password2";
		String pw3 = "Password3";
		
		if(id1.equals(newId)||id2.equals(newId)||id3.equals(newId)) System.out.println("중복된 아이디가 존재합니다.");
		else System.out.println("가일할 수 있습니다.");
	}
}