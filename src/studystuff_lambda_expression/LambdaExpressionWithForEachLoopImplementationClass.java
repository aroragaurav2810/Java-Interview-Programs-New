package studystuff_lambda_expression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LambdaExpressionWithForEachLoopImplementationClass 

{

	public static void main(String[] args) 
	
	{
			List<String> list=new ArrayList<>();
			list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai"); 
	        
	        list.forEach((listing)->{
	        	
	        System.out.println(listing);
	       
	        });
	      
	        

	}

}
