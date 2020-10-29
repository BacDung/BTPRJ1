package baitaptuan5;

public class Bai14 {
	public static long giaithua(int n) {
		long sum = 1;	
		for(int i = 1; i <= n; i++) {
			sum = sum*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 20;
		float sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + (float)1/giaithua(i);
		}
		System.out.print(sum);
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
