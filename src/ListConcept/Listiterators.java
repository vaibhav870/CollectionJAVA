package ListConcept;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiterators {

	public static void main(String[] args) {
		ArrayList<String> tvseries = new ArrayList<String>();
		tvseries.add("Scam1992");
		tvseries.add("Panchayat");
		tvseries.add("Kota Factory");
		tvseries.add("ASur");
		tvseries.add("Pichers");

		// 1 forEach and lambda

		System.out.println("********forEach and Lambda**********");

		tvseries.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("********Basic Iterator**********");

		// 2 iterator
		Iterator<String> shows = tvseries.iterator();
		while (shows.hasNext()) {
			String show = shows.next();
			System.out.println(show);
		}

		//3 	ListIterator 
		System.out.println("********List Iterator**********");
		ListIterator<String> shows1=tvseries.listIterator(tvseries.size());
		while(shows1.hasPrevious()) {
			System.out.println(shows1.previous());
		}
		
		
		//4 iterator and ForEachRemaining
		
		System.out.println("********iterator and ForEachRemaining********");
		tvseries.iterator().forEachRemaining(shows2->{
				System.out.println(shows2);
		});
		
		//5 Simple forEach 
		System.out.println("********ForEach********");
		for(String shows3:tvseries) {
			System.out.println(shows3);
		}
		
		
		//6  for loop using index
		System.out.println("********For Loop Index********");
		
		for(int i=0;i<tvseries.size();i++) {
			System.out.println(tvseries.get(i));
		}
	}

}
