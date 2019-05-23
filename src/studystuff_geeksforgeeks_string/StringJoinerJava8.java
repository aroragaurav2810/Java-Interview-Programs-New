package studystuff_geeksforgeeks_string;


//Java program to demonstrate methods
//of StringJoiner class

import java.util.ArrayList;
import java.util.StringJoiner;


// StringJoiner is a class that introduced in Java8. As the name refers it is used to join string  with delimeters.


public class StringJoinerJava8 
{
	
	public static void main(String[] args)
		
		{
			ArrayList<String> al = new ArrayList<>();
     
		    al.add("Ram");
		    al.add("Shyam");
		    al.add("Alice");
		    al.add("Bob");
		     
		    StringJoiner sj1 = new StringJoiner(",");
		    
		    // setEmptyValue() method
		    sj1.setEmptyValue("String Joiner set some value to setEmpltyValue method");
		    System.out.println(sj1);
		     
		    // add() method
		    sj1.add(al.get(0)).add(al.get(1));
		    System.out.println(sj1);
		     
		    // length() method
		    System.out.println("Length of sj1 : " + sj1.length());
		     
		    StringJoiner sj2 = new StringJoiner(":");
		    sj2.add(al.get(2)).add(al.get(3));
		    System.out.println(sj2); 
		    
		    //merge() method
		    sj1.merge(sj2); 
		    // toString() method
		    System.out.println("Merging of SJ1 and SJ2: "+sj1.toString());
		     
		    
		  
		 }
}


	

	