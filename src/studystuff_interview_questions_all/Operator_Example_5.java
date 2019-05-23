package studystuff_interview_questions_all;

public class Operator_Example_5 

{

	public static void main(String[] args) 
	
	{
		
			
			int sizeOfYard = 10;
			int numOfPets = 3;
			String status = (numOfPets>4)?"Pet count OK ":(sizeOfYard > 8)? "Pet limit on the edge":"too many pets";
			System.out.println("Pet status is " + status);

	}

}


// conditional operator can be like this