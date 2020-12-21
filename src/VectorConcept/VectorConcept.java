package VectorConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		Vector<Integer>v1=new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println(v1);
		
		System.out.println(v1.get(2));
		v1.remove(4);
		System.out.println(v1);

		
		Vector<Integer>v2=new Vector<>();
		v2.add(100);
		v2.add(200);
		v2.add(300);
		System.out.println(v2);
		v1.addAll(v2);
		System.out.println(v1);
		
		for (Integer integer : v1) {
			System.out.println(integer);
		}
		
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		Iterator<Integer> it= v1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.sort(v1);
		System.out.println(v1);
	}

}
