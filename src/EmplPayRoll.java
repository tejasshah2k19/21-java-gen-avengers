import java.util.Scanner;

public class EmplPayRoll {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.getData();
		e.calculateSalary();
		e.printData();
	}
}

class Employee {

	String firstName; // royal
	int basicSalary, tax, da, hra, bonus, pf, totalSalary;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter First Name ");
		firstName = scr.next();
		System.out.println("Enter BasicSalary");
		basicSalary = scr.nextInt();
	}

	void calculateSalary() {
		if (basicSalary >= 15000 && basicSalary < 50000) {
			tax = 1000;
		} else if (basicSalary >= 50000) {
			tax = 2000;
		} else {
			tax = 0;
		}
		hra = (int) (basicSalary * 0.05);
		bonus = (int) (basicSalary * 0.07);
		da = (int) (basicSalary * 0.05);
		pf = (int) (basicSalary * 0.12);

		totalSalary = basicSalary + da + bonus + hra - pf - tax;

	}

	void printData() {
		System.out.println("Employee Name : " + firstName);
		System.out.println("BasicSalary : " + basicSalary);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		System.out.println("BONUS : " + bonus);
		System.out.println("PF : " + pf);
		System.out.println("TAX : " + tax);
		System.out.println("TotalSalary : " + totalSalary);
	}

}
