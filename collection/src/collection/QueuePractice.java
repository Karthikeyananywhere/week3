package collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		Queue quueue = new LinkedList();
		
		Queue queue1=new PriorityQueue();
		
		Queue queue2=new ArrayDeque();
		
	
		//queue1.add(null);
		queue1.add(12);
		queue1.add(12);
		
		System.out.println(queue1);

		
		
		quueue.add("A");
		quueue.add("B");
		quueue.add("C");
		quueue.add("D");
		quueue.add("F");
		quueue.add("G");
		quueue.add("A");
		quueue.add(null);
		quueue.add(null);
		
		
		

		System.out.println(quueue);

		System.out.println(quueue.contains("A"));

		System.out.println(quueue.element());

		quueue.offer("Z");

		// quueue.clear();

		quueue.peek();

		System.out.println(quueue.poll());

		System.out.println(quueue);

		
		Comparator<String> compare = (a,b)->{
			return a.compareTo(b);
		};
		
		
		Queue queue4=new PriorityQueue(compare);
		
		queue4.add("ANAND");
		queue4.add("CHARLES");
		queue4.add("FIN");
		queue4.add("BOB");
		queue4.add("DAVID");
		
		System.out.println(queue4);
		
	}

}
