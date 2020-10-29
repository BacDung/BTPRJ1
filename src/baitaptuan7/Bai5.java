package baitaptuan7;

public class Bai5 {
	public static void main(String[] args) {
		String a = new String("00101110001");
		System.out.println(a);
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '0')
				a = a.substring(0, i) + 1 + a.substring(i + 1);
			else if(a.charAt(i) == '1')
				a = a.substring(0, i) + 0 + a.substring(i + 1);
		}
		System.out.println(a);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
