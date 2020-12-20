package ListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		ArrayList ar= new ArrayList();
			ar.add(1);
			ar.add(2);
			ar.add("test");
			ar.add(10.2);
			ar.add(true);
			System.out.println(ar.get(4));
			

			for (Object item : ar) {
				System.out.println(item);
			}
			
			System.out.println("*************");
			ArrayList<String> ar1= new ArrayList<String>();
			
			ar1.add("vaibhav");
			ar1.add("M");
			for (String item : ar1) {
				System.out.println(item);
			}
			System.out.println("*************");
	ArrayList<Integer> ar2= new ArrayList<Integer>();
			
			ar2.add(255);
			ar2.add(6332);
			for (Integer item : ar2) {
				System.out.println(item);
			}
			
			System.out.println("*************");
			ArrayList<Integer> ar5= new ArrayList<Integer>();
			ar5.add(10);
			ar5.add(20);
			ar5.add(30);
			ArrayList<Integer> ar6= new ArrayList<Integer>();
			ar6.add(40);
			ar6.add(50);
			ar6.add(30);
			
			ar5.addAll(ar6);
			for (Integer item : ar5) {
				System.out.println(item);
			}
			System.out.println("*************");
			ar5.removeAll(ar6);
			for (Integer item : ar5) {
				System.out.println(item);
			}
			System.out.println("*************");
			ar5.retainAll(ar6);
			for (Integer item : ar5) {
				System.out.println(item);
			}
	}

}
