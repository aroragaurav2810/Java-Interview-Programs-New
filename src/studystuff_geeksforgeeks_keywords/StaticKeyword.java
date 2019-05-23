package studystuff_geeksforgeeks_keywords;

public class StaticKeyword 

{

	// NOTE: Static keyword in java can be applied with variables, functions, inner classes and blocks
	
	static int a=m1();
	
	static
	{
		System.out.println("Gaurav");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Arora");

	}

	public static int m1()
	{
		System.out.println("static variable presented before static block so it executed first");
		return 10;
	}
	
}


// Static blocks executes first(but with one condition, see NOTE below) because it executes when class loads
// Thus main function also executes after this 

// NOTE: Very Important: static block and static variables are executed in order they are present in a program
// So In the given program , you can see the static variable is present above the static block in order so variable would execute first than the static block
