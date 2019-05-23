package studystuff_interview_questions_all;

public class Overloading_With_Widening_AutoBoxing_VarArgs_Example2 

{

	static void function1(int x, int y)   // Widening // function1
	{
		System.out.println("int primitive");
	}
	
	static void function1(byte...b)  // VarArgument(NOTE: In VarArgument, only 3 dots are allowed)  // function2
	{
		System.out.println("byte var argument");
	}
	
	
	public static void main(String[] args) 
	
	
	{
		byte b=10;
		Overloading_With_Widening_AutoBoxing_VarArgs_Example2.function1(b);

	}

}

//Concept: From Chapter3: SCJP

// As per the question, the output should be "int primitive" because the logic says:

//In above overloading question, Widening beats  VarArgument because
//1. Widening: Priority 1
//2. AutoBoxing: Priority 2
//3. VarArgument: Priority 3


// but the output has come as "byte var argument" because in function 1, there are two arguments and the method call calling with only one argument 
// so the above concepts gets violate because it is directly understood which method would call

