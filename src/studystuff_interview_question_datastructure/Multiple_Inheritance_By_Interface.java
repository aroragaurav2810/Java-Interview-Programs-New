package studystuff_interview_question_datastructure;



class Example21
{
	public void function1()
	{
		System.out.println("function of class Example21");
	}
	
}


class Example22
{
	boolean x;
	public void function1()
	{
		System.out.println("function of class Example22");
	}
	
	
}



interface Example23
{
	public void function1();
	public void function2();
}

interface Example24
{
	public void function2();
}


public class Multiple_Inheritance_By_Interface extends Example21 implements Example23,Example24

{

	
	@Override
	public void function1() 
	{
		System.out.println("Overriding function");	
		
	}

	
	@Override
	public void function2() 
	{
			System.out.println("Implemented functions");
		
	}

	
	public static void main(String[] args) 
	{
		
		
		Multiple_Inheritance_By_Interface obj1=new Multiple_Inheritance_By_Interface();
		obj1.function1();
		obj1.function2();
		System.out.println();
		
		Example23 obj2=new Multiple_Inheritance_By_Interface();
		obj2.function1();
		obj2.function2();
		System.out.println();
		
		Example24 obj3=new Multiple_Inheritance_By_Interface();
		obj3.function2();
		System.out.println();
		
		Example21 obj4=new Multiple_Inheritance_By_Interface();
		obj4.function1();
		System.out.println();
		
		Example21 obj5=new Example21();
		obj5.function1();
		System.out.println();
		
		Example22 obj6=new Example22();
		obj6.function1();
	}


	
	
}
