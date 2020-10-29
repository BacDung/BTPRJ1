package baitaptuan6;


public class Bai8 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 0, 12, 6, 2, 0, 3, 4, 8, 24, 56, 0, 0};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				for(int j = i + 1; j < arr.length; j++) 
					arr[j - 1] = arr[j];
	
				}
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				break;
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
