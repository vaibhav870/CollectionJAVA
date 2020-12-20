package MapConcept;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> m= new HashMap<Integer,String>();
		m.put(1, "vaibhav");
		m.put(2, "test");
		m.put(3, "vvm");
		System.out.println(m);
		System.out.println("*******************");
		Iterator it= m.entrySet().iterator();
		
		java.util.List<String> empname=new ArrayList<String>(m.values());
		
		for(String item:empname) {
			System.out.println(item);
		}
		
java.util.List<Integer> empkey=new ArrayList<Integer>(m.keySet());
		
		for(Integer item:empkey) {
			System.out.println(item);
		}
		System.out.println("*******************");
		System.out.println(m.get(2));
		System.out.println("*******************");
		for(Entry em:m.entrySet()) {
			System.out.println("Key: "+em.getKey()+" Value: "+em.getValue());
		}
		System.out.println("*******************");
		m.remove(3);
		System.out.println(m);
		System.out.println("*******************");
		HashMap<Integer,Employee>em=new HashMap<Integer,Employee>();
		Employee e1 = new Employee("vaibhav", 27, "QA");
		Employee e2 = new Employee("vruda", 28, "Dev");
		Employee e3 = new Employee("Vibha", 29, "Admin");
		em.put(1, e1);
		em.put(2, e2);
		em.put(3, e3);
		
		for(Entry<Integer, Employee> item:em.entrySet()) {
			int k=item.getKey();
			Employee emp=item.getValue();
			
			System.out.println("Employee "+emp.name+ " "+emp.age+" "+emp.dept);
		}
		
		
		
		
	}

}
