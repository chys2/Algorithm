package chap02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수는  : ");
		int num = stdIn.nextInt();		// 요솟수

		int[] a = new int[num];			// 요솟수가 num 인 배열 

		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.println("모든 요소의 합계는 " + sumOf(a) + "입니다.");

	}
	
	static int sumOf(int []a) {
		int sumNum = 0;
		
		for(int i = 0; i<a.length; i++) {
			sumNum += a[i];
		}
		
		return sumNum;
	}

}
