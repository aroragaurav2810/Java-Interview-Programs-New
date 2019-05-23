package studystuff_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparatorClassSortingAgain 

{

	public static void main(String[] args) 
	
	{
		List<StudentDetails> list_studentdetails=new ArrayList<>();
		list_studentdetails.add(new StudentDetails(1004, "Gaurav", 415.50));
		list_studentdetails.add(new StudentDetails(1001, "Hemant", 400.70));
		list_studentdetails.add(new StudentDetails(1002, "Gulshan", 385.50));
		System.out.println("Sort Student detail list by student roll no");
		Collections.sort(list_studentdetails, new Comparator<StudentDetails>() 
		{

			@Override
			public int compare(StudentDetails o1, StudentDetails o2) {
				// TODO Auto-generated method stub
				return o1.stu_rollno-o2.stu_rollno;
			}
			
		}
		);
		
		for(StudentDetails stu_detail:list_studentdetails)
		{
			System.out.println(stu_detail);
		}
		

		System.out.println("Sort Student detail list by student name");
		Collections.sort(list_studentdetails, new Comparator<StudentDetails>() 
		{

			@Override
			public int compare(StudentDetails o1, StudentDetails o2) {
				// TODO Auto-generated method stub
				return o1.stu_name.compareTo(o2.stu_name);
			}
			
		}
		);
		
		for(StudentDetails stu_detail:list_studentdetails)
		{
			System.out.println(stu_detail);
		}
		
		
		System.out.println("Sort Student detail list by student total marks");
		Collections.sort(list_studentdetails, new Comparator<StudentDetails>() 
		{

			@Override
			public int compare(StudentDetails o1, StudentDetails o2) {
				// TODO Auto-generated method stub
				return (int) (o1.stu_totalmarks-o2.stu_totalmarks);
			}
			
		}
		);
		
		for(StudentDetails stu_detail:list_studentdetails)
		{
			System.out.println(stu_detail);
		}


		
	}

}


class StudentDetails implements Comparator<StudentDetails>
{
	int stu_rollno;
	String stu_name;
	double stu_totalmarks;
	
	public  StudentDetails(int stu_rollno, String stu_name, double stu_totalmarks) 
	{
		this.stu_rollno=stu_rollno;
		this.stu_name=stu_name;
		this.stu_totalmarks=stu_totalmarks;
		
	}

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) 
	{
			return 0;
	}

	@Override
	public String toString() {
		return "StudentDetails [stu_rollno=" + stu_rollno + ", stu_name=" + stu_name + ", stu_totalmarks="
				+ stu_totalmarks + "]";
	}
	

	
	
	
	
	
}