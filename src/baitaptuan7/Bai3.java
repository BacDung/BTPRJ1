package baitaptuan7;

public class Bai3 {
	public static void main(String[] args) {
		String a = new String("Nguyen Van Dung");
		System.out.println(a);
		int b = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ' ') {
				System.out.println("Ho: " + a.substring(0, i));
				b = i;
				break;
			}		
		}
		for(int i = b + 1; i < a.length(); i++) {
			if(a.charAt(i) == ' ') {
				System.out.println("Ten dem: " + a.substring(b + 1, i));
				b = i;
				break;
			}		
		}
		System.out.println("Ten: " + a.substring(b+ 1));
		System.out.println("Nguyen Van Dung 20183900");
	}
}
