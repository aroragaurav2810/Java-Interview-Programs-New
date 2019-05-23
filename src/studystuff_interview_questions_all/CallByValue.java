package studystuff_interview_questions_all;

public class CallByValue 

{

	static int a=10;
	public void change(int a)
	{
		
		a=a-5; // changes done to local variable only
		
	}
	
	public static void main(String[] args) 
	{
			CallByValue obj=new CallByValue();
			System.out.println("Before change "+a);
			obj.change(a);
			System.out.println("After Change "+a);
	}

}


// In Java, there is no call by reference, only call by value is there

// What is call by value: call by value is calling a function by passing a value, which logically says that the 
// The changes being done in the called method, is not affected in the calling method 