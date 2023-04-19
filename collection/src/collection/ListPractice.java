package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListPractice {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<>();

 
		list1.add(23);
		list1.add(2);
		list1.add(3);
		list1.add(33);
		list1.add(233);
	//	list1.add("sdfg");
	
		System.out.println(list1);
		
		
		for (int i = 0; i < list1.size(); i++) {
			Integer input=(Integer) list1.get(i);
			System.out.println(input);
		}
		
		LinkedList list=new LinkedList(); 
		list.add(23);
		list.add(2);
		list.add(3);
		list.add(33);
		list.add(233);
		
		list.addFirst(000000);
		list.addLast(99);
		
		System.out.println(list);
		
		System.out.println(list.poll());
		
		System.out.println(list);
		
		Iterator descendingIterator = list.descendingIterator();
		
    
		 while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		
		
		Iterator iterator = list.iterator(); 
		
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		} 
	
		
	
	}

}
