package Collection;

import java.util.Vector;

public class Vector_class {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Supriya");
	v.add(100);
	v.add('z');
	v.add(null);
	v.add(null);
	
	//check the capacity
	System.out.println(v.capacity());  //capacity is 10 fix not more
	
	//print all data
	System.out.println(v);
	
	//size
	System.out.println(v.size());  //5
	
	//isempty
	System.out.println(v.isEmpty());  //false
	
	//get the particular data
	System.out.println(v.get(2));  //'z'
	
	//right shift
	v.add(2,"supriya");
	System.out.println(v);
	
	//remove (left shift)
	v.remove(2);
	System.out.println(v);
} 
}
