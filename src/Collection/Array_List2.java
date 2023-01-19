package Collection;
import java.util.ArrayList;
public class Array_List2 {
	public static void main(String[]args) {
	ArrayList s=new ArrayList();
	s.add("ankush");
	s.add(300);
	s.add('s');
	s.add(null);
	s.add('s');
	s.add(300);
	s.add(null);
	System.out.println(s);
	System.out.println(s.size());
	System.out.println(s.isEmpty());
	System.out.println(s.contains('s'));
	System.out.println(s.get(4));
	s.add(2,"ankush");
	System.out.println(s.get(2));
	System.out.println(s);
	s.remove(2);
	System.out.println(s);
	
	
	
	
	}
	

}
