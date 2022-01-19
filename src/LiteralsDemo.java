
public class LiteralsDemo {

	public static void main(String[] args) {

		// integer
		int a = 10;// decimal
		int b = 010;// octal -> prefix 0 in value that means your base is octal
		int c = 0x10;
		int d = 0b10;// 2

		// hexadecimal

		if (a == b) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		System.out.println(a);// 10
		System.out.println(b);// 8
		System.out.println(d);// 2
		// number system
		// binary(2) -> 0 1
		// octal(8) -> 0 1 2 3 4 5 6 7
		// decimal(10)# -> 0 1 2 3 4 5 6 7 8 9
		// hexadecimal(16) -> 0 1 2 3 4 5 6 7 8 9 A B C D E F

		// 12 --> 12(10)
		// 111 -> 111(10)

		// character

		char x = 'a';
		System.out.println(x);
		// java UNICODE ??
		char y = '\u0000';
		System.out.println("null => " + y);
		y = '\u0001';
		System.out.println("A => " + y);
		char h = 's';

		// String
		String x1 = "royal";

	}
}
