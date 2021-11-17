package string;

public class StringDemo2 {

	public static void main(String[] args) {

		String s = "royal";
		s = s.concat("education");
		System.out.println(s);

		s = "   jony jony yes papa   ";
		s = s.trim();
		System.out.println(s);
		// s = "ramayan";
		// jony is present ?
		if (s.contains("jony") == true) {
			System.out.println("jony is present");
		} else {
			System.out.println("not present");
		}

		// ends with ion
		if (s.endsWith("pa")) {
			System.out.println("ends with pa");
		} else {
			System.out.println("no ends with pa");
		}

		// starts with
		if (s.startsWith("jo")) {
			System.out.println("startsWith jo");
		} else {
			System.out.println("no starts with jo");
		}

		s = "jony jony yes papa";
		s.charAt(0);// j
		System.out.println(s.indexOf('e'));// 11
		System.out.println(s.indexOf('o'));// 1
		System.out.println(s.lastIndexOf('o'));//

		// count total
		// jony jony yes papa
		String x[] = s.split(" ");

		int count = 0;
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			if (x[i].equals("jony")) {
				count++;
			}
		}

		System.out.println("jony found  " + count + "(s) time");
	}
}
