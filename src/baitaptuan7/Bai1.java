package baitaptuan7;

public class Bai1 {
	public static void main(String[] args) {
		String a = new String("  Ng u yen  V a n  Du ng   ");
		System.out.println(a);
		for(int i = 0; i < a.length() - 1; i++) {
			if(a.charAt(i) == ' ' && (Character.isLowerCase(a.charAt(i + 1)) || a.charAt(i + 1) == ' ' ))
				a = a.substring(0, i) + a.substring(i + 1);	
		}
		System.out.println(a.trim());	
		System.out.println("Nguyen Van Dung 20183900");
	}
}
