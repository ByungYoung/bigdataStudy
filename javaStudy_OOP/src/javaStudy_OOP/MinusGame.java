package javaStudy_OOP;

import java.util.Scanner;

public class MinusGame {	
	private CD cd;

	public MinusGame() {
		this.cd = new MinusCD(3, 89, new String[] {"Cheer up", "Sorry", "End"});
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