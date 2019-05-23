package studystuff_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/* In this program, we will sort a collection(on the basis of student marks) containing lot 
of Student class objects.*/

// This is also a great example of Comparable Interface 

// This is also a great example of bean-A class or Encapsulation 
// having getter and setter method representing the private variables


public class SortingOfCollection 

{	// As Similar as Class ComparableClassSorting , refer ComparableClassSorting(it's better with examples)

	public static void main(String[] args) 
	
	{
		StudentClass student1=new StudentClass(318, "Gaurav",470);
		StudentClass student3=new StudentClass(320, "Hemant",460);
		StudentClass student2=new StudentClass(319, "Gulshan",389);
		
		List<StudentClass> student_list=new ArrayList<StudentClass>();
		student_list.add(student1);
		student_list.add(student2);
		student_list.add(student3);
		Collections.sort(student_list);
		System.out.println(student_list);
	}

}



class StudentClass implements Comparable<StudentClass>
{

	private int student_roll_no;
	private String student_name;
	private int student_marks;
	
	public String toString()
	{
		return "student_roll no is: "+student_roll_no+" student_name is: "+student_name+" student_marks is: "+student_marks;
		
	}
	
	public StudentClass(int roll_no, String name, int marks)
	{
		student_roll_no=roll_no;
		student_name=name;
		student_marks=marks;
	}
	
	
	public int getStudent_roll_no() {
		return student_roll_no;
	}


	public void setStudent_roll_no(int student_roll_no) {
		this.student_roll_no = student_roll_no;
	}


	public String getStudent_name() {
		return student_name;
	}


	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	public int getStudent_marks() {
		return student_marks;
	}


	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}


	@Override
	public int compareTo(StudentClass o) 
	{
		
		//return o.student_marks-student_marks;
		//return o.getStudent_marks()-getStudent_marks();
		return o.getStudent_name().compareTo(getStudent_name());
	}
	
	
	
}