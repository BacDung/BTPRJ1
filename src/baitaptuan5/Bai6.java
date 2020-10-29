package baitaptuan5;

public class Bai6 {
	public static void main(String[] args) {
		for(int i = 1; i < 10000; i++) {
			int a = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					a += j;					
				}
			}
			if(a == i)
				System.out.print(a + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
