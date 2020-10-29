package baitaptuan5;

public class Bai16 {
	public static int Fibonaxi(int n) {
		if(n == 1 || n == 2)
			return 1;
		else
			return Fibonaxi(n - 1) + Fibonaxi(n - 2);		
	}
	public static void main(String[] args) {
		int n = 20;
		System.out.println(Fibonaxi(n));
		System.out.println("Nguyen Van Dung 20183900");
	}

}
