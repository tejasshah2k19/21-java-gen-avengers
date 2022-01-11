
public class CommandLineMax {

	public static void main(String[] args) {

		int max = Integer.parseInt(args[0]); // 0th index

		for (int i = 0; i < args.length; i++) {
			if (max < Integer.parseInt(args[i])) {
				max = Integer.parseInt(args[i]);
			}
		}
		System.out.println("max ==> " + max);

	}

}
