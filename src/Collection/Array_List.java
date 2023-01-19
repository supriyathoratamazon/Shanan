package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {
public static void main (String[]args) {
	ArrayList al=new ArrayList();
	al.add("Ganesh");
	al.add(100);		
	al.add("supriya");
	al.add(null);
	al.add("Ganesh");
	al.add("Ganesh");
	al.add(500);
	al.add("Ganesh");
	al.add('s');
	
	/*//i need to print entire data inside the collection
	System.out.println(al);

   //check the size 
	System.out.println(al.size());  //total al.add=9

  //check whether it is empty
	System.out.println(al.isEmpty());  //false

  //contains or not
	System.out.println(al.contains(100)); //true if we add 200 then false
	
	//get the particular index
	System.out.println(al.get(2));  //0=ganesh ; 1=100 ; 2= supriya.
	
	//insertion(right shift operator)
	al.add(2,500);
	System.out.println(al.get(2));  //500
	
	//print entire data
	System.out.println(al);  //right shift operator
	
	//remove the data (left shift operation)
    al.remove(2); //left shift
    System.out.println(al); */
	System.out.println("print the data using iterator");
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());

}
}
}