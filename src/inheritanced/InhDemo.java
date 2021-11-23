package inheritanced;

public class InhDemo {
	public static void main(String args[]) {
		SciCalc sc = new SciCalc();
		sc.accessParentSub();
	}
}
class BasicCalc {
	void add() {
		System.out.println("BasicCalc::add()");
	}

	void sub() {
		System.out.println("BasicCalc::sub()");
	}

	void sub(int x) {

	}
}

class SciCalc extends BasicCalc {
	void sqrt() {

	}

	void accessParentSub() {
		this.sub();// sub()
		super.sub();
	}

	// overriding
	void sub() {
		System.out.println("SciCalc::sub()");
	}

	// overloading
	void add(int x) {
		System.out.println("SciCalc::add(int)");

	}

}
