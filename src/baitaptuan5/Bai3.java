package baitaptuan5;

public class Bai3 {
	public static void main(String[] args) {
		for(int i = 1000; i <= 2000; i++) {
			if(Bai2.Check(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
