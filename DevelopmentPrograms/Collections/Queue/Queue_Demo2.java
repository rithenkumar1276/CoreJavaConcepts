package com.evergent.CoreJava.Collections.Queue;
import java.util.PriorityQueue;

public class Queue_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(9);
		pq.add(30);
		pq.add(5);
		pq.add(7);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

}
