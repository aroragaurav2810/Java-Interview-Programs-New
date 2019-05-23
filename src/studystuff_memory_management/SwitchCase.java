package studystuff_memory_management;

import java.util.Scanner;

public class SwitchCase {
	static int value=1;
	public static void main(String[] args)
	
	
	{
				
		System.out.println("Please enter an age");
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		
		
		
		switch(value)
		{
		case 1:  if(age>18)	
					{
						System.out.println("able to vote");
						break;
					}
				else
					{
						System.out.println("not able to vote");
						break;
					}
		default:	System.out.println("Wrong value");
		
		}
	}

}
