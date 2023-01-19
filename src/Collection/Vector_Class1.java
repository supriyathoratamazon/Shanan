package Collection;
import java.util.Vector;
public class Vector_Class1 {
	public static void main(String[] args) {
	Vector v=new Vector();
	v.add(100);
	v.add(null);
	v.add("pratiksha");
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.isEmpty());
	System.out.println(v.contains(null));
	System.out.println(v.get(2));
    v.add(1,0);
    System.out.println(v.get(1));
	System.out.println(v);
	v.remove(1);
	System.out.println(v);
	}
}
