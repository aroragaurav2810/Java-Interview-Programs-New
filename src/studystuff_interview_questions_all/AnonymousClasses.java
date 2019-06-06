package studystuff_interview_questions_all;

// To understand anonymous class, you just need to know,
// Anonymous class is an inner class which is used under a class where you need 
// to override the function of another class without making relationship/inheritance with that class
// Here you just create the object of class/interface and then turn then object to just anonymous inner class
// Override was only possible with inheritance but now exception is you can override a method of any class using anonymous class without inheritance 
// Sorting with Comparator is the best example for anonymous class because there we implement/override compare method (of comparator interface using anonymous class) in test class to sort something 
// without making any relationship/inheritance of comparator interface with test class and    
// this is the advantage of comparator over comparable that we do not need to implements comparator unlike comparable (where implements mandatory)



interface Host
{
	// Unimplmented method
	public void checkMethod();
}

abstract class Host1
{
	// Unimplmented method
	public abstract void checkMethod1();
	
	public void checkMethod1(int a)
	{
		
	}
	
}

class Host2
{
	
	
	
	public void checkMethod2()
	{
		
	}
	
}


class AnonymousClasses
{
	// Anonymous inner class of interface
	Host host=new Host() 
	{
		// Overridden or implemented method by anonymous class, without applying the logic of inheritance
		@Override
		public void checkMethod() 
		{
		System.out.println("Implemented method by anonymous class, without applying the logic of inheritance");		
		}
	
	};
	
	// Anonymous inner class of abstract class
	Host1 host1=new Host1() 
	{
		// Overridden or implemented method by anonymous class, without applying the logic of inheritance
		@Override
		public void checkMethod1() 
		{
		System.out.println("Implemented method by anonymous class, without applying the logic of inheritance");		
		}
	
		
		@Override
		public void checkMethod1(int b) 
		{
		System.out.println("Implemented method by anonymous class, without applying the logic of inheritance");		
		}
		
	};
	
	// Anonymous inner class of class
	Host2 host2=new Host2() 
	{
		// Overridden or implemented method by anonymous class, without applying the logic of inheritance
		@Override
		public void checkMethod2() 
		{
		System.out.println("Implemented method by anonymous class, without applying the logic of inheritance");		
		}
	
	};
	
	
	public static void main(String args[])
	{
		
	}
	
	
}



/*
The anonymous class expression consists of the following:

    The new operator

    The name of an interface to implement or a class to extend. In this example, the anonymous class is implementing the interface HelloWorld.

    Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression. Note: When you implement an interface, there is no constructor, so you use an empty pair of parentheses, as in this example.

    A body, which is a class declaration body. More specifically, in the body, method declarations are allowed but statements are not.

Because an anonymous class definition is an expression, it must be part of a statement. In this example, the anonymous class expression is part of the statement that instantiates the frenchGreeting object. (This explains why there is a semicolon after the closing brace.)
 
 
 
 */
