package string;

public class StringDemo {

	public static void main(String[] args) {

		// royal --> c --> char[]
		// c++ -> char[] string
		// java --> String -> char[]

		String s = new String("royal education");
		System.out.println(s);

		String s1 = "royal education";
		String s2 = "royal education";

		// total number of character -- size of string -- length of the string

		s1.length();
//		System.out.println(s1.length());
		int x = s1.length();
		System.out.println(x);
//
		s1 = "royal";
		s2 = "Royal";

		// strcmp ==> int => same => 0 | any integer value
		// equals() ==> true | false

		boolean b = s1.equals(s2);
		System.out.println(b);

		System.out.println(s1.equals(s2));

		// equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));

		// compareTo --> strcmp --> int

		s1 = "royal";
		s2 = "royal";
		String s3 = "royalc";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 32
		// royal royal
		// royal royalc
		// 0 32  004 
		
		
		s1 = "royal";
		s2 = "Royal";
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		s1 = "royale ducation"; //r => 0th index 


		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));//r 
		}
		
		s1 = "royAl";
		s1 = s1.toUpperCase(); // ROYAL
		s1 = s1.toLowerCase();// royal
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}


















