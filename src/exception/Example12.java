package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example12 
{

	public static void main(String[] args) throws IOException 
	
	{
		String str;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			str= obj.readLine();
			System.out.println(str);
		}while(!str.equals("Strong"));
 
	}

}
