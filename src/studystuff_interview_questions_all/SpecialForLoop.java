package studystuff_interview_questions_all;

public class SpecialForLoop {

	public static void main(String[] args)
	
	{
		
			String s1="java string split method by javatpoint";  
			String[] words=s1.split("\\s");//splits the string based on whitespace  
			//using java foreach loop to print elements of string array  
			for(String temp:words)
			{  
			System.out.println(temp);  
			}  

	}

}
