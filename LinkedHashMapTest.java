package javamultithreading;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hmap = new LinkedHashMap<>(); 
		
		hmap.put(1000, "Sowmya"); 
		hmap.put(1001, "Sowmya"); 
		hmap.put(1002, "Wilson");
		
		for(Map.Entry hm :hmap.entrySet()) {
			System.out.println(hm.getKey() +" "+hm.getValue());
			
		}
		
		hmap.remove(1001);
		System.out.println("After removing");
		
		for(Map.Entry hm :hmap.entrySet()) {
			System.out.println(hm.getKey() +" "+hm.getValue());
			
		}
		
		System.out.println("------TREE MAP------------");
		TreeMap<Integer, String> tmap = new TreeMap<>(); 
		tmap.put(1005, "BBC");tmap.put(1006, "SSC");tmap.put(1007, "ZMB");
		
		for(Map.Entry hm: tmap.entrySet()) {
			System.out.println(hm.getKey()+ "  "+hm.getValue());
		}
		
	}
}
