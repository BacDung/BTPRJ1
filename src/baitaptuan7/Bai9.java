package baitaptuan7;

public class Bai9 {
	public static void main(String[] args) {
		String a = new String("homnaytroinangdep");
		System.out.println(a);
		int i = 4, j = 9;
		a = a.substring(0, i - 1) + a.charAt(j) + a.substring(i, j - 1) + a.charAt(i) + a.substring(j);
		System.out.println(a);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
