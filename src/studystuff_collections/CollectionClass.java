package studystuff_collections;

import java.util.Set;
import java.util.TreeSet;

public class CollectionClass {

	int a;
	public static void main(String[] args) 
	
	{
		
		Set<Integer> treeset1=new TreeSet<Integer>();
			treeset1.add(10);
			treeset1.add(20);
			treeset1.add(30);
			Set<Integer> treeset2=new TreeSet<Integer>();
			treeset1.add(40);
			treeset1.add(50);
			treeset1.add(60);
			treeset1.addAll(treeset2);
			System.out.println(treeset1);
	}
	

}
