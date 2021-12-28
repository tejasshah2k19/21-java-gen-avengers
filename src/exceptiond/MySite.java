package exceptiond;

import java.util.Scanner;

public class MySite {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter email and password");
		String email = scr.next();
		String password = scr.next();

		GoogleApi api = new GoogleApi();

 			//c = a/b 
			boolean ans = api.authenticate(email, password);

			if (ans == true) {
				System.out.println("login done");
			} else {
				System.out.println("invalid credentials");
			}
 
	}
}
