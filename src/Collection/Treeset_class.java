package Collection;

import java.util.TreeSet;

public class Treeset_class {
public static void main (String[]args) {
	TreeSet ts=new TreeSet();
	ts.add(500);
	ts.add(100);
	ts.add(400);
	ts.add(200);
	
	//duplicates not allowed
	System.out.println(ts);
}
}
