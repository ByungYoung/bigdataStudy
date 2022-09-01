package javaStudy_0901;

public class Ex04 {
	public static void main(String[] args) {
		int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
		String score = "A, A, B, C, D, A, C, D, D, D, F";
		String[] charArr = score.split(", ");
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i].equals("A"))	countA++;
			else if(charArr[i].equals("B"))	countB++;
			else if(charArr[i].equals("C"))	countC++;
			else if(charArr[i].equals("D"))	countD++;
			else if(charArr[i].equals("F"))	countF++;
		}
		
		System.out.println("A의 개수 >> " + countA);
		System.out.println("B의 개수 >> " + countB);
		System.out.println("C의 개수 >> " + countC);
		System.out.println("D의 개수 >> " + countD);
		System.out.println("F의 개수 >> " + countF);
		return;
	}
}