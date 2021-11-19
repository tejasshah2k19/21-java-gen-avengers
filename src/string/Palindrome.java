package string;

public class Palindrome {

	public static void main(String[] args) {

		String str = "royal";// royal

		StringBuffer sb = new StringBuffer(str);

		// sb.reverse();// layor
		// String rev = sb.toString();// layor

		String rev = sb.reverse().toString();

		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palidrome");
		}

		Z zObj = new Z();
		// 9 methods
	}
}

class Z {

}