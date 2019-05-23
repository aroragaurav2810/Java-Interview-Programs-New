package studystuff_interview_questions_all;

public class TutorialPoint_Questions 

{
	static char x='*';
	
	public static void main(String[] args) 
	
	
	{
		for(int i=5; i>=1;i--)
		{
			System.out.println();
			for(int j=i; j>=1;j--)
			{
				System.out.print(x);
			}
		}
		
		for(int i=2; i<=5;i++)
		{
			System.out.println();
			for(int j=1; j<=i;j++)
			{
				System.out.print(x);
			}
		}

	}

}
