package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListObject {

	public static <E> void main(String[] args) {
	
		//generic ArrayList for Objects
ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee class Objects:
		Employee e1 = new Employee("vaibhav", 27, "QA");
		Employee e2 = new Employee("vruda", 28, "Dev");
		Employee e3 = new Employee("Vibha", 29, "Admin");
		
		//create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
	}

}
