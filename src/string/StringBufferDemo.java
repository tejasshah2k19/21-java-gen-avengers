package string;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		String x = "royal";
		StringBuffer sb1 = new StringBuffer(x);
		sb1.reverse();
		System.out.println(sb1);

		sb1 = new StringBuffer("royaleducation");
//------------------------------------------------------------
		// StringBuffer sb2 = new StringBuffer(512);// 5+16

		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.length());// 0
		System.out.println(sb2.capacity());// 16
		sb2.append("1234"); // 17 --> 17 + 17
		System.out.println(sb2.length());// 4
		System.out.println(sb2.capacity());// 16 --> 12

		// 4 -> roti --> 4 -->

		// 30 --> roti --> 15 cold

	}
}
