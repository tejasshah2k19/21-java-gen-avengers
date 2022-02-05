package collectionsd;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();

		hs.add(20);
		hs.add(-20);
		hs.add(230);
		hs.add(55);
		hs.add(-1);
		hs.add(36);
		hs.add(5000);// true
		hs.add(20);// false
		System.out.println(hs);
		System.out.println(hs.size());//int 

		// print all the elements from set
		for (Integer x : hs) {
			System.out.println(x);
		}

		hs.remove(2000);//false 
		hs.remove(20);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(123));//false 
		System.out.println(hs.contains(55));//true 
		
		hs.clear();
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());//true 
		
	}
}
