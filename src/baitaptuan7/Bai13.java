package baitaptuan7;

public class Bai13 {
	public static boolean Check(String a, char b) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == 'H' && a.indexOf(' ', i + 1) == -1)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String a[] = { "Hoang Thi Thuy", "Nguyen Hai An", "Nguyen Van Hai", "Nguyen Truong Han" };
		for(String i : a) {
			System.out.println(i);
		}
		int cout = 0;
		for (int i = 0; i < a.length; i++) {
			if (Check(a[i], 'H'))
				cout++;
		}
		System.out.println("So nguoi co chu cai dau la H trong ten: " + cout);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
