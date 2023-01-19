package Collection;
import java.util.LinkedList;
public class Linked_List_Class1 {
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add("ovi");
		a.add(50);
		a.add("rushi");
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(50));
		System.out.println(a.get(0));
		a.add(0,"supriya");
		System.out.println(a.get(0));
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		
	}

}
