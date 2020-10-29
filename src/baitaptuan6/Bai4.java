package baitaptuan6;

public class Bai4 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 12, 6, 2 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("\ngia tri max cua day la: " + max);
		System.out.println("o vi tri thu: ");
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i])
				System.out.print(i + 1 + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
