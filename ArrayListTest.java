package javamultithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


class Emp1234 {
	private int empId; 
	private String empName; 
	private double empSal;
	public Emp1234(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Emp1234 [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	
}
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("Aditya"); 
		list.add("Aditya1");
		list.add("Aditya2");
		list.add("Aditya3");
		list.forEach(System.out::println);
		
		for(String a1:list) {
			System.out.println(a1);
		}
		
		Emp1234 e1 = new Emp1234(1001, "Fantine", 12345.0);

		Emp1234 e2 = new Emp1234(1002, "Deepa", 32345.0);

		Emp1234 e3 = new Emp1234(1003, "Sowmya", 70000.0);

		Emp1234 e4 = new Emp1234(1001, "Fantine", 12345.0);

		Emp1234 e5 = new Emp1234(1005, "John", 32345.0);

		Emp1234 e6 = new Emp1234(1005, "Sam" , 70000.0);

		List<Emp1234> emp = new ArrayList<>(); 
		emp.add(e1); emp.add(e2); emp.add(e3); 
		System.out.println(emp.get(1));
		
		List<Emp1234> emp1 = new ArrayList<>(); 
		emp1.add(e4); emp1.add(e5); emp1.add(e6);
		
		//emp.removeAll(emp1);
		//emp.retainAll(emp1);
		
		Iterator<Emp1234> itr = emp.iterator();
		/*while(itr.hasNext()) {
			Emp1234 e = (Emp1234) itr.next(); 
		    System.out.println(e.getEmpId()+e.getEmpName()+e.getEmpSal());	
		}*/
		
		ListIterator<Emp1234> itr2 = (ListIterator<Emp1234>) emp.listIterator(); 
		while(itr2.hasNext()) {
		System.out.println(itr2.next());	
		}
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
	}

}
