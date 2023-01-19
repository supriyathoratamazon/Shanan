package Collection;

import java.util.LinkedHashSet;

public class Linked_hashset {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("s");
		lhs.add(200);
		lhs.add("ovi");
		lhs.add(null);
		lhs.add(null);
		lhs.add(200);
		
		//duplicates r not allowed it print serialwise no random nd duplicates in there.
		System.out.println(lhs);
	}

}
