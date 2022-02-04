package collectionsd;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		// n number
		// print

		Scanner scr = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		int num;

		for (int i = 1; i <= 3; i++) {
			System.out.println("enter number");
			num = scr.nextInt();
			numbers.add(num); // add --> insert --> index --> 0
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println(numbers);// Iterable

	}

	void intro() {

		// 1.5
		ArrayList list = new ArrayList(); // <Object>
		// add any thing---any data type
		list.add(1);// 0
		list.add("two"); // 1

		System.out.println(list.get(0));// 1
		System.out.println(list.get(1));// two

		// 1.6
		ArrayList<Integer> ilist = new ArrayList<Integer>();

		// 1.7
//		ArrayList<Integer> ilist = new ArrayList<>();
		ilist.add(1);
//		ilist.add("two");

	}
}
