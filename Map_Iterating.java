package maps;

import java.security.KeyStore.Entry;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Map_Iterating {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		TreeMap<Integer, Double> map = new TreeMap<Integer, Double>();
		
		map.put(10, Math.sqrt(10));
		map.put(10, Math.sqrt(20));
		map.put(10, Math.sqrt(30));
		map.put(10, Math.sqrt(40));
		map.put(10, Math.sqrt(50));
		
		for(java.util.Map.Entry<Integer, Double> e : map.entrySet()) {
			System.out.println(e);
	}
	
	}
			
} 		
	

