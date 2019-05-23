package studystuff_geeksforgeeks_keywords;

import java.util.Arrays;

import studystuff_interview_questions_all.Final_Keyword_Example;


// When a class is declared with final keyword, it is called as final class. A final class cannot be extended(inherited). 
// Why we make a class final. 
// There are two uses of a final class :
// 1. First is we can not extend a final class. Like all wrapper classes such a Integer,String, Float, Character, Boolean. We can't extend them
// 2. Second is to make any class immutable. Like String class

final public class FinalKeyword

{
// 	 final keyword is a non-access modifier applicable on everything in java like a variable/reference variable/object, a method or a class/innerclass.
	
	
	// Blank final variable: A blank final variable is an invalid variable. A final variable must be initialized at same time
	// final int a;
	// When a variable is declared with final keyword, its value can’t be modified, essentially, a constant
	final int a=10;
	// final can also be used with static variable
	final static int b=20;
	
	
	public static void main(String[] args) 
	
	{
		// A local final variable can be declared as blank variable
		final int a;
		// final reference variable/object
		final FinalKeyword obj1=new FinalKeyword();
		
		obj1.function1();
	}
	

	
	
	final public void function1()
	{
		// A local final variable can be declared as blank variable
		final int a;
		
		// An array is basically a reference variable/object so an array can also be final but their elements are not final their value can be changed
		// A collection is also an reference variable/object so a list/set/map can also be final but their elements are not final their value can be changed 
		final int ar1[]=new int[] {1,2,3};
		int ar2[]=new int[]{20,30};
		ar1[0]=ar2[0];
		//ar1=ar2;
		System.out.println(Arrays.toString(ar1));	
		// Similar to array, StringBuffer is also a reference variable/object. Thus a final stringBuffer reference variable can not 
		// be reassigned but their values can be reassigned as it happens in array
		final StringBuffer sb=new StringBuffer("gaurav");
		//sb=new StringBuffer("arora");
		sb.append(" arora");
		System.out.println(sb);
	}
	
	final class A
	{
		
	}

}

//Can't extends final class
/*class B extends FinalKeyword
{
	
}*/

class C
{
	final void function2()
	{
		
	}
}

class D extends C
{
	
	// Can't override final methods
	/*void function2()
	{
		
	}*/
}


// NOTE: Difference between final(A non access modifier), finally(A block that is used in exception), finalize(Finalize() is the method in java which called by the garbage collector)
// NOTE: why abstract and final can not be used together.  because 
// final means this is final and nobody and extend or override this but on the other hand abstract class requires a subclass which implements it's abstract methods.
// So there is no sense to use these two together.

