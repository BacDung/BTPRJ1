package baitaptuan7;

public class Bai10 {
	public static void main(String[] args) {
		String a[] = { "asdfa", "asdfasd", "gnjsd", "b", "nguyen van dung", "dsaf" };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int max = -1, p = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > max) {
				max = a[i].length();
				p = i;
			}
		}
		System.out.println("\nxau dai nhat trong mang la: " + a[p]);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
