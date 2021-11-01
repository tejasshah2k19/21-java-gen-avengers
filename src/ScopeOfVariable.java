
public class ScopeOfVariable {

	int k; // instance
	static int j = 9000;// static

	void add() {
		int p = 90;// local
		for (int i = 1; i <= 5; i++) { // local -- block

		}
	}

	void sub() {
		//
	}

	public static void main(String[] args) {
		KotakBank motaBhai = new KotakBank();
		KotakBank raj = new KotakBank();

		motaBhai.bal = 12000000;
		System.out.println(motaBhai.bal);
		System.out.println(raj.bal);
		System.out.println(motaBhai.minBalance);
		System.out.println(raj.minBalance);
		motaBhai.minBalance = 50000;
		System.out.println(motaBhai.minBalance);
		System.out.println(raj.minBalance);
		System.out.println(KotakBank.minBalance);
	}
}

class KotakBank {

	int bal = 10000;// 4
	static int minBalance = 100000;// 4

	void add() {
		int x = 90;//4 
	}
}













