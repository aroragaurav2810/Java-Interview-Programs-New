package studystuff_interview_questions_all;

public class Widening_And_Autoboxing_And_VarArg {
    
    public static void book(short a) // Direct(id Direct Match is there then no need to check else)
    {
        System.out.println("short direct");
    }
    
    public static void book(long b) // Widening(Priority 1) for method book(intRoom)
    {
        System.out.println("long Widening");
    }
    
    
    public static void book(Long a) // make sure It seems like widening for method book(intRoom) but It is not Widening(Priority 1)  
    // very important to know
    {
        System.out.println("A Long Class");
    }
    
    public static void book(Short a) // Autoboxing(Priority 2) for method book(shortRoom)
    {
        System.out.println("SHORT Autoboxing ");
    }
    
   
    
    public static void book(short ...a) // Var Argument(Priority 3) for method book(shortRoom)
    {
        System.out.println("short var argument ");
    }
    public static void main(String[] args) 
    {
        short shortRoom = 1;
        int intRoom = 2;
        
        book(shortRoom);
        book(intRoom);
    }
}


// Widening, Wrapper Class(Autoboxing/Unboxing) and Var Argument priority would matter to solve this question

// doubtful, need to read the chapter, Autoboxing again

// After Reading the Chapter, Autoboxing: Primitive Type to Class, Unboxing: Class to Primitive Type

// Concept: From Chapter3: SCJP

//In above overloading question, Widening beats Autoboxing and VarArgument because
//1. Widening: Priority 1
//2. AutoBoxing: Priority 2
//3. VarArgument: Priority 3

//NOTE: Please refer a similar question in Interview Question project under package flow_control of class Hotel.java