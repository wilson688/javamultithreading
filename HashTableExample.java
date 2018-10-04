package javamultithreading;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	// synchronized 
	// slower than hash map cause it is synchronized 
	// it is not ordered 
	public static void main(String[] args) {
		
		Hashtable<Integer, String> htable = new Hashtable<>(); 
		htable.put(100, "AAA");
		htable.put(101, "BBB");
		htable.put(102, "CCC");
		htable.put(103, "DDD");
		
		for(Map.Entry hm: htable.entrySet()) {
			System.out.println(hm.getKey()+ " "+hm.getValue());
		}

		htable.remove(102);
		
		System.out.println("--------After removing------------");
		
		for(Map.Entry hm: htable.entrySet()) {
			System.out.println(hm.getKey()+ " "+hm.getValue());
		}

	}
	
}
