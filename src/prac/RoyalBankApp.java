package prac;

import java.util.Scanner;

public class RoyalBankApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int choice, subChoice;
		Bank bank = new Bank();
		while (true) {
			System.out.println("*****************WELCOME******************");

			System.out.println("1) Signup\n2) Login\n3) Exit");
			System.out.println("Enter your choice");
			choice = scr.nextInt();

			switch (choice) {
			case 1:
				bank.signup();
				break;
			case 2:
				System.out.println("Enter email and password");
				String e = scr.next();
				String pwd = scr.next();
				boolean ans = bank.login(e, pwd);

				if (ans == false) {
					System.out.println("Invalid Credentials...try again");
				} else {
					System.out.println("---LoggedIn ---");
					System.out.println("welcome " + bank.firstName);

					while (true) {
						System.out.println("1)Wid\n2)Dep\n3)CheckBal\n4)Logout\nEnter your choice ");
						subChoice = scr.nextInt();
						
						
						if(subChoice == 4) {
							System.out.println("Thank you.....");
							break;
						}else {
							System.out.println("you selected "+subChoice);
						}
					}
				}
				break;
			case 2 + 1:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			}

		}
//		after login
//		2.1)	Wid
//		2.2)	Dep
//		2.3)	CheckBalance
//		2.4) 	Logout 
//		

	}

}

class Bank {

	String firstName, email, password;
	int balance;

	void signup() {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter FirstName , email And Password");
		this.firstName = scr.next();
		this.email = scr.next();
		this.password = scr.next();
	}

	boolean login(String e, String pwd) {

		return this.email.equalsIgnoreCase(e) && this.password.equals(pwd);// true

	}
}
