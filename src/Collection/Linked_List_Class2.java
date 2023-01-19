package Collection;

import java.util.LinkedList;

public class Linked_List_Class2 {
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add(null);
		ls.add(500);
		ls.add("ovi");
		ls.add(null);
		ls.add("supriya");
		
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		System.out.println(ls.contains(500));
		System.out.println(ls.get(3));
		ls.add(2, 200);
		System.out.println(ls);
		ls.remove(2);
		System.out.println(ls);
	}
	

}
