package com.evergent.CoreJava.Collections.Queue;
import java.util.PriorityQueue;

public class Queue_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(9);
		System.out.println(pq);

	}

}
