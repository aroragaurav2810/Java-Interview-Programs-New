package studystuff_geeksforgeeks;

import studystuff_geeksforgeeks_arrays.FinalArrayInJava;

public class FinalVariableAndReferenceVariable

{

	public static void main(String[] args) 
	{
		  final int t1=10;
		  int t2=20;
		  final FinalArrayInJava obj1=new FinalArrayInJava();
		  FinalArrayInJava obj2=new FinalArrayInJava();
		  // line 1:
		  	 obj2=obj1;
		  	 t2=t1;
		  // line 2:	 
		  // obj1=obj2;
		  // t1=t2;	 
		  	 
		  // NOTE: You can not assign value/variable/reference variable again to a final variable/reference variable. see line 2
		  // NOTE: However, you can assign final variable/final reference variable to a variable/reference variable. see line 1 
		
		  // NOTE: Talking about final array, As array is also a reference variable so it will behave in same manner as you can see above for reference variable
		  // but there is a logic the final array elements are assigned values again even their array is final. . See example FinalArrayInJava in package studystuff_geeksforgeeks_arrays 
		 

	}

}
