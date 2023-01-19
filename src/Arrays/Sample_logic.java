package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Sample_logic {
	public static void main(String[] args) {
		Integer ar[]= {10,20,30,40,50};
		System.out.println("given array:"+Arrays.toString(ar));
		Collections.reverse(Arrays.asList(ar));
		System.out.println("reverse array:"+Arrays.toString(ar));
						
	}

}
