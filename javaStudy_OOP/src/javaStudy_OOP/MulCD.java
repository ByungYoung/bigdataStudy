package javaStudy_OOP;

public class MulCD extends CD {

	public MulCD(int life, int max, String[] failMsg) {
		super(life, max, failMsg);
	}

	@Override
	protected void makeNum() {
		num1 = rand.nextInt(max) + 1;
		num2 = rand.nextInt(max) + 1;
	}

	@Override
	protected String getQues() {
		return num1 + " * " + num2 + " = ";
	}

	@Override
	protected boolean istrue(int answer) {
		return answer == num1 * num2;
	}
}