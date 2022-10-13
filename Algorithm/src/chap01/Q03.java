package chap01;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min4(6, 1, 2, 3));		
	}
	
	//네개 값의 최솟값을 구하는 min4 메서드 작성
	static int min4(int a, int b, int c,int d) {
		
		int min = a;
		
		if (min>b) {			
			min=b;
		}
		if (min>c) {
			min=c;
		}	
		if (min>d) {
			min=d;
		}
		
		return min;
	}
	
}
