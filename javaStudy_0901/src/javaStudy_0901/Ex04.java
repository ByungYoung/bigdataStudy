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
		
		System.out.println("A�� ���� >> " + countA);
		System.out.println("B�� ���� >> " + countB);
		System.out.println("C�� ���� >> " + countC);
		System.out.println("D�� ���� >> " + countD);
		System.out.println("F�� ���� >> " + countF);
		return;
	}
}