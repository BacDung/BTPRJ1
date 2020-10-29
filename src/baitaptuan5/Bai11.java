package baitaptuan5;

import java.util.Random;

public class Bai11 {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 8, 4, 0};
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		if(size < 2 )
			System.out.println("khong doi duoc");
		Random random = new Random();
		int a = random.nextInt(size);
		int b = random.nextInt(size);
		if(a == b) {
			b = random.nextInt(size);
		}
		int c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
		System.out.println();
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
