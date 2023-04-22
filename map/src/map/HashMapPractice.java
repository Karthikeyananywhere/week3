package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<Integer, String> map=new HashMap();

		
		map.put(1, "KARTHIKEYAN");
		map.put(2, "KARTHIKEYAN");
		map.put(3, "RONALDO");
		map.put(4, "MESSI");
		
		
		Map <Integer,String> map1=new WeakHashMap();
		
		
		Integer num1=new Integer(12);
		Integer num2=new Integer(10);
		
		map1.put(num1, "KARTHI");
		map1.put(num2, "KARTHI");
		
		
		num1=null;
		
		System.gc();
		
		System.out.println(map1);
		
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		Iterator<Integer> iterator2 = map.keySet().iterator();
		
		while (iterator2.hasNext()) {
			System.out.println(map.get(iterator2.next()));
		}
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+"  "+val);
		}
		
		Map<String, String> map2=new IdentityHashMap<>();
		
		String s=new String("KEY");
		String s1=new String("KEY");
		
		map2.put(s, "yes");
		map2.put(s1, "no");
		
		System.out.println(map2);
		
//		map.entrySet()
//		  .stream()
//		  .sorted(Map.Entry.comparingByValue())
//		  .forEach(System.out::println);
//		
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	  
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}
}
