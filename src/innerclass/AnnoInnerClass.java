package innerclass;

public class AnnoInnerClass {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			public void run() {
			}
		};
		// AnnoInnerClass$1.class 
		A a = new A() {
			void add() {
				System.out.println("Anno :: add () ");
			}

			void sub() {
				System.out.println("sub");
			}
		};

		a.add();
//		a.sub();//polymorphic object 
		
	}
}
//spring --> db read --> anno  inner , inner class 

class A {
	void add() {
		System.out.println("A :: add()");
	}
}
