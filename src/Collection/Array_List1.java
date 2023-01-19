package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List1 {
public static void main (String[]args) {
	ArrayList al=new ArrayList();
	al.add("Supriya");
	al.add(500);
	al.add('s');
	al.add(null);
	al.add("Supriya");
	al.add(500);
	
/*	System.out.println(al);
	
	System.out.println(al.size());
	
	System.out.println(al.isEmpty());
	System.out.println(al.contains(500));
	System.out.println(al.get(4));
	al.add(2,5);
	System.out.println(al.get(2));
	System.out.println(al);
	
	al.remove(2);
	System.out.println(al); */
	//it is not used method we go with only iterators
	System.out.println("print the data using listiterator");
	ListIterator i = al.listIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}

}
