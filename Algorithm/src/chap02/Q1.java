package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int num = (int)(Math.random() * 10) + 1;	// 1 ~ 10 생
		
//		int num = rand.nextInt(10) +1 ;
		
		System.out.println("사람 수: " + num);
		int[] height = new int[num];				//요솟수가 num인 배열을 생
		
		System.out.println("킷값은 아래와 같습니다.");
		
		for(int i=0; i<num; i++) {
			
			height[i] = 100 + rand.nextInt(90);		//요솟값을 난수로 결정 100~189
			
			System.out.println("height [" + i + "]: " +height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
	
	static int maxOf(int[] a){
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i]> max) {
				max = a[i];
			}
		}
		return max;
	}

}
