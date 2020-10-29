package baitaptuan6;


import java.util.ArrayList;

public class Bai6 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 12, 6, 2, 3, 4, 8, 24, 56 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] % arr[j] == 0) && (arr[i] > arr[j])) {
					a.add(arr[j]);
				}
			}
		}
		System.out.println("day cac uoc so la:");
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (!b.contains(a.get(i)))
				b.add(a.get(i));
		}
		for (int i = 0; i < b.size(); i++)
			System.out.print(b.get(i) + " ");
		System.out.println("\nNguyen Van Dung 20183900");
	}
}