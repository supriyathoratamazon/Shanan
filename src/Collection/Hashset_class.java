package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_class {
	public static void main (String[]args) {
	
	HashSet	hs=new HashSet();
	hs.add("supriya");
	hs.add(200);
	hs.add('a');
	hs.add(null);
	

	
	/*//ramdom take data duplicates are not allowed it prints 1.
	System.out.println(hs); */
	System.out.println("print the data using iterator");
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		System.out.println("hii helloo vatavata");
	}
			
		
	}
	

}
