package studystuff_interview_questions_all;

public class Instance_Of_Operator 

{
		static String str1=new String();  // an instance of String
		static String str2;   // not an instance of String
	public static void main(String[] args)
	
	{
		if(str1 instanceof String)
		{
			System.out.println("str1 is an instance of String");
		}

		if(str2 instanceof String)
		{
			System.out.println("str2 is not an instance of String");
		}
		
	}

}
