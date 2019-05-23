package studystuff_memory_management;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class CustomException  extends Exception

{
	static int age;
	
	static Scanner obj;
	
	static FileInputStream fis;
	static XSSFWorkbook wb;
	
	public CustomException() 
	{
			System.out.println("Wrong input");
	}
	
	
	public static void main(String[] args) throws IOException, CustomException 
	
	{
		 int c = 0;
		 System.out.println(c);
		obj=new Scanner(System.in);
		System.out.println("Please enter age");
		age=obj.nextInt();
	
		if(age<18)
		{
			throw new CustomException();
		}
		else
		{
			System.out.println("able to vote");
		}

	}

	
	
}
