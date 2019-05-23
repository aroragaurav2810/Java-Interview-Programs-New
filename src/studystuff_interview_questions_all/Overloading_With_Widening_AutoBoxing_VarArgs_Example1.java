package studystuff_interview_questions_all;

public class Overloading_With_Widening_AutoBoxing_VarArgs_Example1 

{

	static void function1(int x, int y)   // Widening
	{
		System.out.println("int primitive");
	}
	
	static void function1(Byte x, Byte y)  // Auto Boxing
	{
		System.out.println("Byte Class Type arguments");
	}
	
	static void function1(byte...b)  // VarArgument(NOTE: In VarArgument, only 3 dots are allowed)
	{
		System.out.println("byte var argument");
	}
	
	
	public static void main(String[] args) 
	
	
	{
		byte b=10;
		Overloading_With_Widening_AutoBoxing_VarArgs_Example1.function1(b, b);

	}

}


// Concept: From Chapter3: SCJP

// In above overloading question, Widening beats Autoboxing and VarArgument because
// 1. Widening: Priority 1
// 2. AutoBoxing: Priority 2
// 3. VarArgument: Priority 3
