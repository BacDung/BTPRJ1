package baitaptuan7;

public class Bai15 {
	public static void main(String[] args) {
		String a = new String("asdfisfauisdghfudhf");
		System.out.println(a);
		String b = new String(" day la chuoi dc chen ");
		System.out.println(b);
		StringBuilder c = new StringBuilder(a);
		c.insert(a.length()/2, b);
		System.out.println(c);
		System.out.println("Nguyen Van Dung 20183900");
	}
}
