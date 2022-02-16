package collectionsd;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "one");
		hm.put(2, "one+one");
		hm.put(3, "one");

		System.out.println(hm);

		System.out.println(hm.get(1));

		hm.put(3, "three");
		System.out.println(hm);

		hm.remove(3);
		System.out.println(hm);

		// custom sort -> asc -->desc
		//
	}
}
