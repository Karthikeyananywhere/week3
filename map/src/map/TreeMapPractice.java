package map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapPractice {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map=new TreeMap();
		map.put(2,"ABHIRAMI");
		map.put(3,"BHAVANA");
		map.put(1,"CHITRA");
		map.put(4,"DHIVYA");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+" "+val);
		}
		
		Comparator<String> compare=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return map.get(o1).compareTo(o2);
			}
		
			
		};
		
		SortedSet<Integer> sort=new TreeSet(compare);
		
		sort.addAll(map.keySet());
			
		
		System.out.println(sort);
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
