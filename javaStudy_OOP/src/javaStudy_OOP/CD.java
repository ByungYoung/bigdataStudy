package javaStudy_OOP;

import java.util.Random;

public abstract class CD {
	protected int life, max;
	protected int num1, num2;
	protected String[] failMsg;
	protected Random rand;
	
	protected abstract void makeNum();
	protected abstract String getQues();
	protected abstract boolean istrue(int answer);
	
	public CD(int life, int max, String[] failMsg) {
		super();
		this.life = life;
		this.max = max;
		this.failMsg = failMsg;
		
		this.rand = new Random();
		this.num1 = 0;
		this.num2 = 0;
	}
	
	public int getLife() {
		return life;
	}

	public String getFailMsg(int i) {
		return failMsg[i];
	}
}