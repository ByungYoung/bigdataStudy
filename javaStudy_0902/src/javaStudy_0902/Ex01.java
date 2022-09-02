package javaStudy_0902;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int[] sum = new int [3];
		double avg = 0;
		int[][] studentScore = new int [5][5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < studentScore.length; i++) {
			for(int j = 0; j < studentScore[i].length; j++) {
				switch(j) {
				case 0:
					System.out.print(i + 1 + "번째 학생의 국어 점수 >> ");
					studentScore[i][j] = sc.nextInt();
					break;
				case 1:
					System.out.print(i + 1 + "번째 학생의 영어 점수 >> ");
					studentScore[i][j] = sc.nextInt();
					break;
				case 2:
					System.out.print(i + 1 + "번째 학생의 수학 점수 >> ");
					studentScore[i][j] = sc.nextInt();
					break;
				case 3:
					System.out.print(i + 1 + "번째 학생의 사회 점수 >> ");
					studentScore[i][j] = sc.nextInt();
					break;
				default:
					System.out.print(i + 1 + "번째 학생의 과학 점수 >> ");
					studentScore[i][j] = sc.nextInt();
					break;
					
				}
				sum[i] += studentScore[i][j];
			}
			System.out.print(i + 1 + "번째 학생의 점수 >> ");
			for(int j = 0; j < studentScore[i].length; j++) {
				System.out.print(studentScore[i][j] + " ");
			}
			System.out.println();
			System.out.println(i + 1 + "번째 학생의 총점 >> " + sum[i]);
			avg = sum[i] / 5.0;
			System.out.println(i + 1 + "번째 학생의 평균 >> " + avg);
			System.out.println();
		}
		sc.close();
	}
}