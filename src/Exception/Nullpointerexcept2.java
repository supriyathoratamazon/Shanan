package Exception;

public class Nullpointerexcept2 {
	int i=20;
	public static void main(String[] args) {
		try {
			Nullpointerexcept2 d=null;
			System.out.println(d);
		}
		catch(Throwable d) {
			System.out.println("i");
		}
	}

}
