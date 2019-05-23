package studystuff_geeksforgeeks_string;


import java.util.*;
public class StringTokenizerClass

{

	// StringTokenizer is a class in java that is used to break/tokenize a string into tokens 
	// by the use of delimiters in their constructor
	
    public static void main(String args[])
    {
        System.out.println("Using Constructor 1 - ");
        StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
        while (st1.hasMoreTokens())
        {
        	System.out.println(st1.nextToken());
        }
        
        
        System.out.println("Using Constructor 2 - ");
        // This constructor of StringTokenizer class does not have a flag 
        //thus it breaks/tokenizes a string on the basis of passed delimiter.
        StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
        while (st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }
        
        
        System.out.println("Using Constructor 3 - ");
        // This constructor of StringTokenizer class is having a flag that also prints the delimiter you passes 
        // to break/tokenize a string.
        StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :",  true);
        while (st3.hasMoreTokens())
        {
        	System.out.println(st3.nextToken());
        }
            
    }
}