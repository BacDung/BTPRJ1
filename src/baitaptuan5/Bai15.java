package baitaptuan5;

public class Bai15 {
	public static void main(String[] args) {
		int n = 20;
		float sum = 0;
		long p = 0;
		for(int i = 1; i <= n; i++) {
			p = p + Bai14.giaithua(i);
			sum = sum + (float)1/p;
		}
		System.out.print("S(" + n + ") = " + sum);
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
