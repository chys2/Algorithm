package chap01;

import java.util.Scanner;

public class Q09 {
	//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를작성하세요.
	//a와 b의 대소 관계에 상관없이 합을 구하세요. 예를 들어 a가 3, b가 5이면 12를 a가 6 b가 4이면 15를 반환
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a값 : ");
		int a = stdIn.nextInt();
		System.out.print("b값 : ");
		int b = stdIn.nextInt();
	
		while(a >= b) {
			System.out.println("a보다 큰 값을 입력하세요.");
			System.out.print("b값 : ");
			b = stdIn.nextInt();
		}
		System.out.printf("b - a는 %d 입니다 ",b-a);

	}
}
