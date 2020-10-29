package baitaptuan7;

public class Bai4 {
	public static void main(String[] args) {
		String a = new String("Nguyen Van Dung");
		System.out.println(a);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				System.out.println("Ho: " + a.substring(0, i));
				break;
			}
		}
		System.out.println("Nguyen Van Dung 20183900");
	}
}
