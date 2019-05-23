package studystuff_geeksforgeeks_string;

public class StringConstantAndStringObjects 
{

	public static void main(String[] args)
	{
		
		// String Objects creates on the heap
		// Along with String object on heap, a string contant also creates on string pool but it is assigned to object only.
			String str=new String("Gaurav");
		
		// String constant creates on the String pool
			str="Arora";
			
	}

}
