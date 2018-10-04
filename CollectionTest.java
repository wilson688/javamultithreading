package javamultithreading;

import java.util.*; 

class Product implements Comparable<Product> {
   int prodId; 
   String prodName; 
   
   public Product(int prodId, String prodName) {
	this.prodId = prodId; 
	this.prodName = prodName; 
}
	
	@Override
	public int compareTo(Product arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class CollectionTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 
		
		list.add(10);list.add(11);list.add(12);list.add(13);list.add(14);list.add(15);
		
		Collections.max(list);
		Collections.min(list); 
		Collections.sort(list);
		list.add(Integer.valueOf(17));
		System.out.println(list);
		
		
		List<Product> prod = new ArrayList<>(); 
		prod.add(new Product(100, "SOAP")); 
		prod.add(new Product(101, "ABC")); 
		prod.add(new Product(102, "MUSIC")); 
		
		Collections.sort(list);
		for(Product prd:prod) {
			System.out.println(prd.prodId+" "+prd.prodName);
		}
		
	}
}
