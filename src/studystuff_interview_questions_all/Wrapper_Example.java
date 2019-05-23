package studystuff_interview_questions_all;


// difference between intValue() function and parseInt("String argument") function

public class Wrapper_Example 

{

	public static void main(String[] args) 
	
	
	{
	
				int a=10;
				byte b=10;    // byte has range from -128 to +127
				String str="10";
				String str1="10.5";
				short s=20;
				char c='p';
				
		Integer i=new Integer(a);  // Autoboxing: primitive to class
		Double dd=new Double(a);
		int k=i.intValue();   // Unboxing: class to primitive
		int j=b;  // byte can be directly assigned/converted to int, no wrapping is required
		int l=c;  // character can be directly assigned/converted to int, no wrapping is required, will give ascii value as output
		int z=i.parseInt(str);    // parseInt() is required to asssigned/convert string value in int, Also it will through runtime error if string is not of compatible type with int
		double n=dd.parseDouble(str1);
		int x=s;
		double d=i.doubleValue();
		float f=i.floatValue();
		
		System.out.println(k);
		System.out.println(j);
		System.out.println(l);
		System.out.println(z);
		System.out.println(n);
		System.out.println(x);
		System.out.print("Sum of all is: ");
		System.out.println(k+j+l+z+x);
		System.out.println(d);
		System.out.println(f);
				
	}

}
