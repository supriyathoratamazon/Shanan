package Exception;

public class Nullpointerexcept {
	int i=10;
	public static void main(String[] args) {
		try {
		Nullpointerexcept ref=null;
		System.out.println(ref);
	}
catch (Throwable ref) {
	System.out.println("i");
}
	
}
}
