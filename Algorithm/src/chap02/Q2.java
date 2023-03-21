package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] =  a[idx2]; a[idx2] = t;
	}

	static void reverse(int[] a) {
		for(int i = 0; i <a.length / 2;  i++) {
			
			System.out.println(Arrays.toString(a));
			swap(a,i,a.length-i-1);
			System.out.println("a["+i+"]과 a[" + (a.length-i-1) +"]을 교환합니다.");
	
			
		}
	}
	//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
	public static void main(String[] args) {
	
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		
		int num = stdId.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i<num; i++) {
			System.out.print("x["+ i +"]: ");
			x[i]= stdId.nextInt();
		}
		
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");
		//System.out.println("요소를 역순으로 정렬했습니다.");
		//System.out.println("x= " + Arrays.toString(x));
	}

}
