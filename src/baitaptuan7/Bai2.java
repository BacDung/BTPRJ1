package baitaptuan7;

public class Bai2 {
	public static void main(String[] args) {
		String a = new String("abcasdfweabcasdrfabccbcasdfcabc");
		System.out.println(a);
		int cout = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a' && a.charAt(i + 1) == 'b' && a.charAt(i + 2) == 'c')
				cout += 1;
		}
		System.out.println("so ky tu abc lien nhau la: " + cout);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
