package collectionsd;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// set -->unique ,
		// HashSet --> unordered
		// TreeSet --> sorted

//		HashSet<Integer> hs = new HashSet<>();
		TreeSet<Integer> hs =new TreeSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(-10);
		hs.add(-100);
		hs.add(101);
		hs.add(125);
		hs.add(6);
		hs.add(-9);
		hs.add(99);
		hs.add(30);
		
		System.out.println(hs);
		
		
		for(Integer x:hs) {
			System.out.println(x);
		}

		System.out.println("size==>");
		System.out.println(hs.size());
		
		System.out.println(hs.subSet(30, 500));//30 ---499 
		System.out.println(hs.tailSet(101));

		System.out.println(hs.headSet(101));

		//key:Value 
		//json 
		//map -- key : value 
		
		// 10lac 50lac 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
