package chap01;

public class Q16 {
	
	static void npira(int n) {
		int num;
		for(int i=1; i<= n; i++) {
			num = (i - 1) * 2 + 1;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= num; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}		
	
	}

	public static void main(String[] args) {

		npira(11);
	}
}
