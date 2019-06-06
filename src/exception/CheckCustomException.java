package exception;

import java.util.Scanner;

public class CheckCustomException 

{
	
	static int age;

	public static void main(String[] args) 
	
	{
		System.out.println("Enter Age");
		Scanner obj=new Scanner(System.in);
		age=obj.nextInt();
		if(age>=18)
		{
			System.out.println("eligible");
		}
			
		else if(age<18 && age>=0)
		{
			System.out.println("not eligible");
		}

		else
		{
			throw new CustomException();
		}
		
	}

}
