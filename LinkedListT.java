package javamultithreading;

import java.util.LinkedList;

public class LinkedListT {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(); 
		list.add("A1");list.add("A2");list.add("A3");list.add("A4");
		list.add("A5");
		
		System.out.println(list);
		
		list.addFirst("First Item");
		list.addLast("Last Item");
		
		System.out.println(list);
		
		Object firstvar1 = list.get(0); 
		System.out.println(firstvar1);
		list.set(0,"Updated first item"); 
		
		Object firstvar2 = list.get(0); 
		System.out.println("First element after update by set method "+firstvar2);
		
		list.removeFirst(); list.removeLast(); 
		System.out.println("LinkedList after deletion "+list);
		
		list.add(0, "newly added item"); 
		System.out.println("Final updates "+list);
	}
}
