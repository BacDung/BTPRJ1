package baitaptuan6;

public class Bai11 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 0, 12, 6, 2, 2, 2 , 2, 0, 3, 4, 8, 24, 56, 0, 0};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int max = 1;
		int b = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			int a = 1;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j - 1] <= arr[j]) {
					a++;
					if(max < a) {
						max = a;
						b = i;
					}				
				}
				else
					break;
			}
		}
		System.out.println("\nday con tang dai nhat la:");
		for(int i = b; i < b + max; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nNguyen Van Dung 20183900");
	}
}
