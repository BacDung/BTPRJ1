package baitaptuan6;


public class Bai7 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 2, 12, 6, 2, 3, 4, 8, 24, 56};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = 1; i < arr.length; i++)
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		for(int i = 0; i < arr.length - 1; i++) 
			for(int j = i + 1; j < arr.length; j++)
				if(arr[i] == arr[j])
					arr[i] = arr[j] = -1;
		System.out.println("\nso be nhat trong day khong bi trung la: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != -1) {
				System.out.println(arr[i]);
				break;
			}	
		}
		System.out.println("Nguyen Van Dung 20183900");
	}

}
