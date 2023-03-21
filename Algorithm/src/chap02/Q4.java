package chap02;

public class Q4 {
	public static void main(String[] args) {
		
	}
	
	static void copy(int[] a, int[]b) {
		a = new int[b.length];
		
		for(int i = 0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
}
