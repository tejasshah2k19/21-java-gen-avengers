package collectionsd;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(10);
		pq.add(100);
		pq.add(101);
		pq.add(-10);
		pq.add(-100);
		pq.add(1000);
		pq.add(10);
		pq.add(25);
		System.out.println(pq);

		// poll --> element -- remove
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		System.out.println(pq.size());

		// duplicate unsorted ordered
		// duplicate unsorted** unordered

	}
}
