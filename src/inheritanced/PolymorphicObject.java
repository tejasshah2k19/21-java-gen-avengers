package inheritanced;

public class PolymorphicObject {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.walk();
		Cow c = new Cow();
		c.run();
		// Parent p = new Child();
		Animal a = new Dog();// polymorphic object
		a.walk();

		Animal ac = new Cow();
		ac.run();

	}
}

class Animal {
	void walk() {
		System.out.println("Animal:walk()");
	}

	void run() {
		System.out.println("Animal:run()");
	}
}

class Dog extends Animal {
	void walk() {
		System.out.println("Dog:walk()");
	}

	void bark() {
		System.out.println("Dog:bark()");
	}

	// run()
	// over loading
	void run(int tail) {
		System.out.println("Dog:run(int)");
	}
}

class Cow extends Animal {

	void walk() {
		System.out.println("Cow:walk()");

	}
}
