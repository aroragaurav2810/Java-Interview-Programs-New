package studystuff_interview_questions_all;

// with objects of class type and Primitive type

public class Equals_Method_AND_Equals_Operator

{
	
	static String str1=new String("xyz");
	static String str2=new String("xyz");
	
	static Equals_Method_AND_Equals_Operator obj1=new Equals_Method_AND_Equals_Operator();
	static Equals_Method_AND_Equals_Operator obj2=new Equals_Method_AND_Equals_Operator();
	
	static Equals_Method_AND_Equals_Operator obj3=new Equals_Method_AND_Equals_Operator();
	static Equals_Method_AND_Equals_Operator obj4=new Equals_Method_AND_Equals_Operator();
	
	
	
	static Integer int1=new Integer(10);
	static Integer int2=new Integer(10);
	
	
	static Float float1=new Float(10);
	static Float float2=new Float(10);
	
	
	static String str3="xyz";
	static String str4="xyz";
	
	public static void main(String[] args) 
	
	{
		System.out.println("Is str1 == str2");
		System.out.println(str1==str2);// It checks the location of two object 
		
		System.out.println("Is str1 and str2 are equal");
		System.out.println(str1.equals(str2));// It checks the content of two objects but not the location , reason below
		
		System.out.println("Is obj1 == obj2");
		System.out.println(obj1==obj2);// It checks the location of two object
		
		System.out.println("Is obj1 and obj2 are equal");
		System.out.println(obj1.equals(obj2));// It checks the location of two objects
		
		System.out.println("Is int1 == int2");
		System.out.println(int1==int2);
		
		System.out.println("Is int1 and int2 are equal");
		System.out.println(int1.equals(int2));
		
		
		System.out.println("Is float1  == float2");
		System.out.println(float1==float2);
		
		System.out.println("Is float1 and float2 are equal");
		System.out.println(float1.equals(float2));
		
		System.out.println("Is str3 == str4");
		System.out.println(str3==str4); 
		
		System.out.println("Is str3 and str4 are equal");
		System.out.println(str3.equals(str4));
		
		System.out.println("Is str1 == str3");
		System.out.println(str1==str3);
		
		System.out.println("Is str1 and str3 are equal");
		System.out.println(str1.equals(str3));
		
		
		obj3=obj4;
		System.out.println("Assigned obj4 to obj3 Now Check, Is obj3 == obj4");
		System.out.println(obj3==obj4);// It checks the location of two object
		
		System.out.println("Is obj3 and obj4 are equal");
		System.out.println(obj3.equals(obj4));// It checks the location of two objects
		
		System.out.println("Is obj1 == obj2");
		System.out.println(obj1==obj2);// It checks the location of two object
		System.out.println("Is obj1 and obj2 are equal");
		System.out.println(obj1.equals(obj2));// It checks the location of two objects
		
		
	}

}




// This is the best ever interview question, I have ever seen and a SCJP guy should know this logic

// NOTE: clears the concept of equals() method and == operator

// NOTE: Generally, both equals() and == have the different logic or concept, meaning 


// wanted to clarify if I understand this correctly:

// == -> is a reference comparison, i.e. both objects point to the same memory location or not
// .equals() -> evaluates to the comparison of values in the objects of Classes like primitive classes(String, Integer, Float etc)



