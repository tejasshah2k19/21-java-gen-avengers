package nonaccessspecifiers;

public class StaticDemo {

	public static void main(String[] args) {
		KidZee k1 = new KidZee();// firstName
		KidZee k2 = new KidZee();// firstName
		Aone.schoolName = "aone";
		KidZee.branchCode = 123;
		k1.branchCode = 1232;
		// KidZee.firstName = "";
	}

}
//

class JB { // 500
	static int dabeliPrice = 90; // 500*4 => 2000byte
}

class KidZee {

	String firstName; // instance variable
	static int branchCode;// one and only one

	// static method can access static property
	static void admission() {
		System.out.println(branchCode);
//		System.out.println(firstName);
	}

	void close() {
		System.out.println(firstName);
		System.out.println(branchCode);
	}
}

class School {

	int grant;

}

class Aone extends School {
	static String schoolName; // static variable --- class variable

}
