package studystuff_interview_questions_all;

public class ReverseOfWords 


{

	static String str="This is my name";
	public static void main(String[] args) 
	
	{
		String arr[]=str.split("\\s");
		for(String temp:arr)
		{
				char ar[]=temp.toCharArray();
				for(int i=ar.length-1;i>=0;i--)
				{
					System.out.print(ar[i]);
				}
				System.out.print(" ");
		}
		
		

	}

}
