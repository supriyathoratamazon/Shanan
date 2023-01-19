package Collection;

import java.util.LinkedList;

public class Linked_List_Class {
	public static void main (String[] args) {
		LinkedList l=new LinkedList();
		l.add("supriya");
		l.add(500);
		l.add('a');
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		 
		//size
		System.out.println(l.size());
		
		//contains
	 System.out.println(l.contains('b'));
	
	 //insertion right shift
	 l.add(2,"sups");
	 System.out.println(l);
	 
	 //left shift
	 l.remove(2);
	 System.out.println(l);
	 
	 //get the data
	 System.out.println(l.get(4));
	 
	 //isEmpty check it is empty
	 System.out.println(l.isEmpty());
	
	}
	

}
