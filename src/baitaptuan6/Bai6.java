package baitaptuan6;

public class Bai6 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 12, 6, 2, 3 };
		int a[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if((arr[i] % arr[j] == 0) && arr[i] > arr[j])
					a[1] = arr[j];
					System.out.print(arr[j] + " ");
			}
		}
	}
}
