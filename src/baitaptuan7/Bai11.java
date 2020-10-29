package baitaptuan7;

public class Bai11 {
	public static void main(String[] args) {
		String a[] = {"Nguyen Dac Thai", "Nguyen Thi An", "Nguyen Van An", "Nguyen Truong An"};
		for(String i : a) {
			System.out.println(i);
		}
		int cout = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].contains("An"))
				cout++;
		}
		System.out.println("danh sach tren co " + cout + " nguoi ten An");
		System.out.println("Nguyen Van Dung 20183900");
	}
}
