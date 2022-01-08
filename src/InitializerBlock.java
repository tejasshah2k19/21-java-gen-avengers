import java.sql.DriverManager;

public class InitializerBlock {

	static {
		System.out.println("i am on line num 5 ");
	}

	public static void main(String[] args) {

		System.out.println("hi.....");

		// Pushpa p1 = new Pushpa();
		// Pushpa p2 = new Pushpa();

		try {
			Class.forName("Pushpa"); // load pushpa class in memory
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
//Driver --> load --> microphone , cd , pendrive 

class Pushpa {

//	DriverManager

	String name;
	static int x;
	// block

	// static
	// static variable
	static {
		x = 900;
		System.out.println("static block");
	}

	// instance
	// instance variable
	{
		System.out.println("instance block");
	}

	private Pushpa() {
		System.out.println("I am constructor.....");
		name = "ram";
	}

}
