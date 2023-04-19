package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	
	public static void main(String[] args) {
		   Set set=new HashSet();
		   
		   set.add(12);
		   set.add(20);
		   set.add(13);
		   set.add(12);
		   set.add(10);
		   set.add(5);
		   set.add(null);
		   set.add(null);
		   
		   Set set1=new LinkedHashSet();

		  
		   set1.add(12);
		   set1.add(20);
		   set1.add(13);
		   set1.add(12);
		   set1.add(10);
		   set1.add(5);
		   set1.add("ABC");
		   set1.add(null);
		   
		   
		   Set set2=new TreeSet();
		   
		   
		   set2.add("KSRT");
		   set2.add(20);
		   set2.add(19);
		   set2.add(12);
		   set2.add(10);
		   set2.add(5);
		  // set2.add(null);
		  // set2.add(null);
		   
//		 Iterator iterator = set.iterator();
//		 
//		 while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		 for (Object object : set) {
//			System.out.println(object);
//		}
		 
		 
		   
		   System.out.println(set2);
	}
	
}
