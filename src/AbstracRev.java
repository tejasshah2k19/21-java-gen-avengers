
public class AbstracRev {

	public static void main(String[] args) {

	}
}

//abstract can have both abstract / non abstract 
//if your class is abstract -- then you can not create object of it...
abstract class RBIBank {

	abstract void wid();// no defination - only declaration - only body part

	abstract void dep();

	final void roi() {
		System.out.println("roi");
	}
}

abstract class Dhkkabank extends RBIBank {
	abstract void chkBal();
}
//non  abstract class ---> non abstract method 

class ABC extends Dhkkabank {
	// 3
	void wid() {
	}

	void dep() {

	}

	void chkBal() {

	}
}

class SBI extends RBIBank {
	void wid() {
		System.out.println("sBI :  WID");
	}

	void dep() {

	}

}

class ICICI extends RBIBank {
	void wid() {
		System.out.println("ICICI :  WID");
	}

	void dep() {

	}
}