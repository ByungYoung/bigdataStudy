package javaStudy_OOP;

import java.util.Scanner;

public class Controller {	
	private CD cd;

	public Controller(CD cd) {
		this.cd = cd;
	}
	
	public void play() {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < cd.getLife(); ) {
			cd.makeNum();
			System.out.print(cd.getQues());
			int answer = scan.nextInt();
			if(cd.istrue(answer)) System.out.println("Success!");
			else System.out.println(cd.getFailMsg(i++));
		}
	}
}