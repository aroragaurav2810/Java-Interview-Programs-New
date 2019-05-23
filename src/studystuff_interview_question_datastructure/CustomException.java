package studystuff_interview_question_datastructure;

public class CustomException 

{

	public String toString()
	{
		return "You are not eligible for vote";
		
	}
	
	
	
	public static void main(String []str)
	{
		//InsertionSort obj=new InsertionSort();
		System.out.println(new CustomException());
		
		
		
	}
	
}



/*Java toString() method

If you want to represent any "current class object" as a string, toString() method comes into existence.

The toString() method returns the string representation of the object.

If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.*/