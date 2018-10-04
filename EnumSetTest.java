package javamultithreading;

import java.util.*;

enum Coins {
	PENNY, NICKEL, DIME, QUARTER
}

public class EnumSetTest {
	public static void main(String[] args) {
    Set<Coins> set = EnumSet.of(Coins.QUARTER, Coins.NICKEL, Coins.QUARTER); 
    
    Iterator<Coins> itr = set.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    
    Set<Coins> set2 = EnumSet.allOf(Coins.class); 
    System.out.println("Coins"+set2);
    
    Set<Coins> set3 = EnumSet.noneOf(Coins.class);
    System.out.println("Coins"+set3);
    
	}
}
