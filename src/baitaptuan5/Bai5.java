package baitaptuan5;

public class Bai5 {
	public static void main(String[] args) {
		for(int i = 1000; i < 2000; i++) {
			if((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0))
				System.out.print(i + " ");
		}
		System.out.println("\n Nguyen Van Dung 20183900");
	}
}
