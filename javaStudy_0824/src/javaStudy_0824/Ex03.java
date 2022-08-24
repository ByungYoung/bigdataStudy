package javaStudy_0824;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		int webScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int androidScore = sc.nextInt();
		sc.close();
		
		int sumScore = javaScore + webScore + androidScore;
		double avgScore = (double)sumScore / 3;
		
		System.out.println("합계 : " + sumScore);
		System.out.println("평균 : " + Math.ceil(avgScore));
	}
}