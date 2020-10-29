package baitaptuan5;

public class Bai8 {
	public static boolean Check(int n, int i) {
		if (n % i == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int n = 5731;
		for (int i = 2; i < n; i++) {
			if (Bai2.Check(i) && Check(n, i)) {
				System.out.println("uoc so nguyen to nho nhat cua " + n + " la " + i);
				break;
			}
		}

		System.out.println("Nguyen Van Dung 20183900");
	}
}
