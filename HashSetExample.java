package javamultithreading;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
    HashSet<String> hset = new HashSet<>(); 
    //Default initial capacity is 16 and default load is 0.75 
    hset.add("ADD"); 
    hset.add("SUB"); 
    hset.add("MUL"); 
    hset.add("ADD"); 
    
    Iterator<String> itr = hset.iterator(); 
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    System.out.println("--------LINKED HASH SET--------------");
    /*
    LinkedHasSet contains unique element like hashset and it extends hashset 
    and implement the set interface.and It mains insertion order*/
    
    LinkedHashSet<String> hset2 = new LinkedHashSet<>(); 
    hset2.add("AAA");hset2.add("AAA");hset2.add("AAA");hset2.add("BBB"); 
    Iterator<String> itr2 = hset2.iterator(); 
    while(itr2.hasNext()) {
    	System.out.println(itr2.next());
    }
    
    System.out.println("--------TREE HASH SET--------------");
    
    /*
    TreeSet implement SortedSet no duplicates are allowed 
    Sorted by Keys 
    Used for storing large amount of sorted data which can access quikcly (faster access & retriveval )
    Red-Black Tree*/
    
    TreeSet<String> tset = new TreeSet<>(); 
    tset.add("ZZZ");tset.add("AAA");tset.add("DDD");tset.add("CCC"); 
    Iterator<String> itr3 = tset.iterator(); 
    while(itr3.hasNext()) {
    	System.out.println(itr3.next());
    }
    
    System.out.println("--------PRIORITY QUEUE--------------");
    /*
    Priority queue doesn't accept NULL pointers 
    Queue retrieval operations poll, remove, peek and element access the element at the head of the queue 
    head of the queue is the least element with respect to the specified ordering */
    
    PriorityQueue <String> queue = new PriorityQueue<>(); 
    queue.add("C");
    queue.add("C++");
    queue.add("Java");
    queue.add("Python");
    queue.add("Ruby");
    
    System.out.println("head"+queue.element());
    System.out.println("Accessing the most priority element ");
    System.out.println("head value using peek function "+queue.peek());
    
    System.out.println("Iterating the queue elements ");
    boolean b=queue.contains("C"); 
    System.out.println("Priority queue contains C "+"or not?"+b);
    
    Iterator<String> itr4 = queue.iterator(); 
    while(itr4.hasNext()) {
    	System.out.println(itr4.next());
    }
    
    queue.remove(); 
    System.out.println("head "+queue.element());
    queue.poll(); 
    
    System.out.println("After removing two elements ");
    Iterator<String> itr5=queue.iterator(); 
    while(itr5.hasNext()) {
    	System.out.println(itr5.next());
    }
    
    
    
}
}
