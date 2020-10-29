package baitaptuan6;

import java.util.Scanner;

public class Bai13 {
	public static void getarr(int n, int[][] a) {
		int d = 0, i, gt = 1;
	    int hang = n - 1, cot = n - 1;
	    while(gt <= n*n){        
	        for(i = d; i <= cot; i++) {          
	            a[d][i] = gt++;            
	        }       
	        for(i = d+1; i <= hang; i++){            
	            a[i][cot] = gt++; 
	        }       
	        for(i = cot-1; i>=d && gt <= n * n; i--){         
	            a[hang][i]=gt++; 
	        }       
	        for(i = hang-1; i>d && gt <= n * n; i--){         
	            a[i][d] = gt++; 
	        }       
	        d++; hang--; cot--;         
	    }
	}
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap vao n");
			n = sc.nextInt();
			if(n < 3 && n > 8)
				System.out.println("nhap lai");
		}
		while(n < 3 && n > 8);
		sc.close();
		int a[][] = new int[n][n];
		getarr(n, a);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}	
		System.out.println("Nguyen Van Dung 20183900");
	}
}