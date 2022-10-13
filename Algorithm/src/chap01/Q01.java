package chap01;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max4(1, 6, 3, 5));		
	}
	
	//네개 값의 최댓값을 구하는 max4 메서드 작성
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if (b>max) {
			max=b;
		}if (c>max) {
			max=c;
		}if (d>max) {
			max=d;
		}	
		
		return max;
	}
	
}
