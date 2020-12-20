package LinkedListConcept;

import java.util.Iterator;
import java.util.LinkedList;

import ListConcept.Employee;

public class LinkedListConcept {

	public static void main(String[] args) {

		// Non Generic support all data type
		LinkedList li = new LinkedList();

		li.add("test");
		li.add(2);
		System.out.println(li);
		System.out.println("*****Li1******");
		LinkedList<String> li1 = new LinkedList<String>();
		li1.add("Vaibhav");
		li1.add("M");
		li1.add("test");
		li1.add("QA");
		System.out.println(li1);
		System.out.println("***********");
		li1.addFirst("First");
		li1.addLast("Last");
		System.out.println(li1);
		System.out.println("***********");
		System.out.println("index at 2 "+li1.get(2));
		System.out.println("***********");
		li1.set(2, "changed");
		System.out.println("index at 2 "+li1.get(2));
		System.out.println(li1);
		System.out.println("***********");
		li1.remove(2);
		System.out.println(li1);
		System.out.println("***********");
		li1.removeFirst();
		System.out.println(li1);
		System.out.println("***********");
		li1.removeLast();
		System.out.println(li1);
		System.out.println("******FOREACH*****");
		for(String str:li1) {
			System.out.println(str);
		}
		System.out.println("******while*****");
		int num=0;
		while(li.size()>num) {
			System.out.println(li.get(num));
			num++;
		}
		System.out.println("******Iterator*****");
		Iterator it=li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("******Iterator*****");
		LinkedList<Employee> lm=new LinkedList<Employee>();
		Employee e1 = new Employee("vaibhav", 27, "QA");
		Employee e2 = new Employee("vruda", 28, "Dev");
		Employee e3 = new Employee("Vibha", 29, "Admin");
		lm.add(e1);
		lm.add(e2);
		lm.add(e3);
		
		Iterator<Employee> itr=lm.iterator();
		while(itr.hasNext()) {
			Employee emp= itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		
	}

}
