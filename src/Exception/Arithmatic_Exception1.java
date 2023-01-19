package Exception;

public class Arithmatic_Exception1 {
	public static void main(String[] args) {
		int c=5;
		int d=0;
		
		try {
		int	e=c/d;
		System.out.println(e);
		}
		catch (Throwable s) {
			System.out.println("exception is handled");
		}
		System.out.println("supriya");
	}

}
