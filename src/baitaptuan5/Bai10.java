package baitaptuan5;

public class Bai10 {
	public static void main(String[] args) {
		int n = 1001;
		System.out.print("cac uoc so nguyen to cua " + n + " la: ");
		for(int i = 2; i < n; i++) {
			if(Bai2.Check(i) && Bai8.Check(n, i))
				System.out.print(i + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
