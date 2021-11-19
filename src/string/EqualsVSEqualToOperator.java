package string;

public class EqualsVSEqualToOperator {

	public static void main(String[] args) {

		String s1 = new String("royal");
		String s2 = new String("royal");
		System.out.println(s1 == s2);// true --- false // ref object address
		System.out.println(s1.equals(s2));// true
		String s3 = "royal";
		String s4 = "royal";
		System.out.println(s3 == s4); // true
		System.out.println(s1 == s3);
		s3 = "gabbar";
		System.out.println(s4);
		String s31 = "gabbar";
		s31 = "royal";
		// ------------------------------------------------

		StringBuffer sb1 = new StringBuffer("god");
		StringBuffer sb2 = new StringBuffer("god");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2)); // == 

	}

}
