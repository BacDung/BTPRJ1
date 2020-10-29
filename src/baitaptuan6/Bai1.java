package baitaptuan6;

public class Bai1 {
	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 2, 12, 6, 2};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++){
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}

}
