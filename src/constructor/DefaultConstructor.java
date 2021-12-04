
package constructor;
public class DefaultConstructor {

	public static void main(String[] args) {

		Santa s = new Santa(); // implicit default
		s.dispaly();

		Santa s1 = new Santa(35, 15000, "royal"); // implicit default - param
		s1.dispaly();

		Santa s2 = new Santa(12); // implicit default - param
		s2.dispaly();

//		Santa s3 = new Santa("royal"); // compilation fail
		// s3.dispaly();

		System.out.println("------------------------------------------------------------");

		Santa ss = new Santa();// default
	}
}

class Santa {
	int age;// 0
	float salary;// 0.0

	// default
	Santa() {
		this(10);// Santa(10);
		System.out.println("Santa()");
		age = 25;
	}

	// parameterized
	Santa(int x, float y, String name) {
		System.out.println("Santa(int,float,name)");
		age = x;
		salary = y;
	}

	// parameterized
	Santa(int x) {
		this(12, 12.2f, "ram");
		System.out.println("Santa(int)");
		age = x;
		salary = 150000;
	}

	void dispaly() {
		System.out.println("age = > " + age);
		System.out.println("salary => " + salary);
	}

}