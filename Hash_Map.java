package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Hash_Map {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		map.put(5, "May");

		System.out.println(map.get(2));
		
		System.out.println(map.containsKey(3));
		
		map.put(4, "Dec");
		
		//map.remove(4);
		//map.remove(5, "May");
		//map.clear();
		
		Set<Integer> set1 = map.keySet();
		Set<String> set2 = (Set<String>) map.values();
		Set<Entry<Integer, String>> set3 = map.entrySet();
		
		System.out.println(map);
		
		System.out.println("----------------------------------------");
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
	}

}
