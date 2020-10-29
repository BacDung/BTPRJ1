package baitaptuan6;

public class Bai10 {
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
				if(arr[i] != arr[j])
					break;
				if(arr[i] == arr[j]) {
					a++;
					if(max < a) {
						max = a;
						b = i;
					}
				}
			}	
		}
		System.out.println("\nso phan tu day con bang nhau lon nhat la: " + max);
		System.out.println("phan tu dau tien o vi tri: " + ++b);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
