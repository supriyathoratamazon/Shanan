package Exception;

public class Numberformat1 {
	public static void main(String[] args) {
		try {
		System.out.println(Integer.parseInt("5533S4477"));
	}
		catch (Throwable d) {
			System.out.println("handle");
		}

}
}