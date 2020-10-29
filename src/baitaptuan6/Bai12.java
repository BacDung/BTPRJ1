package baitaptuan6;

public class Bai12 {
	public static void main(String[] args) {
		System.out.println("day a: " );
		int arr[] = { 5, 7, 9, 2, 0, 12, 6, 2, 2, 2 , 2, 0, 3, 4, 8, 24, 56, 0, 0};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int a[] = { 2, 0, 12, 6, 2, 4, 8, 24, 56, 0, 0};
		System.out.println("\nday b: " );
		for(int i = 0; i < a.length; i++) {
			System.out.print( a[i] + " ");
		}
		boolean res = false;
		int k = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if(a[0] == arr[i] && arr.length - i >= a.length){
	            k = i + 1;
	            res = true;
	            for(int j = 1; j < a.length; j++, k++){
	                if(a[j] != arr[k]){
	                    res = false;
	                    break; 
	                }
	            }
	            if(res)
	                break;
	        }
	    }
	    if(res)
	    	System.out.println("\nb la day con cua a");
	    else
	    	System.out.println("\nb khong la day con cua a");
	    System.out.println("Nguyen Van Dung 20183900");
	}
}
