package baitaptuan7;

public class Bai14 {
	public static String Sn(int n) {
		if(n == 1)
			return "1111100000";
		return Sn(n - 1).substring(1) + Sn(n - 1).substring(0, 1);
	}
	public static void main(String[] args) {
		int n = 13;
		System.out.println("Sn(" + n + "): " + Sn(n));
		System.out.println("Nguyen Van Dung 201839000");
	}
}
