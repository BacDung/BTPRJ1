package baitaptuan5;

public class Bai13 {
	public static void main(String[] args) {
		int n = 20000;
		float a = 0;
		float b = 0;
		for (int i = 1; i <= n; i++) {
			a = a + i;
			b = b + 1 / a;
		}
		System.out.print(b);
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
