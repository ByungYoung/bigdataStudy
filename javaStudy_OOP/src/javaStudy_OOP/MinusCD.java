package javaStudy_OOP;

public class MinusCD extends CD{
	public MinusCD(int life, int max, String[] failMsg) {
		super(life, max, failMsg);
	}

	public void makeNum() {
		num1 = rand.nextInt(max) + 1;
		num2 = rand.nextInt(max) + 1;
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

}