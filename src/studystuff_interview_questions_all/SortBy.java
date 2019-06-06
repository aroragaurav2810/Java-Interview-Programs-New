package studystuff_interview_questions_all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBy 

{

	List<Students> student=null;
	List<Employees> Employees=null;
	
	
	
	
	public static void main(String[] args) 
	
	{
		List<Students> students_list=new ArrayList<Students>();
		students_list.add(new Students("Gaurav",28,'M'));
		students_list.add(new Students("Gautam",18,'M'));
		students_list.add(new Students("kamiya",30,'F'));
		students_list.add(new Students("Geeta",52,'F'));
		students_list.add(new Students("Kailash",57,'M'));
		Collections.sort(students_list);
		System.out.println("Comparable Sorted Student list is on roll no : "+students_list);
		
		List<Employees> Employees_list=new ArrayList<Employees>();
		Employees_list.add(new Employees("Gaurav",28,'M'));
		Employees_list.add(new Employees("Gautam",18,'M'));
		Employees_list.add(new Employees("kamiya",30,'F'));
		Employees_list.add(new Employees("Geeta",52,'F'));
		Employees_list.add(new Employees("Kailash",57,'M'));

		
		
			
		Collections.sort(Employees_list,new Comparator<Employees>() {

			@Override
			public int compare(Employees o1, Employees o2) {
				if(o1.getEmpid()<o2.getEmpid())
					return -1;
				else if(o1.getEmpid()==o2.getEmpid())
					return 0;
				else
					return 1;
			}	
		});
		System.out.println("Comparator Sorted Employees list is on Emp Id: "+Employees_list);
		
		
		
		Collections.sort(Employees_list,new Comparator<Employees>() {
		@Override
		public int compare(Employees o1, Employees o2) {
			return o1.getGender().compareTo(o2.getGender());
		
		}	
		});
		System.out.println("Comparator Sorted Employees list is on Gender: "+Employees_list);
		
		// The above function in lamda expression
		
		
		Collections.sort(Employees_list, (o1,o2)->o1.gender.compareTo(o2.gender));
		System.out.println("Using lambda expression Comparator Sorted Employees list is on Gender: "+Employees_list);
		
		Collections.sort(Employees_list,new Comparator<Employees>() {
		@Override
		public int compare(Employees o1,Employees o2) 
		{
			return o1.getName().compareTo(o2.getName());
			
		}
		});
		System.out.println("Comparator Sorted Employees list is on Emp Name: "+Employees_list);
	}

}




class Employees
{
	String name;
	int empid;
	Character gender;
	public Employees(String name, int empid, Character gender)
	{
		this.name=name;
		this.empid=empid;
		this.gender=gender;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}


	
	
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", empid=" + empid + ", gender="
				+ gender + "]";
	}


	
	
	
}


class Students implements Comparable<Students>
{

	String name;
	int rollno;
	Character gender;
	
	public Students(String name, int rollno, Character gender)
	{
		this.name=name;
		this.rollno=rollno;
		this.gender=gender;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}


	
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", gender="
				+ gender + "]";
	}


	@Override
	public int compareTo(Students o) 
	{
		if(o.getRollno()>getRollno())
			return -1;
		else if(o.getRollno()==getRollno())
			return 0;
		else
			return 1;
	}
	
}