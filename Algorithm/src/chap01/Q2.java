package chap01;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min3(6, 2, 3));		
	}
	
	//세개 값의 최솟값을 구하는 min3 메서드 작성
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if (min>b) {			
			min=b;
		}
		if (min>c) {
			min=c;
		}	
		
		return min;
	}
	
}
