package studystuff_interview_questions_all;



class Overriding_Example2 
	
	{

		public	Overriding_Example2 function1()
			{
				System.out.println("Overriding function of class Overriding Example2");
				return this;
			}
	
		public void function2()
		{
			System.out.println("Overloading function of class Overriding Example2");
		}
	}



public class Overriding_Example extends Overriding_Example2
{

	public Overriding_Example function1()  // overriding function, // Mukund please check here for a new case, return type is not same as i told you about the same syntax for overriding function
	// logic is given at last, point 3, during compatible return type, we can change the syntax
	{
		System.out.println("Overridden function of class Overriding Example");
		return this;
	}
	
	public void function2(int x, int y)  // not an overriding function
	{
		System.out.println("Overloaded function of class Overriding Example");
		
	}
	
public static void main(String[] args)
	
	{
		Overriding_Example2 obj1=new Overriding_Example();
		obj1.function1();  
		obj1.function2();
}

}

//  Important:
//  Overriding methods are called based upon objects
//	Overloading methods are called base upon reference
//  We can change the return type of overriding methods only in case of compatible covarient type(User Class Name(Overriding_Example, Overriding_Example2), System Class Name(Object, Integer etc)) 
//  For e.g Let's say The overriden function has return type of "parent class" 
//  thus its overriding method can keep return type of parent Class/sub class.
//  We can not change the return type of overriding methods in case of primitive data type, because there is no mean of compatiblity/relationship
//  The above example is the best example of dynamic/late binding because, for compiler it is not know until run time that which function would be invoked
