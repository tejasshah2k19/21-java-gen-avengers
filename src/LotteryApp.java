import java.util.Random;
import java.util.Scanner;

public class LotteryApp {

	public static void main(String[] args) {
		final int MAX_USERS = 10;
		User user[] = new User[MAX_USERS];
		Scanner scr = new Scanner(System.in);

		int choice;
		int userCounter = 0;
		while (true) {
			System.out.println(
					"1 For Signup\n2 Spin the Wheel\n3 For Dashboard\n4 For winner\n5 For LeaderBoard\n0 For Exit\\nEnter your choice");
			choice = scr.nextInt();
			switch (choice) {
			case 1:

				if (userCounter == MAX_USERS - 1) {
					System.out.println("sorry all tickets are sold!!!!");
				} else {
					user[userCounter] = new User(); //
					user[userCounter].signup();
					userCounter++;
				}
				break;
			case 2:
				// lottery number - 1
				// user ==> [user1,user2,user3] 0 1 2
				// 0.923122 *10 => 9

				Random r = new Random();
				int winIndex = r.nextInt(userCounter);
				System.out.println(
						"winner is ==> " + user[winIndex].email + " with lottery num " + user[winIndex].lotteryNum);
				user[winIndex].credit += 1000;
				// Random class

			case 3:
				for (int i = 0; i < userCounter; i++) {
					user[i].dashboard();

				}
				break;
			case 0:
				System.exit(0);
			}
		}

	}
}

class User {
	int lotteryNum;
	int credit;
	String email, password;

	User() {
		this.credit = 0;
	}

	void signup() {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter email and password");
		email = scr.next();
		password = scr.next();

		// 0.1234567889 => 12345
		// 0.012345 => 1234
		lotteryNum = (int) (Math.random() * 100000);
	}

	void dashboard() {
		System.out.println(email + " " + lotteryNum + " " + credit);
	}
}