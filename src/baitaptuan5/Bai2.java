package baitaptuan5;

public class Bai2 {
	public static boolean Check(int i) {
		for(int j = 2; j < i ; j++) {
			if(i % j == 0) 
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		int n = 0;
		for(int i = 2;i < 100; i++) {
			if(Check(i)) {
				System.out.print(i + " ");
				n++;
			}
			if(n == 20)
				break;
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
