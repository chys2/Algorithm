package chap01;

import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정사각형을 출력합니다.");
		System.out.print("변의 길이: ");
		
		int lengthNum = scan.nextInt();
		
		for(int i = 0; i < lengthNum; i++) {
			System.out.print("*".repeat(lengthNum));
			System.out.println();
		}
	}
}
