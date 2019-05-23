package studystuff_interview_question_datastructure;

public class Split_a_String_Using_Space 


{
	
	// Rverse of words in string, It is different from reverse of characters on string
	
	public static void main(String[] args) 
	{
		
		
		String str1="India is Great";
		String []str2=str1.split("\\s");
		for(int i=str2.length-1; i>=0;i--)
		{
			System.out.println(str2[i]);
		}
		
	}

}
