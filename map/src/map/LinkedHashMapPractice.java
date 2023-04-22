package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapPractice {
	
	public static void main(String[] args) {
		Map<Integer, Character> map=new LinkedHashMap<>();
		
		
		map.put(1,'S');
		map.put(2,'U');
		map.put(3,'N');
		map.put(null,null);
		
		Set<Integer> keySet = map.keySet();
		
		for (Integer integer : keySet) {
			
			System.out.println(integer+" "+map.get(integer));
		}
		
		for (Map.Entry<Integer, Character> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Character val = entry.getValue();
			
			System.out.println(key+" "+val);
			
		}
		
		
		
	}

}
