package studystuff_interview_questions_all;

public class CustomException 

{
	static int age=8;
	public String toString()
	{
		return "You are not eligible for vote";
		
	}
	
	public int hashCode()
	{
		System.out.println("In hash Code method");
		return 0;
		
	}
	
	
	
	public static void main(String []str)
	{
		
		CustomException obj=new CustomException();
		//InsertionSort obj=new InsertionSort();
		if(age<18)
			System.out.println(obj);
		else
			System.out.println("You are eligible for vote");
		//System.out.println(obj.hashCode());
		
		
		
	}
	
}



/*Java toString() method

If you want to represent any "current class object" as a string, toString() method comes into existence.

The toString() method returns the string representation of the object.

If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.*/