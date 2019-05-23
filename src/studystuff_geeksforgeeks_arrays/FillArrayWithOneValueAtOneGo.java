package studystuff_geeksforgeeks_arrays;

import java.util.Arrays;

public class FillArrayWithOneValueAtOneGo 

{

	// To Fill Array With One Value At One Go, there is a method of class Arrays called as fill()
	
	 
	public static void main(String[] args) 
	
	{
		int ar1[]= {1,22,34,56,3,19,18,90};	
		
		int ar2[]= {1,22,34,56,3,19,18,90};
		int ar3[][]= {{1,22,34,56,3,19,18,90},{10,20,30}};
		int ar4[][]= {{1,22,34,56,3,19,18,90},{1,200,3}};
		FillArrayWithOneValueAtOneGo obj=new FillArrayWithOneValueAtOneGo();
		
		obj.fillFewElementsOfArrayAtOneGo(ar1);
		obj.fillAllElementsOfArrayAtOneGo(ar2);
		obj.fillFewElementsOf2DArrayAtOneGo(ar3);
		obj.fillAllElementsOf2DArrayAtOneGo(ar4);
	}
	
	
	public void fillFewElementsOfArrayAtOneGo(int ar[])
	{
		Arrays.fill(ar,1,3,10);
		System.out.println(Arrays.toString(ar));
	}
	
	public void fillAllElementsOfArrayAtOneGo(int ar[])
	{
		Arrays.fill(ar, 10);
		System.out.println(Arrays.toString(ar));
	}
	
	
	public void fillFewElementsOf2DArrayAtOneGo(int[][] ar)
	{
		for(int ar6[]:ar)
		{
			Arrays.fill(ar6,0,2, 10);
		}
		
		System.out.println(Arrays.deepToString(ar));
		
	}
	

	
	public void fillAllElementsOf2DArrayAtOneGo(int[][] ar)
	{
		for(int ar5[]:ar)
		{
			Arrays.fill(ar5, 10);
		}
		
		System.out.println(Arrays.deepToString(ar));
		
	}

}
