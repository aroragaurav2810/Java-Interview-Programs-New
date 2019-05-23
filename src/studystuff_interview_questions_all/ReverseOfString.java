package studystuff_interview_questions_all;

public class ReverseOfString 

{

	public static void main(String[] args)
	
	{
			
		String str="India is my country";
		String str_array[]=str.split("\\s");
		for(int i=str_array.length-1;i>=0;i--)
		{
			
			System.out.print(str_array[i]+" ");
			//System.out.print("\t");
		}

	}

}
