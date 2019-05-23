package studystuff_interview_questions_all;

interface Interface1
{
	
}


class Class2 implements Interface1
{
	
}

class Class3 extends Class2
{
	
}

public class Instance_Of_Operator_Example2 extends Class2

{
	
	static Instance_Of_Operator_Example2 obj1=new Instance_Of_Operator_Example2();
	

	public static void main(String[] args) 
	
	{
	
		if(obj1 instanceof Instance_Of_Operator_Example2)
		{
			System.out.println("Obj1 is an instance of Class Instance_Of_Operator_Example2, easy understood" );
		}
		
		if(obj1 instanceof Class2)
		{
			System.out.println("Obj1 is an instance of Class2 due to inheritance" );
		}
		
		if(obj1 instanceof Interface1)
		{
			System.out.println("Obj1 is an instance of Interface1 due to indirect inheritance/relation" );
		}
		
		/*if(obj1 instanceof Class3)
		{
			System.out.println("Obj1 is not an instance of Class3 due to no relation even no indirect inheritance/relation" );
		}*/
		

	}

}
