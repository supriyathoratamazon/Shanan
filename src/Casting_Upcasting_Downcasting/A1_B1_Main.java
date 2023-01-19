package Casting_Upcasting_Downcasting;

public class A1_B1_Main {//ULC
	public static void main(String[] args) {
		A1 p=new A1();
		System.out.println(p.a);
		p.m1();
		p.m2();
		
		A1 p1=new B1(); //upcasting by assigning child class object to parent class ref.
		p1.m1();
		p1.m2();
		
	}
	

}
