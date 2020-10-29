package baitaptuan6;

public class Bai2 {
	public static boolean Check(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 2, 12, 6, 2};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\ncac so nguyen to cua day la:");
		for(int i = 0; i < arr.length; i++) {
			if(Check(arr[i]))
				System.out.print(arr[i] + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
