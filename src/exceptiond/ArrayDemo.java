package exceptiond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);// resource -->
		System.out.println("enter size of an array");
		int n = scr.nextInt();
		int a[] = new int[n];

		try {
			for (int i = 0; i < a.length; i++) {

				System.out.println("Enter number");
				a[i] = scr.nextInt();

			}
			System.out.println("----elements-----");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}

		} catch (NullPointerException e) {
			System.out.println("please enter only integers");
		} catch (InputMismatchException e) {

		} catch (Exception e) {

		} finally {
			System.out.println("I am RajniKant....");
			scr.close();
		}

		System.out.println("end");
	}
}
