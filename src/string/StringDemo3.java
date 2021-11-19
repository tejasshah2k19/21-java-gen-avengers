package string;

public class StringDemo3 {

	public static void main(String[] args) {

		String s = "royal education";
		s = s.substring(3);
		System.out.println(s);// al education

		s = "royal education";
		s = s.substring(3, 7);// 1st index inclusive ,2nd exclusive
		System.out.println(s);// al e

		s = "royal";
		s = s.replace('r', 'g');
		System.out.println(s);

		s = "royal techno soft p ltd";
		s = s.replace("royal", "jamanagar");
		System.out.println(s);

		// immutable --> operation -- new
		// 1) StringBuffer
		// 2) StringBuilder
	}
}
