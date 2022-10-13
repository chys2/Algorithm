package chap01;

import java.util.Scanner;

public class Q08 {
	//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를작성하세요.
	//a와 b의 대소 관계에 상관없이 합을 구하세요. 예를 들어 a가 3, b가 5이면 12를 a가 6 b가 4이면 15를 반환
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		System.out.println(sumof(a, b));
		
	}
	
	public static int sumof(int a, int b) {
		int sum = 0;
		int min;		// a, b의 작은 쪽의 값 
		int max;		// a, b의 큰 쪽의 값 

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
}
