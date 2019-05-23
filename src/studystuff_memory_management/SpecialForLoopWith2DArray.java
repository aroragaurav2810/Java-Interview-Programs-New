package studystuff_memory_management;

public class SpecialForLoopWith2DArray 

{

	public static void main(String[] args) 
	
	{
			
		int ar[][];
		//ar[0]=new int[3];
		//ar[1]=new int[2];
		//ar[2]=new int[4];
		ar=new int[][]{{10,20,30},{40,50},{60,70,80,90}};
		
		for(int []temp_ar:ar)
		{
			for(int temp:temp_ar)
			{
				System.out.print("\t"+temp);
			}
			System.out.println();
		}
		

	}

}
