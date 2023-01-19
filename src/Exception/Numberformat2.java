package Exception;

public class Numberformat2 {
	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("4A1"));
		}
		catch(NumberFormatException w) {
			System.out.println("good");
		}
	}

}
