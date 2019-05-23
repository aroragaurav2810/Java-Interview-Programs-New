package studystuff_lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Java lambda expression can be used in the collection framework. 
// It provides efficient and concise way to iterate, filter and fetch data. 
// Following are some lambda and collection examples provided.


public class LambdaExpressionExampleAsComparator 


{

	public static void main(String[] args) 
	
	{
		
		List<Product> product_list=new ArrayList<Product>();
		product_list.add(new Product(101, "wood", 100.50));
		product_list.add(new Product(102, "iron", 200.100));
		product_list.add(new Product(103, "aluminium", 300.150));
		
		System.out.println("Sorting on the basis of name");
		Collections.sort(product_list,(p1,p2)->
		{
			return p1.product_name.compareTo(p2.product_name);  
		});
		
		 for(Product p:product_list){  
	            System.out.println(p.product_id+" "+p.product_name+" "+p.product_price);  
	        }  
	}

}


class Product
{
	
	int product_id;
	String product_name;
	double product_price;
	
	public Product(int id, String name, double price) 
	
	{  
        
        this.product_id= id;  
        this.product_name = name;  
        this.product_price = price;  
    }  
	
}