package office_studystuff;

public class Reverse 

{

	public static void main(String[] args)
	
	
	{
		
		String str="ravinder";
		char arr[]=stringReverse(str);
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		

	}
	
	   public static char[] stringReverse(String str)
		{
			
			return str.toCharArray();
			
		}
	
	

}
