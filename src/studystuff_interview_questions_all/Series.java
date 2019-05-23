package studystuff_interview_questions_all;

public class Series 

{

	
	void ascendingOrderSeries()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
	

	
	void descendingOrderSeries()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	
	{
		
			Series obj=new Series();
			System.out.println("Below is the ascending Series:");
			obj.ascendingOrderSeries();
			System.out.println();
			System.out.println("Below is the descending Series:");
			obj.descendingOrderSeries();
			
			
			
			
		
		

	}

}
