package studystuff_interview_questions_all;

public class CustomExceptionFindByName extends Exception

{
	static int age=8;
	
	
	
	public CustomExceptionFindByName(String message)
	{
		
		super(message);
		
	}
	
	
}



/*Java toString() method

If you want to represent any "current class object" as a string, toString() method comes into existence.

The toString() method returns the string representation of the object.

If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.*/