package studystuff_interview_questions_all;

public class Operator_Example_12 

{
	
	public  void fucntion1()
	{
		int a;
		int b;
		
	}
	

	public static void main(String[] args) 
	
	{
		boolean check;
			int x=1,z;
			int y=0;
			
			if(x++>y)  // it is separate wala if 
			{
				System.out.println("x is greater than y");
			}
			
			if(x++>4)  // else-if wala if
			{
				System.out.println("Post Increment"+ x++);
			}

			else if(++x>y) // This is else-if
			{
				System.out.println("Pre Increment"+ ++x);
			}
			System.out.println("value of x is "+x);
			
	}

}


// case 1(simple): If if condition is false then only else if checks otherwise not

// case 2(advanced): If if condition of else-if wala if is false then only else if checks otherwise not

// If if condition is true then if-else does not check 

// If if  condition is true then next if condition again check because this time the next condition is if not else if
