public class PrintCommand {

	public static void main(String[] args) {
		System.out.println(args.length); // 5
//		System.out.println(args[0]);

		// wrapper class --> non primitive to primitive# , primitive to non primitive

		// Void
		// Integer
		// Float
		// int -Integer
		// char-Character
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			sum = sum + Integer.parseInt(args[i]);// String -> int/Integer

		}
		System.out.println("sum => " + sum);
	}

	
	
	
}

//PrintCommand royal 1 2 3 4 
