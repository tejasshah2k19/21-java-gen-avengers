import java.util.Scanner;
//import java.lang.*; 

public class Calc1 {
	int a, b, c;
	Scanner scr = new Scanner(System.in);

	void getData() {
		System.out.println("Enter two numbers");
		a = scr.nextInt();
		b = scr.nextInt();
	}

	void add() {
		c = a + b;
		System.out.println("Addition =  " + c);
	}

	void sub() {
		c = a - b;
		System.out.println("Sub = " + c);

	}

	public static void main(String[] args) {

		Calc1 c = new Calc1();
		SciCalc sc = new SciCalc();
		c.getData();
		c.add();
		c.sub();
		sc.sqrt();

	}

}

class SciCalc {
	int num;
	double ans;

	Scanner scr = new Scanner(System.in);

	void sqrt() {
		System.out.println("Enter number");
		num = scr.nextInt();// 9 -> 3
		ans = Math.sqrt(num);
		System.out.println("Sqrt of " + num + " = " + ans);
	}

	void sin() {
		System.out.println("Enter number");
		num = scr.nextInt();
		ans = Math.sin(num);
		System.out.println("Sin of " + num + " = " + ans);

	}

	void cos() {
		System.out.println("Enter number");
		num = scr.nextInt();
		ans = Math.cos(num);
		System.out.println("Cos of " + num + " = " + ans);

	}
}
