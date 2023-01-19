package Methods;

public class Static_method_call_from_same_class {
	public static void main(String[] args) {//main method body open
    moneyTransfer();
	recharge();
	electricity(); 	
		
	}//main method body close
	public static void moneyTransfer() {//m1 block is open
		System.out.println("hii");
		System.out.println("bye");
		System.out.println("how r u");
	}//m1 block close
	public static void recharge() {//regular method 2
		System.out.println("good morning");
		System.out.println("good evening");
		System.out.println("good night");
	}
   public static void electricity() {
   System.out.println("phone bill paid");
   System.out.println("AC bill paid");
   System.out.println("cooler bill paid");
}
}
