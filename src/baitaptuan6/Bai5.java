package baitaptuan6;

public class Bai5 {
	public static boolean Check(int i) {
		for(int j = 2; j < i; j++) {
			if(i % j == 0)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 12, 6, 2 };
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nhop so trong day: ");
		for(int i = 0; i < arr.length; i++) {
			if(Check(arr[i]))
				System.out.print(arr[i] + " ");
		}
		System.out.println("\nso nguyen to trong day:");
		for(int i = 0; i < arr.length; i++) {
			if(Bai2.Check(arr[i]))
				System.out.print(arr[i] + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
