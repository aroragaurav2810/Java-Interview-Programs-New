package studystuff_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypeSafety {

	public static void main(String[] args) 
	
	{
		
		
			
		// Non Generic List:
		List nongenericlist=new ArrayList<>();
		nongenericlist.add("gaurav");
		nongenericlist.add(10.5);
		String str=(String)nongenericlist.get(0);			// non generic requires casting even the container is of non compatible type
		//String str_new=(String)nongenericlist.get(1);		// In non generic, there is no type safety at compile time, hence runtime error comes
		
		
		//  Generic List:
		List<String> genericlist=new ArrayList<String>();
		genericlist.add("gaurav");
		//nongenericlist.add(10);  							// generic does not allow other type of data even at compile time   
		String str1=genericlist.get(0);						// generic does not require type casting and if it requires then only allow to compatible type so that no run time error comes
		
		
		List<Number> genericlist2=new ArrayList<Number>();
		genericlist2.add(10);
		genericlist2.add(10.5f);
		genericlist2.add(10.5d);
		genericlist2.add(10.5);
		genericlist2.add(88006288);
		int i= (int) genericlist2.get(0);          			
		float j=(float) genericlist2.get(1);
		double k=(double) genericlist2.get(2);
		double l=(double) genericlist2.get(3); 			//  generic requires casting also but allow to only compatible type container
		int m=(int) genericlist2.get(4);
		//String str_new=(String)genericlist2.get(4); 	 // In  generic, there is type safety at compile time, hence runtime error does not come
		System.out.println(i+" "+j+" "+k+" "+l+" "+m);
		// Generics does not support sub-typing
		// List<Number> genericlist3=new ArrayList<Integer>();
		
	}

}
