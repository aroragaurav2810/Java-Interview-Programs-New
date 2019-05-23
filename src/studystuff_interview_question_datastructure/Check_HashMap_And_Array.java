package studystuff_interview_question_datastructure;

import java.util.HashMap;

public class Check_HashMap_And_Array 

{

	public void function1(int []ar)
	{
		System.out.println("array passed in function as argument");
	}
	
	
	
	public static void main(String[] args) 
	
	{
		
		// check array
		int ar[]=new int[7];
		int ar1[]=new int[]{1,2,3};  // this syntax is ok
		int ar2[]={1,2,3};  // this syntax also ok
		System.out.println(ar[0]);
		System.out.println(ar1[2]);
		System.out.println(ar2[2]);
		
			HashMap<Character, Integer> map=new HashMap<Character, Integer>();
			map.put('a',1);
			map.put('b',1);
			map.put('a',1);
			map.put('a',2);
			System.out.println(map);
	
	Check_HashMap_And_Array obj=new Check_HashMap_And_Array();
	obj.function1(new int[]{1,2,3});  // this syntax is ok
	// obj.function1({1,2,3});   // this syntax is not ok
	
	//byte b=-129;
	//byte b=128;
	byte b=+127;   // maximum allowed 127
	byte c=-128;   // mimimum allowed -128
	char d='p';
	short e=10;
	
	// all these: byte, char and short alllowed in array of int 
	int arr[]=new int[]{b,c,d,e};
 	}

	
}
