package baitaptuan7;

public class Bai16 {
	public static void main(String[] args) {
		String a = new String("hom nay la mot ngay ban ron");
		System.out.println("Chuoi a: " + a);
		String b = new String("ngay");
		System.out.println("Chuoi b: " + b);
		if(a.contains(b))
			System.out.println("chuoi b la chuoi con cua chuoi a");
		else
			System.out.println("chuoi b khong la chuoi con cua chuoi a");
		System.out.println("Nguyen Van Dung 20183900");
	}
}
