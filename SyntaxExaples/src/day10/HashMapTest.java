package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> strIntMap = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			strIntMap.put("key0" + i, new Integer(100 + i));
		}
		
		System.out.println("strIntMap containsKey key08: " + strIntMap.containsKey("key08"));
		System.out.println("strIntMap containsKey key089: " + strIntMap.containsKey("key089"));
		
		System.out.println("strIntMap get key08: " + strIntMap.get("key08"));
		System.out.println("strIntMap get key089: " + strIntMap.get("key089"));
		
		
		System.out.println("strIntMap: " + strIntMap);
		Integer value = strIntMap.remove("key08");
		System.out.println("value: " + value);
		strIntMap.remove("key0899");

		System.out.println("strIntMap count: " + strIntMap.size());
		
		Integer key089 = strIntMap.get("key089");
		System.out.println("key089: " + key089);
		
		
		Set<String> keys = strIntMap.keySet();
		System.out.println("keys: " + keys);
		
		Collection<Integer> values = strIntMap.values();
		System.out.println("values: " + values);
		
		strIntMap.clear();
		System.out.println("after clear strIntMap count: " + strIntMap.size());

	}

}
