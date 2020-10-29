package baitaptuan7;

public class Bai8 {
	public static void main(String[] args) {
		String a = new String("sabcasabsabcyuotabbcasdhabc");
		System.out.println(a);
		String b = new String("abc");
		System.out.println(b);
		int cout = 0;
		int p = 0;
		while(a.indexOf(b, p) != -1) {			
				cout++;
				p = p + a.indexOf(b, p);
		}
		System.out.println("so lan xau con suat hien trong xau lon la: " + cout);
	}
}
