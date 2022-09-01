package javaStudy_0901;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0, min = 0, max = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 >> ");
			arr[i] = sc.nextInt();
			
			if(i == 0) {
				min = arr[0]; max = arr[0];				
			}
			else {
				min = arr[i] > min ? min : arr[i];
				max = arr[i] < max ? max : arr[i];
			}
			sum += arr[i];
		}
		sc.close();

		System.out.print("입력된 정수 >> ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("최고 정수 >> " + min);
		System.out.println("최소 점수 >> " + max);
		System.out.println("점수 총합 >> " + sum);
		avg = (double) sum / arr.length;
		System.out.println("점수 평균 >> " + (int)avg);
	}
}