package baitaptuan7;

public class Bai7 {
	public static void main(String[] args) {
		String a = new String("assadf2,>1a:a2lf}]5asd");
		System.out.println(a);
		for(int i = 0; i < a.length(); i++) {
			if(Character.isDigit(a.charAt(i)))
				a = a.substring(0, i) + '$' +  a.substring(i + 1);
		}
		System.out.println(a);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
