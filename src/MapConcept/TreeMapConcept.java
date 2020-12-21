package MapConcept;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer,String> map= new TreeMap<>();
		
		map.put(50000, "VM");
		map.put(40000, "BA");
		map.put(600000, "XYZ");

		map.forEach((k,v)->System.out.println("key"+k+"Value "+v));
	
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
	
	Set<Integer> less5=map.headMap(50000).keySet();
	System.out.println(less5);
	
	Set<Integer> greater5=map.tailMap(50000).keySet();
	System.out.println(greater5);
	
	}

}
