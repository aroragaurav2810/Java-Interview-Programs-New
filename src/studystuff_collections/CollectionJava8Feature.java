package studystuff_collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionJava8Feature 


{

	
	public static void main(String str[])
	{
		Children child1=new Children(101, "Gautam", 98.5);
		Children child2=new Children(101, "Karan", 91.5);
		Children child3=new Children(101, "Amit", 90.5);
		Children child4=new Children(101, "Gaurav", 88.5);
		
		
		List<Children> topper=new ArrayList<Children>();
		List<Children> children_list=new ArrayList<Children>();
		
		
		children_list.add(child1);
		children_list.add(child2);
		children_list.add(child3);
		children_list.add(child4);
		

		children_list.stream().filter(dp->dp.name.equalsIgnoreCase("Gautam")).forEach(dp->topper.add(dp));
		
		System.out.println(topper.get(0).id);
		System.out.println(topper.get(0).name);
		System.out.println(topper.get(0).marks);
		
		
	}
	
	
	
}




class Children
{
	
	int id;
	String name;
	double marks;
	
	
	public Children(int id,String name,double marks) 
	{

		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	
	
	
}


