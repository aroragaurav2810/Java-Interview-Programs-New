package studystuff_interview_questions_all;

public class CoVarient_Return_Type_Example 
{

	public  CoVarient_Return_Type_Example function1()
	{
			return this;
	}
	
	public void message() {
		
		System.out.println("Gaurav");
	}

	public static void main(String[] args) 
	
	{
			CoVarient_Return_Type_Example obj=new CoVarient_Return_Type_Example();
			//System.out.println(obj);
			obj.function1().message();
			//obj.message();
	}

	

}



// This example can also be used as the best example for run time exception because
// If we use return null, then on run time application throws null pointer erxception