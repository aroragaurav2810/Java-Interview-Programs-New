package studystuff_interview_questions_all;

public class ReverseOfWords2 

{
	static String str="This is my name";
	static String new_str="";
	public static void main(String[] args) 
	
	{
			for(int i=str.length()-1;i>=0;i--)
			{
				
				new_str=new_str+str.charAt(i);
			}
			
			String str_array[]=new_str.split("\\s");
			for(int j=str_array.length-1;j>=0;j--)
			{
				System.out.print(str_array[j]+" ");
			}
			

			
	}

}
