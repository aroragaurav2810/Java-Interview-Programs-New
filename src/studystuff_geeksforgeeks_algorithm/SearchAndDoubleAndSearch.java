package studystuff_geeksforgeeks_algorithm;

// This is geegksforgeeks question which says that search an element in an array and if found double it
// and search doubled value in same array, continue until the element not found

public class SearchAndDoubleAndSearch 
{
	static boolean flag=false;
	public int searchAndDoubleAndSearchAgain(int arr[],int key)
	{
		System.out.println("check stashing");
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				flag=true;
				key=key*2;
			}
			
		}
		return key;
	}
	
	
	
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int key=2;
		SearchAndDoubleAndSearch obj=new SearchAndDoubleAndSearch();
		System.out.println("Key is "+key);
		key=obj.searchAndDoubleAndSearchAgain(arr,key);
		if(flag=true)
		{
			System.out.println("Key found in array");
			System.out.println("It's doubled until we do not found given key :"+key);
		}
		else
		{
			System.out.println("key not found in array");
		}
		

	}

}
