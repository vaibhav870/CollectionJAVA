package MapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchConcurrentMap {

	public static void main(String[] args) {
		Map<String,String> map1= new HashMap<String,String>();
		
		map1.put("1", "First");
		map1.put("2", "Second");
		map1.put("3", "Third");

		
		Map<String,String>synchmap=Collections.synchronizedMap(map1);
		
		System.out.println(synchmap);
		
		
		
		Map<String,String>map2=new ConcurrentHashMap<String,String>();
		
		map2.put("A","java");
		map2.put("B","QA");
		map2.put("C","Python");
		System.out.println(map2);
	}

}
