package collectionsd;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		// methods
		list.add(12);//
		list.add(13);// 0
		System.out.println(list.get(0));// index --> start with 0
		// remove item from array list
		list.remove(0);// 0th index will remove // 12 will remove
		// count total elements -- size of array list
		System.out.println(list.size());
		list.add(0, 30);// 0 -> 30 , 1 -> 13
		System.out.println(list);// 30 13

		// check an element is prenet in list or not ?

		// if you want to check particular element is present in list or not ?
		// we can use contains method.

		// below line search for number 5000 in list and return false bcz
		// its not present in list
		System.out.println(list.contains(5000));// false

		// below line search for number 30 in list and return true bcz
		// its present in list
		System.out.println(list.contains(30));// true

		list.clear();// remove all the elements from list
		
		//Vector
	}
}
