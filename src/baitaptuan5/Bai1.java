package baitaptuan5;

public class Bai1 {
	public static void main(String[] args) {
		for(int i = 4; i < 100; i++)
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					System.out.print(i + " ");
				    break;
				}
			}

		System.out.println("\nNguyen Van Dung 20183900");
	}
	

}
