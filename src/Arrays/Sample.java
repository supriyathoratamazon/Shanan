package Arrays;

public class Sample {
	public static void main (String[]args) {
	String ar[]=new String[4];
	ar[0]="Donkey";
	ar[1]="monkey";
	ar[2]="rinky";
	ar[3]="anky";
	//ar[4]="abc"; //AIOOBE (array index out of bound exception)
	
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]);
//System.out.println(ar[4]); //there is no data but still we r trying to fetch so we will get AIOOBE
		
	}

}
