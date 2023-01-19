package Exception;

public class Numberformat {
public static void main(String[] args) {
	try {
	System.out.println(Integer.parseInt("99A44"));
}
	catch (NumberFormatException r) {
		System.out.println("handled");
		
	}
}
}
