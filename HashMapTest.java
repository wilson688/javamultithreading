package javamultithreading;

import java.util.HashMap;
import java.util.Map;

class Trainees {
	int traineeId; 
	String traineeName; 
	
	public Trainees(int traineeId, String traineeName) {
      this.traineeId=traineeId; 
      this.traineeName = traineeName; 

	}
}
public class HashMapTest {
	public static void main(String[] args) {
		
	System.out.println("--------Class------------------");
	Trainees t1 = new Trainees(111, "Sowmya"); 
	Trainees t2 = new Trainees(222, "Wilson"); 
	Trainees t3 = new Trainees(333, "Saripalli"); 
	
	HashMap<Integer, Trainees> hmap2 = new HashMap<>(); 
	hmap2.put(1,  t1); 
	hmap2.put(2, t2);
	hmap2.put(3, t3);
	
	for(Map.Entry<Integer, Trainees> hm:hmap2.entrySet()) {
    
		int key = hm.getKey(); 
		Trainees tt = hm.getValue(); 
		System.out.println("Trainees Id "+ tt.traineeId +" "+"TraineeName "+tt.traineeName);
	}
    
	
	System.out.println("---------HASH MAP----------------");
    HashMap<Integer, String> hmap = new HashMap<>(); 
    hmap.put(1000, "Fantine");
    hmap.put(1001, "Deepa");
    hmap.put(1002, "Firdouse");
    hmap.put(1003, "Sowmya");
    hmap.put(null, "Aditya");
    hmap.put(null, "Wilson");
    
    for(Map.Entry hm:hmap.entrySet()) {
    	System.out.println(hm.getKey()+ "  "+hm.getValue());
    }
    
    hmap.remove(1001);
    System.out.println("---------------------------------------------");
   
    for(Map.Entry hm:hmap.entrySet()) {
    	System.out.println(hm.getKey()+ "  "+hm.getValue());
    }
    
	}
}