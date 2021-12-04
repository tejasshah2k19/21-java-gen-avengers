package nonaccessspecifiers;

public class AbstractDemo {

	public static void main(String[] args) {
		SBI tejas = new SBI();
		ICICI kts = new ICICI();
		tejas.dep();
		kts.dep();

		tejas.roi();
		kts.roi();

	}
}

abstract class RBI {
	abstract void dep();// no defination -- only declaration

	abstract void addAdhar();

	final void roi() {
		// 3.5%
	}

}

abstract class DhakkarBank extends RBI {

}

class SBI extends RBI {

	void dep() {

	}

	void addAdhar() {

	}
}

class ICICI extends RBI {

	@Override
	void dep() {
		// TODO Auto-generated method stub

	}

	@Override
	void addAdhar() {
		// TODO Auto-generated method stub

	}

//	void roi() {
//		//7%
//	}
}
