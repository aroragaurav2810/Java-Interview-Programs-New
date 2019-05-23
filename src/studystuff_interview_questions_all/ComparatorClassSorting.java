package studystuff_interview_questions_all;

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

public class ComparatorClassSorting {

	public static void main(String[] args)
	
	{
		
		
		List<Student1> list=new ArrayList<Student1>();
		list.add(new Student1(10,"Gaurav","Math",90));
		list.add(new Student1(10,"Gaurav","Science",80));
		list.add(new Student1(10,"Gaurav","Social Science",70));
		list.add(new Student1(10,"Gaurav","English",60));
		list.add(new Student1(10,"Gaurav","Hindi",50));
		list.add(new Student1(11,"Gautam","Math",70));
		list.add(new Student1(11,"Gautam","Science",90));
		list.add(new Student1(11,"Gautam","Social Science",60));
		list.add(new Student1(11,"Gautam","English",75));
		list.add(new Student1(11,"Gautam","Hindi",30));
		list.add(new Student1(12,"Amit","Math",100));
		list.add(new Student1(12,"Amit","Science",30));
		list.add(new Student1(12,"Amit","Social Science",89));
		list.add(new Student1(12,"Amit","English",41));
		list.add(new Student1(12,"Amit","Hindi",05));
		System.out.println(list);
		
		// Case: Apart from Comparator: Part of Sprinkler:  stream() Function of list 
		System.out.println("list of students having roll no 12");
		List<Student1> list_student_rollno_12=new ArrayList<Student1>();
		list.stream().filter(dp->dp.getStu_roll_no()==12).forEach(dp->list_student_rollno_12.add(dp));
		list.stream().filter(dp->dp.stu_roll_no==12).forEach(dp->list_student_rollno_12.add(dp));
		System.out.println(list_student_rollno_12);
		
		
		// --------------------------------------------------------------------------------
		
		System.out.println("Sorted By Marks");
		// Case: Sorting on Object having Integer - using Comparator in inner anonymous class 
		// Collections.sort(list,Comparator) + By inner anonymous class
		Collections.sort(list,new Comparator<Student1>() {

			public int compare(Student1 o1, Student1 o2) {
				/*if(o1.getStu_marks()<o2.getStu_marks())
				return -1;
				else if(o1.getStu_marks()==o2.getStu_marks())
				return 0;
				else
					return 1;*/
				
					//	or 
				
				return o1.getStu_marks()-o2.getStu_marks();
			}

		
		});
		
		
		for(Student1 stu:list)
		{
			System.out.println(stu);
		}
		
		// -------------------------------------------------------------------------------------------
		
		System.out.println("Sorted By Name");
		// Case: Sorting on Object having String - using Comparator in inner anonymous class 
		// Collections.sort(list,Comparator) + By inner anonymous class
		Collections.sort(list,new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o1.getStu_name().compareTo(o2.getStu_name());
		}});
			
		for(Student1 stu:list)
		{
			System.out.println(stu);
		}
		
		// ------------------------------------------------------------------------------------------------------
		
		// Case: 
		// Collections.sort(list);
		// This immediate above case won't work for Comparator logic , 
		// it works only for Comparable logic because for Comparator 
	
		
		// -----------------------------------------------------------------------------------------------------------

		System.out.println("Sorted By Roll No");
		// Case: Sorting on Object having Integer - using Comparator in Lambda Expression 
		// Collections.sort(list,Comparator) + By lambda Expression 
		// Where Lambda Expression: Syntax: (Argument List)->{Body}
		Collections.sort(list,(o1, o2) -> o2.getStu_roll_no() - o1.getStu_roll_no());
		// or 
		// Where Lambda Expression: Syntax: (Argument List)->{Body}
		Collections.sort(list,(o1, o2) -> {
											return (o2.getStu_roll_no() - o1.getStu_roll_no());
										  });
		
		for(Student1 stu:list)
		{
			System.out.println(stu);
		}
	
	
		
		
		
	}

	

}


// Why Comparable over Comparator: because Comparable is an interface that is implemented by lot of predefined classes so that you can compare 
// Important: Why Comparator over Comparable: It provides multiple sorting sequence i.e. you can sort the elements on the basis of any data member, for example rollno, name, marks, subject or anything else.
// see all above cases, This is not possible in case of Comparable as you can sort the elements on based on single data member only. 
// For example either it may be rollno, name, marks, subject or anything else. You can't sort simultaneously- refer class ComparableClassSorting and try
// This is because , it does not have syntax like compare(list, Comparable in anonymous class or Comparable in lambda Expression)

class Student1 implements   Comparator<Student1>
{
	
	


	public int INSTRUMENT;
	public int stu_roll_no;
	private String stu_name;
	private String stu_subject;
	private int stu_marks;
	
	public Student1(int roll_no, String name,String subject, int marks) 
	{
		stu_roll_no=roll_no;
		
		stu_name=name;
		
		stu_subject=subject;
		
		stu_marks=marks;
		
		
	}
	
	//public long INSTRUMENT;
	public double SCORE;
	
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
		return "Student1_roll no is "+stu_roll_no+" stu name is "+stu_name+" stu subject is "+stu_subject+" Student1 marks is "+stu_marks;
	}


	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}



	
}

