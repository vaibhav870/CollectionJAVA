package MapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {
		Hashtable empdetails = new Hashtable();

		empdetails.put("vaibhav", 50000);
		empdetails.put("vibhav", 600000);
		empdetails.put("Vibha", 70000);

		Hashtable h2=new Hashtable();
		h2=(Hashtable) empdetails.clone();
		
		System.out.println("Data of H1"+empdetails);
		System.out.println("Data of H1"+h2);
		
		empdetails.clear();
		
		System.out.println("Data of H1"+empdetails);
		System.out.println("Data of H1"+h2);
		System.out.println(h2.hashCode());
		
		Hashtable st=new Hashtable();
		st.put("A","data1");
		st.put("B","data2");
		st.put("C","data3");
		if(st.contains("data1")) {
			System.out.println("data found");
		}
		
			System.out.println(st.hashCode());
	Enumeration e= st.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	}
	
	

}
