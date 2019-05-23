package studystuff_geeksforgeeks_inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


// Difference Between Scanner and BufferedReader Class
// Point No 1:
// Though these two classes are used to read input from console or any resource but 
// The main difference is Scanner has some proble in reading string which is not in the case of BufferedReader
// After any nextInt()/nextFloat/nextDouble() function, nextLine() does not work though next() works.
// NOTE: That is why BufferedReader class is recommended over Scanner class.

// Point No 2:
// Scanner gives automatically wrapped methods like for integer reading it has nextInt() method, for float reading it has nextFloat() method and so on
// but BufferedReader has method called as readLine() which reads sequence of character and then you can parse it acc like into integer, float, double etc 

// Point No 3:
// BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and 
// BufferedReader simply reads sequence of characters.

// Point No 4:
// The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), 
// but it’s more than enough.

// Point No 5:
// BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and 
// BufferedReader simply reads sequence of characters

// Point No 6:
// BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.

// Point No 7:
// BufferedReader has significantly larger buffer memory than Scanner.

public class ScannerAndBufferReaderDifference {

	public static void main(String[] args) throws  Exception 
	
	{
		
		ScannerAndBufferReaderDifference obj=new ScannerAndBufferReaderDifference();
		obj.readingUsingScannerClass();
		obj.readingUsingBufferedReaderClass();
		
		

	}
	public void readingUsingScannerClass()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an Integer Value using scanner class");
	int a=sc.nextInt();
	
	
	System.out.println("Enter a Float value using scanner class");
	double b=sc.nextDouble();
	
	
	System.out.println("Enter a String value using scanner class");
	String c=sc.next();
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	
	public void readingUsingBufferedReaderClass() throws Exception, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an Integer Value using buffered reader class");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter a String value using buffered reader class");
		String b=br.readLine();
		
		System.out.println(a);
		System.out.println(b);

	}
}
