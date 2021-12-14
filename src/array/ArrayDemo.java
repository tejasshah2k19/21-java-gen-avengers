package array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		// array --> data type --> non primitive
		// java type data type ?
		// 2
		// primitive --- non primitive
		// 8 class,object,array,enum

		// a[] a[][] a[][][] a[][][][]
		// 1D 2D MD/ND

		int a[] = { 1, 2, 3, 4, 5 }; // array declare -> assign -> 5 => 1,2,3,4,5

		int b[] = new int[5];// b => size -> 5 -> value --> 0

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter number");
			b[i] = scr.nextInt();
		}
		System.out.println("Elements----");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// search
		// 1 22 3 44 5
		// enter number to search?
		// 420
		// not found

		// 1 22 3 44 5
		// enter number to search?
		// 22
		// found

		// 1 22 3 22 5
		// enter number to search?
		// 22
		// 22 found at 2 location
		// 22 found at 4 location
		// 22 found 2 times

	}
}
