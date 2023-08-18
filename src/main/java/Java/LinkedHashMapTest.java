package Java;

import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	static LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

	public static void main(String args[]) {
		LinkedHashMapTest mapTest = new LinkedHashMapTest();

		
		mapTest.add(4, "four");
		
		mapTest.add(5, "four");
		mapTest.add(6, "four");
		mapTest.add(7, "four");
		mapTest.add(8, "four");
		mapTest.add(1, "one");
		mapTest.add(2, "two");

		System.out.println(linkedHashMap);
	}

	public void add(int key, String value) {
		int memorySize = 5;
		// hit
		int firstElement = 0;
		if (linkedHashMap.size() >= memorySize) {
			for (Map.Entry<Integer, String> mapEntrys : linkedHashMap.entrySet()) {
				firstElement = mapEntrys.getKey();
				break;
			}
			linkedHashMap.remove(firstElement);
		}
		linkedHashMap.put(key, value);
	}

	public void get(int key) {
		if (linkedHashMap.containsKey(key)) {
			String value = linkedHashMap.get(key);
			linkedHashMap.remove(key);
			linkedHashMap.put(key, value);
			// no hit
		} else {
			System.out.println("if nothing is available ::" + key);
		}
	}

}

// Search(x)
