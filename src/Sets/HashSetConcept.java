package Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		
	
	HashSet<Integer> hs1= new HashSet<>();
	
	
	hs1.add(10);
	hs1.add(20);
	hs1.add(30);
	hs1.add(40);
	hs1.add(50);
	hs1.add(60);
	hs1.add(70);
	hs1.add(null);
	System.out.println(hs1);
	
	
	System.out.println(hs1.contains(20));
	
	for (Integer integer : hs1) {
		System.out.println(integer);
	}
	
	
	
	Set<Integer> set1=new HashSet<>();
	set1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8}));
	System.out.println(set1);
	
	Set<Integer> set2=new HashSet<>();
	set2.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11}));
	System.out.println(set2);
	
	Set<Integer> union= new HashSet<Integer>(set1);
	union.addAll(set2);
	System.out.println(union);
	
	
	Set<Integer> interection= new HashSet<Integer>(set1);
	interection.retainAll(set2);
	System.out.println(interection);
	
	Set<Integer> diff= new HashSet<Integer>(set1);
	diff.removeAll(set2);
	System.out.println(diff);
	
	
	}
	
	
	

	
	
}
