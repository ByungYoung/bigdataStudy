package javaStudy_0824;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java ���� �Է� : ");
		int javaScore = sc.nextInt();
		System.out.print("Web ���� �Է� : ");
		int webScore = sc.nextInt();
		System.out.print("Android ���� �Է� : ");
		int androidScore = sc.nextInt();
		sc.close();
		
		int sumScore = javaScore + webScore + androidScore;
		double avgScore = (double)sumScore / 3;
		
		System.out.println("�հ� : " + sumScore);
		System.out.println("��� : " + Math.ceil(avgScore));
	}
}