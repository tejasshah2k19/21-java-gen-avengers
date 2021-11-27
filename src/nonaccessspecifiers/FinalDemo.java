package nonaccessspecifiers;

public class FinalDemo {

	public static void main(String[] args) {

	}
}

class A {
	final void add() {

	}
}

class B extends A {
	final int k = 90; // constant
	final int MIN_BAL = 9000;
	// void add() {
//		
//	}
}