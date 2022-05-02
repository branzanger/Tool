package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapSample {

	public HashmapSample() {
		// TODO Auto-generated constructor stub
	}
	public class Person {
		String name;
		
	}
	
	public static void smallestNegativeBalance() {
		
	}

	public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
		return wordCounts.entrySet()
            .stream()
            .sorted((Map.Entry.<String, Integer>comparingByValue()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, 
            		LinkedHashMap::new));
}
	public static void main(String[] args) {
		HashMap<String, Integer> mymap = new HashMap<String, Integer>();
		mymap.put("Brandon", 1);
		mymap.put("Brand", 3);
		mymap.put("Bran", 2);
	
		for (Entry<String, Integer> entry : HashmapSample.sortByValue(mymap).entrySet()) {
			System.out.println(entry.getKey());
		}
		
	}

}
