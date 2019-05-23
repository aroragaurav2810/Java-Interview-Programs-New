package studystuff_interview_questions_all;

public class Increment_And_Decrement_Operator_1 


{

	static int players = 0;
	 public static void main (String [] args) {
	 System.out.println("players online: " + players++);  
	 // As it is post fix, so for now output would be 0
	
	 System.out.println("The value of players is " + players);
	// As before this statement the value of players was incremented to 1, so now the value is 1
	 
	 System.out.println("The value of players is now "+ ++players);
	// As, It is a prefix, thus now the value is already incremented, hence value is 2
	 }

}
