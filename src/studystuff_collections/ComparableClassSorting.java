package studystuff_collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ComparableClassSorting {

	public static void main(String[] args)
	
	{
		
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(10,"Gaurav","Math",90));
		list.add(new Student(10,"Gaurav","Science",80));
		list.add(new Student(10,"Gaurav","Social Science",70));
		list.add(new Student(10,"Gaurav","English",60));
		list.add(new Student(10,"Gaurav","Hindi",50));
		list.add(new Student(11,"Gautam","Math",70));
		list.add(new Student(11,"Gautam","Science",90));
		list.add(new Student(11,"Gautam","Social Science",60));
		list.add(new Student(11,"Gautam","English",75));
		list.add(new Student(11,"Gautam","Hindi",30));
		list.add(new Student(12,"Amit","Math",100));
		list.add(new Student(12,"Amit","Science",30));
		list.add(new Student(12,"Amit","Social Science",89));
		list.add(new Student(12,"Amit","English",41));
		list.add(new Student(12,"Amit","Hindi",05));
		System.out.println(list);
		
		Collections.sort(list,(l1,l2)->l1.getStu_roll_no()-l2.getStu_roll_no()
					
		);
			
		
		
		Collections.sort(list,new Comparator<Student>() {

			public int compare(Student p1, Student p2) {
				/*if(o1.getStu_marks()<o2.getStu_marks())
				return -1;
				else if(o1.getStu_marks()==o2.getStu_marks())
				return 0;
				else
					return 1;*/
				
					//	or 
				
				return p1.getStu_marks()-p2.getStu_marks();
			}

		
		} 
		);
		
		for(Student stu:list)
		{
			System.out.println(stu);
		}
		
		
			
		
	}

	

}


// Why Comparable over Comparator: because Comparable is an interface that is implemented by lot of predefined classes so that you can compare 
// Why Comparator over Comparable: refer ComparatorClassSorting

class Student implements   Comparable<Student>
{
	
	


	private int stu_roll_no;
	private String stu_name;
	private String stu_subject;
	private int stu_marks;
	
	public  Student(int roll_no, String name,String subject, int marks) 
	{
		stu_roll_no=roll_no;
		
		stu_name=name;
		
		stu_subject=subject;
		
		stu_marks=marks;
		
		
	}
	
	public String getStu_subject() {
		return stu_subject;
	}

	public void setStu_subject(String stu_subject) {
		this.stu_subject = stu_subject;
	}

	public int getStu_roll_no() {
		return stu_roll_no;
	}


	public void setStu_roll_no(int stu_roll_no) {
		this.stu_roll_no = stu_roll_no;
	}


	public String getStu_name() {
		return stu_name;
	}


	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}


	public int getStu_marks() {
		return stu_marks;
	}


	public void setStu_marks(int stu_marks) {
		this.stu_marks = stu_marks;
	}
	
	
	public String toString()
	{
		return "student_roll no is "+stu_roll_no+" stu name is "+stu_name+" stu subject is "+stu_subject+" student marks is "+stu_marks;
	}


	
// By Roll No:	
		public int compareTo(Student arg0) 
	
	{
		if(stu_roll_no<arg0.stu_roll_no)
		{
			return -1;
		}
		else if(stu_roll_no==arg0.stu_roll_no)
		return 0;
		
		else
		{
			return 1;
		}
	}



// By Marks: 
	/*public int compareTo(Student o2) {
		if(stu_marks<o2.stu_marks)
			return -1;
		else if(stu_marks==o2.stu_marks)
			return 0;
		else
			return 1;
		
	}*/
	

	// compareTo() is one of the method that is used to compare two strings. 
	// Why we use compareTo() method. because to compare two strings, we can't use operators like <, >,>=, <= etc. Hence this method solves the purpose
	// compareTo() methods return some integer value and our required method also requires return type as int
	// here required methods are: Comparator class method such as : compareTo() and Comparable class method such as: compare()
	
// By Name: 
	/*	public int compareTo(Student o2) {
			return getStu_name().compareTo(o2.getStu_name());
					
		}	*/
	

// By Subject: 
/*public int compareTo(Student o2) {
	return stu_subject.compareTo(o2.stu_subject);
			
}	*/
			
		
		
}

