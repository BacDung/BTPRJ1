package baitaptuan5;
import java.util.Scanner;
public class Bai12 {
	public static void tamgiacthuan(int h) {
		for(int i = 0; i < h; i++) {
			for(int j = 1; j <= h - i; j++)
				System.out.print(" ");
			for(int k = h - i; k <= h + i ; k++ )
				System.out.print("*");
			System.out.println();
		}			
	}
	public static void tamgiacnguoc(int h) {	
		for(int i = 0; i <= h; i++) {
			for(int k = 0; k <=  i ; k++ )
				System.out.print(" ");
			for(int j = 0; j <= h - 2*i + 3; j++)
				System.out.print("*");		
			System.out.println();
		}			
	}
	public static void main(String[] args) {
		int h;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu cao tam giac: ");
		do {
			h = sc.nextInt();
			if(h < 2 || h > 10)
				System.out.println("nhap lai");
		}
		while(h < 2 || h > 10);
		System.out.println("tam giac thuan nhap 1, tam giac nguoc nhap bat ki :");
		int c = sc.nextInt();
		if(c == 1)
			tamgiacthuan(h);
		else
			tamgiacnguoc(h);
		sc.close();
	}

}
