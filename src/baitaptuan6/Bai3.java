package baitaptuan6;

public class Bai3 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 12, 6, 2 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("\ngia tri min cua day la: " + min);
		System.out.println("o lan luot cac vi tri: ");
		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i])
				System.out.print(i + 1 + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
