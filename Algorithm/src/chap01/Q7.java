package chap01;

import java.util.Scanner;

public class Q7 {
	//1~10합은 (1+10)*5와 같이 구할 수 있습니다. 이를 '가우스의 덧셈'이라고 하는데,
	//이 방법을 이용하여 1부터 n까지의 정수의 합을 구하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		int sum;
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1에서 n까지의 총합을 구합니다.");
 		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int num = n / 2;
		int num2 = (n % 2 == 1 ? (n + 1) / 2 : 0);
		sum = (1 + n) * num + num2;
		
		System.out.println(sum);
			
		
	}
}
