package studystuff_interview_questions_all;

public class OopsChild extends OopsParent

{
	
/*	public void house()
	{
		System.out.println("child class function");
	}
*/
	
	public static void main(String[] args) 
	
	{
		OopsChild obj1=new OopsChild();
		OopsParent obj2=new OopsParent();
		
		obj1.house();
		obj2.house();
		OopsParent obj3=new OopsChild();
		obj3.house();
	}

}
