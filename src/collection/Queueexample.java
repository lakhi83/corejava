package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queueexample {

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("nick");
		pq1.add("Mathew");
		pq1.add("Lisa");
		
		
		System.out.println(pq1);
		
		
		System.out.println("First element"+pq1.peek());
		System.out.println("First element"+pq1.poll());
		System.out.println(pq1);
		
		ArrayDeque<String> dq2 = new ArrayDeque<String>();
		dq2.add("nick");
		
		dq2.add("lisa");
		
		dq2.add("mathew");
		
		System.out.println(dq2.peek());
		System.out.println(dq2.peekFirst());
		System.out.println(dq2.peekLast());
		
		System.out.println(dq2.poll());
		System.out.println(dq2.pollFirst());
		System.out.println(dq2.pollLast());
		
		
		
		
		
	}

}
