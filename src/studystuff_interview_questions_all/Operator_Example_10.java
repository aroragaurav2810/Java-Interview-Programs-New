package studystuff_interview_questions_all;

public class Operator_Example_10 

{
	{ index = 1; }
	
	int index;  // no matter if initialization is below and declaration of variable is above
				// because java is object oriented but not a structured or procedural oriented language.

	public static void main(String[] args) 
	
	{
		
		new Operator_Example_10().go();
		

	}

	
	void go() {
		int [][] dd = {{9,8,7}, {6,5,4}, {3,2,1,0}};
		System.out.println(dd[index++][index++]);
	}
}


// part of operator chapter