package String_class;

public class String_methods1 {
	public static void main(String[] args) {
		String s1 ="supriya";
		String s2="SUPRIYA";
		String s3="priya";
		
		System.out.println(s1.length());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(6));
		System.out.println(s1.concat(s3));
		System.out.println(s2.substring(3));
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.indexOf('a'));
		
		
		
		
	}

}
