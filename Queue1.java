package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// Queue work as fifo - first in first out. 
		
		// linkedlist using to created
		Queue<Integer> qu=new LinkedList<>();
		qu.add(10);
		qu.add(50);
		qu.add(20);
		qu.add(30);
		qu.add(40);
		System.out.println("queue linklist: "+qu);
		System.out.println("queue remove :"+qu.remove());// no varibles are there its throws exception 
		System.out.println("queue linklist: "+qu);
		System.out.println("queue poll: "+qu.poll()); // no variables are there its give null output
		System.out.println("queue linklist: "+qu);
		System.out.println("element "+qu.element());
	
		
		// priortyQueue using to created
		PriorityQueue <String> pq=new PriorityQueue<>();
		pq.add("a");
		pq.add("c");
		pq.add("b");
		pq.add("m");
		pq.add("b");
		pq.add("d");
		
	
		System.out.println("priority queue :"+pq);
		System.out.println("peek : "+pq.peek()); // get 1st data and not remove variable.
		System.out.println("priority queue :"+pq);
		  // push and pop option not in Queue .only in Deque.
		Deque <Integer> dq=new LinkedList<>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		System.out.println("deque "+dq.poll()); // remove,pop =same as remove 1st variable if null found throws exception
		dq.push(25); // add in first position
		dq.push(75);
		dq.add(250); // add at end position
		System.out.println("deque:"+dq);
		dq.offer(100);
		System.out.println("deque:"+dq);


	}

}
