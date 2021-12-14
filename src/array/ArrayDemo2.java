package array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int b[] = new int[5];// b => size -> 5 -> value --> 0

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter number");
			b[i] = scr.nextInt();
		}
		System.out.println("-----Elements----");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// sorting

		// 33 4 55 44 6
		// asc->4 6 33 44 55
		// dsc-> 55 44 33 6 4

		int tmp = -1;
		// 0 < 4 - 0 1 2 3

		for (int j = 1; j < b.length; j++) {
			for (int i = 0; i < b.length - 1; i++) {
				if (b[i] > b[i + 1]) {
					tmp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = tmp;
				}
			}
		}
		System.out.println("-----array Elements after soring----");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
