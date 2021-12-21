package exceptiond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			Scanner scr = new Scanner(System.in);

			System.out.println("two numbers?");

			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b;// try hit throw
			System.out.println("div = " + c);
		} catch (ArithmeticException e) {
			System.out.println("please do not enter zero.....");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only integers/whole numbers");
		} catch (NullPointerException e) {
			System.out.println("Our resources are not ready please try after some time...");
		} catch (Exception e) {
			System.out.println("something went wrong please try after sometime.....");
			// sendExceptionMailToDev(e,"tejas@gmail.com");

		}
	}
}
//royal ==> 