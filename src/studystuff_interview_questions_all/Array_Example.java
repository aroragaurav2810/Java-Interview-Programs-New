package studystuff_interview_questions_all;


interface Sports
{
	Sports []sp1=new Sports[5];
}


public class Array_Example 

{

	public static void main(String[] args) 
	
	
	{
	

	}

}



class Array_Example2 extends Array_Example
{
	
	Array_Example []ar1=new Array_Example2[5];     // Allowed assignment of array object of sub class in super class array reference
	//Array_Example2 []ar2=new Array_Example[5]; // compilation error in assigning array object of super class in sub class array reference
	Array_Example2 []ar2=(Array_Example2[]) new Array_Example[5];  // no compilation error in assigning array object of super class in sub class array reference after casting
	// Object []ar3=new int[5]; // seems like parent -child relation but compilation error as no relation between int primitive type and Object class
	Object []ar4=new Integer[5];   // same as statement 1, allowed as there is parent child relation
	// Integer []ar5=new Byte[5];  // compilation error because no parent -child relation 
	Array_Example []ar5=new Array_Example[]{new Array_Example(), new Array_Example2()};
	
}


class Array_Example3 implements Sports
{
	Sports []sp1=new Sports[5]; // very important // As per interface logic means as we know, interface relates only with reference but has no relation with object 
	// but you can see here, array of interface type has reference and object of interface type. That's an important certification logic/question

}
