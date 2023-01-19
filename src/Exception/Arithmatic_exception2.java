package Exception;

public class Arithmatic_exception2 {
	public static void main(String[] args) {
		int m=55;
		int n=0;
		
		try {
			int o=m/n;
			System.out.println(o);
		}
		catch(Throwable g) {
			System.out.println("done");
			
		}
		System.out.println("happy");
		
		
	}

}
