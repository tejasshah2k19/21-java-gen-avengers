package string;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {

		// take email from user and check it's in proper format or not.
		// valid format : XXX@XXX.XXX [ X can be any from -> A-Za-z0-9 ]

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String");
		String email = scr.next();
		// tejas@t.com
		email = email.toLowerCase();
		boolean isValid = true;
		if (email.contains("@") && email.contains(".")) {
			if ((email.indexOf('@') < email.lastIndexOf('.')) && (email.lastIndexOf('.') > email.indexOf('@') + 1)) {

				for (int i = 0; i < email.length(); i++) {
					if (i != email.indexOf('@') && i != email.lastIndexOf('.')) {
						if (!(email.charAt(i) >= 'a' && email.charAt(i) <= 'z')) {
							isValid = false;
							System.out.println("else 1 => " + i);
							break;
						}
					}
				}
			} else {
				System.out.println("else 2");
				isValid = false;
			}

		} else {
			System.out.println("else 3");
			isValid = false;
		}

		if (isValid) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid email");
		}

	}
}
