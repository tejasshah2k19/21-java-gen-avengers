package amazon;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.javafx.binding.SelectBinding.AsDouble;

public class Amazon {

	public static void main(String[] args) {

		ArrayList<UserBean> users = new ArrayList<>();
		ArrayList<ProductBean> products = new ArrayList<>();

		// dummy users
		UserBean dummy1 = new UserBean("ram", "ram@gmail.com", "ram123");
		UserBean dummy2 = new UserBean("ravan", "ravan@gmail.com", "ravan123");
		UserBean dummy3 = new UserBean("sita", "sita@gmail.com", "sita123");
		UserBean dummy4 = new UserBean("arjun", "arjun@gmail.com", "arjun123");
		UserBean admin = new UserBean("admin", "admin@admin.com", "admin");
		admin.setAdmin(true);
		users.add(dummy1);
		users.add(dummy2);
		users.add(dummy3);
		users.add(dummy4);
		users.add(admin);

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
						boolean adminMenuRepeat = true;
						// user found -- correct
						System.out.println("Login done......");
						//
						if (users.get(i).isAdmin() == true) {
							// admin-menu

							while (adminMenuRepeat) {
								System.out.println(
										"\n0 For Logout\n1 For Add Product\n2 For List Products\nEnter choice");
								int adminChoie = scr.nextInt();

								switch (adminChoie) {
								case 0:
									System.out.println("Thank you for visiting us....");
									adminMenuRepeat = false;
									break;
								case 1:
									// add product
									System.out.println("Enter product name and price ");

									String productName = scr.next();
									int productPrice = scr.nextInt();

									ProductBean product = new ProductBean(productPrice, productName);
									products.add(product);

									break;
								case 2:
									System.out.println("*********** INVENTORY ******************");
									for (int j = 0; j < products.size(); j++) {
										System.out.println(products.get(j).getProductId() + "   "
												+ products.get(j).getProductName() + "  " + products.get(j).getPrice());
									}

									break;

								}// switch - admin menu
							} // while - admin menu
						} else {
							// customer - menu
							boolean repeatCustomerMenu = true;
							int customerChoice = -1;

							while (repeatCustomerMenu) {
								System.out.println(
										"0 For Logout\n1 For View Products\n2 For Add To Cart\n3 For View Cart\nEnter your choice..");
								customerChoice = scr.nextInt();

								switch (customerChoice) {
								case 0:
									System.out.println("Thank you.....");
									repeatCustomerMenu = false;
									break;
								case 1:
									// view all products
									System.out.println("*********** Product List ******************");
									System.out.println("ProductId ---- Name ---- price-----");
									for (int j = 0; j < products.size(); j++) {
										System.out.println(products.get(j).getProductId() + "   "
												+ products.get(j).getProductName() + "  " + products.get(j).getPrice());
									}
									break;
								case 2:
									// add to cart
									System.out.println("Enter productId for cart");
									int productCartId = scr.nextInt(); // productId --> cart
									for (int j = 0; j < products.size(); j++) {
										if (products.get(j).getProductId() == productCartId) {
											users.get(i).carts.add(products.get(j));
										}
									}
									break;
								case 3:
									// loop
									for (int j = 0; j < users.get(i).carts.size(); j++) {
										System.out.println(users.get(i).carts.get(j).getProductName());
									}
									break;
								}
							} // while -customer menu
						} // else customer -menu
						break;
					}

				}

				//
				if (isLoggedIn == false) {
					System.out.println("Invalid Credentials.....");
				}
				break;
			case 3:
				System.exit(0);

			}// switch

		} // while
	}
}
