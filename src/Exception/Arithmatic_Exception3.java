package Exception;

public class Arithmatic_Exception3 {
	public static void main(String[] args) {
		int v=555;
		int x=0;
		
		try {
			int d=v/x;
			System.out.println(d);
		}
		catch(Throwable f) {
			System.out.println("handled");
		}
	}

}
