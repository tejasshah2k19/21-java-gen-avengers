package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {

		ArrayList<UserBean> users = new ArrayList<>();

		Scanner scr = new Scanner(System.in);
		int choice = -1;
		while (true) {
			System.out.println("0 for List all users\n1 For Signup\n2 For Login\n3 For exit\nenter your choice");
			choice = scr.nextInt();

			switch (choice) {
			case 0:

				for (int i = 0; i < users.size(); i++) {
					System.out.println(users.get(i).getFirstName());
				}
				break;

			case 1:
				System.out.println("enter firstname email and password");
				String firstName = scr.next();
				String email = scr.next();
				String password = scr.next();
				UserBean user = new UserBean(firstName, email, password);
				users.add(user);
				break;
			case 2:
				System.out.println("Enter email and password");
				email = scr.next();
				password = scr.next();

				boolean isLoggedIn = false;
				for (int i = 0; i < users.size(); i++) {

					if (users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(password)) {
						isLoggedIn = true;
						break;
					}

				}

				if (isLoggedIn == false) {
					System.out.println("Invalid Credentials.....");
				} else {
					//
				}
				break;
			case 3:
				System.exit(0);

			}// switch

		} // while
	}
}
