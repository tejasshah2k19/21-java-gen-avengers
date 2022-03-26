package innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {

		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		inner.printX();

		o.makeInner();
	}
}

//Outer$Inner.class 

class Outer {
	// inner - class inside class
	class Inner {
		int x;

		void printX() {
			System.out.println(x);
		}
	}

	//Outer$1MethodInner.class 
	void makeInner() {
		// method local innner class
		class MethodInner {
			void printY() {
				System.out.println("pY");
			}
		}
		MethodInner mi = new MethodInner();
		mi.printY();
	}
}