package prac;

import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int choice;

		int userCounter = 0;
		Contact c[] = new Contact[7];// 7 object -> null --> non primitive --> new --> constructor
		// c[0] c[1] c[2] ...c[6]
		while (true) {
			System.out.println(
					"1 For Add\n2 For List\n3 For Exit\n4 for Search by character\n5 For sort\nEnter your choice");

			choice = scr.nextInt();

			switch (choice) {
			case 1:
				if (userCounter == 7) {
					System.out.println("----------List is full------");
				} else {
					c[userCounter] = new Contact();
					c[userCounter].getData();
					userCounter++;
				}
				break;
			case 2:
				for (int i = 0; i < userCounter; i++) {
					c[i].printData();
				}
				break;
			case 3:
				System.exit(0);
			case 4:
				System.out.println("Enter search character(s)");
				String search = scr.next();
				for (int i = 0; i < userCounter; i++) {
					if (c[i].name.startsWith(search)) { // ram --> rp
						c[i].printData();
					}
				}

				break;
			case 6:
				Contact tmp = null;

				for (int i = 0; i < userCounter; i++) {
					for (int j = 0; j < userCounter - 1; j++) {
						if (c[j].name.compareTo(c[j + 1].name) > 0) {
							tmp = c[j];
							c[j] = c[j + 1];
							c[j + 1] = tmp;
						}
					}
				}
				for (int i = 0; i < userCounter; i++) {
					c[i].printData();
				}

				break;
			}
		}
	}
}

class Contact {

	String name, city, contactNum;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name and city");
		name = scr.next();
		city = scr.next();
		System.out.println("Enter contact num");
		contactNum = scr.next();
	}

	void printData() {
		System.out.println(name + "  " + contactNum + "  " + city);
	}
}