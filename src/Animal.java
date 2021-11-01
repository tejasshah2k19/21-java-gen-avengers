import java.util.Scanner;

public class Animal {

	public static void main(String args[]) {
		// variable - data name that can holds the value , and it may be change
		// datatype -
		// identifier - name

		// Calc obj; //declaration -- new
		// obj = new Calc();

		Calc1 obj = new Calc1();
		obj.getData();
		obj.add();
		obj.sub();

	}
}

//int k; 
//cohesion 
class Calc {
	int a, b, c;// instance variable

	void getData() {
		// Scanner [nextInt() , nextFloat() , ...........]
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = scr.nextInt();
		b = scr.nextInt();
	}

	void add() {
		c = a + b;
		System.out.println("Addition = " + (a + b));

	}

	void sub() {
		c = a - b;
		System.out.println("Sub = " + c);
	}
}

class Dog {

	// data members --> variable
	// member function --> methods

	public static void main(String args[]) {

		System.out.println("Dog::main()");

	}
}

class A {

	public static void main(String args[]) {

		System.out.println("A::main()");

	}

}

class B {

}