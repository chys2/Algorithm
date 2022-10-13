package chap01;

import java.util.Scanner;

public class Q10 {
	//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
	//예를 들어 135를 입력하면 3자리, 1234를 입력하면 4자리
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int countNum = 1;
		
		System.out.print("양의 정수 : ");
		int a = stdIn.nextInt();
		
		while(a > 10) {
			a /= 10;
			countNum++;
		}
		System.out.printf("그 수는 %d 자리입니다.", countNum);

	}
}
