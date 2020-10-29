package baitaptuan5;

public class Bai7 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		for(int i = 5; i <= 100; i ++) {
			if(i % 5 == 0)
				a = a + 1;
			if(i % 5 == 1)
				b = b + 1;
			if(i % 5 == 2)
				c = c + 1;
			if(i % 5 == 3)
				d = d + 1;
		}
		System.out.print("so chia het cho 5: " + a + " \n" );
		System.out.print("so chia het cho 5 du 1: " + b + " \n" );
		System.out.print("so chia het cho 5 du 2: " + c + " \n" );
		System.out.print("so chia het cho 5 du 3: " + d + " \n" );
		System.out.print("Nguyen Van Dung 20183900" );
	}

}
