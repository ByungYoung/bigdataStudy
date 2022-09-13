package javaStudy_OOP;

import java.util.Random;

public class MinusCD extends CD{
	public MinusCD(int life, int max, String[] failMsg) {
		this.rand = new Random();
		this.num1 = 0;
		this.num2 = 0;
		this.life = life;
		this.max = max;
		this.failMsg = failMsg;
	}
	
	public int getLife() {
		return life;
	}

	public void makeNum() {
		num1 = rand.nextInt(max) + 10;
		num2 = rand.nextInt(max) + 10;
		if(num1 < num2) {
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
	}

	public String getQues() {
		return num1 + " - " + num2 + " = ";
	}

	public boolean istrue(int answer) {
		return answer == num1 - num2;
	}

	public String getFailMsg(int i) {
		return failMsg[i];
	}
}