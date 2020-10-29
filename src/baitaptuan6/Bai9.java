package baitaptuan6;

public class Bai9 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 0, 12, 6, 2, 0, 3, 4, 8, 24, 56, 0, 0};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int a = 0, b = 0, d = 0;
		int c = 7;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > c )
				a++;
			if(arr[i] == c)
				b++;
			if(arr[i] < c)
				d++;
		}
		System.out.println("\nso lon hon " + c + " la: " + a);
		System.out.println("so be hon " + c + " la: " + d);
		System.out.println("so bang " + c + " la: " + b);
		System.out.println("Nguyen Van Dung 20183900");
	}
}