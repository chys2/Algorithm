package chap01;

import java.util.Scanner;

public class Q6 {
	//while문이 종료될 때 변수 i값이 n+1이 되는 확인
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1에서 n까지의 총합을 구합니다.");
 		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();

		int sum = 0;				// 총합
		int i = 1;

		while (i <= n) {			// i가 n이하이면 반복
			sum += i;				// sum에 i를 더합니다
			i++;					// i의 값을 1 증가
		}
		System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "(으)로 됩니다.");
	}
}
