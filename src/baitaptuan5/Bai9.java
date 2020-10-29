package baitaptuan5;

public class Bai9 {
	public static int Nguyento(int n) {
		int a = 0;
		for (int i = 2; i < n; i++) {
			if (Bai2.Check(i) & Bai8.Check(n, i)) {
				a = i;
				break;
			}
		}
		return a;
	}

	public static void tich(int n) {
		while (n != 1) {
			System.out.print(Nguyento(n) + "*");
			n = n / Nguyento(n);
			if (Bai2.Check(n)) {
				System.out.print(n);
				break;
			}
		}
	}

	public static void main(String[] args) {
		tich(1001);
		System.out.println("\nNguen Van Dung 20183900");
	}

}
