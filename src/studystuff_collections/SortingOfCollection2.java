package studystuff_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* In this program, we will sort a collection(on the basis of Employee marks) containing lot 
of Employee class objects.*/

// This is also a great example of Comparable Interface 

// This is also a great example of bean-A class or Encapsulation 
// having getter and setter method representing the private variables


public class SortingOfCollection2 

{
	
	// As Similar as Class ComparatorClassSorting, refer ComparatorClassSorting(it's better with examples)

	public static void main(String[] args) 
	
	{
		Employee Employee1=new Employee(318, "Gaurav",470.5);
		Employee Employee2=new Employee(319, "Gulshan",389.1);
		Employee Employee3=new Employee(320, "Hemant",470.3);
		
		List<Employee> Employee_list=new ArrayList<Employee>();
		
		Employee_list.add(Employee1);
		Employee_list.add(Employee2);
		Employee_list.add(Employee3);
		
		System.out.println("Sorted By Marks");
		Collections.sort(Employee_list,new Comparator<Employee>() 
			{
			@Override
			public int compare(Employee o1, Employee o2) 
			{
				return (int)(o2.getEmployee_marks()-o1.getEmployee_marks());
			}
			
						
			});
		System.out.println(Employee_list);
		
		System.out.println("Sorted By Name");
		// Collections.sort(list,Comparator)
		// By Lambda Expression: Syntax: (Argument List)->{Body}
		Collections.sort(Employee_list,(o1,o2)->{
			return  (int) (o1.getEmployee_name().compareTo(o2.getEmployee_name()));
		}) ;
		
	
				
				
		System.out.println(Employee_list);
	}

}



class Employee // implements Comparator<Employee>
{

	private int Employee_roll_no;
	private String Employee_name;
	private double Employee_marks;
	
	public String toString()
	{
		return "Employee_roll no is: "+Employee_roll_no+" Employee_name is: "+Employee_name+" Employee_marks is: "+Employee_marks;
		
	}
	
	public Employee(int roll_no, String name, double marks)
	{
		Employee_roll_no=roll_no;
		Employee_name=name;
		Employee_marks=marks;
	}
	
	
	public int getEmployee_roll_no() {
		return Employee_roll_no;
	}


	public void setEmployee_roll_no(int Employee_roll_no) {
		this.Employee_roll_no = Employee_roll_no;
	}


	public String getEmployee_name() {
		return Employee_name;
	}


	public void setEmployee_name(String Employee_name) {
		this.Employee_name = Employee_name;
	}


	public double getEmployee_marks() {
		return Employee_marks;
	}


	public void setEmployee_marks(double Employee_marks) {
		this.Employee_marks = Employee_marks;
	}


	

	
	
}