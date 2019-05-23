package studystuff_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparableClassSortingAgain 

{

	public static void main(String[] args) 
	
	{
		List<StudentDetail> list_StudentDetail=new ArrayList<>();
		list_StudentDetail.add(new StudentDetail(1004, "Gaurav", 415.50));
		list_StudentDetail.add(new StudentDetail(1001, "Hemant", 400.70));
		list_StudentDetail.add(new StudentDetail(1002, "Gulshan", 385.50));
		
		
		
		System.out.println("Sort Student detail list by student total marks");
		Collections.sort(list_StudentDetail);
		
		for(StudentDetail stu_detail:list_StudentDetail)
		{
			System.out.println(stu_detail);
		}


		
	}

}


class StudentDetail implements Comparable<StudentDetail>
{
	int stu_rollno;
	String stu_name;
	double stu_totalmarks;
	
	public  StudentDetail(int stu_rollno, String stu_name, double stu_totalmarks) 
	{
		this.stu_rollno=stu_rollno;
		this.stu_name=stu_name;
		this.stu_totalmarks=stu_totalmarks;
		
	}

	

	@Override
	public String toString() {
		return "StudentDetail [stu_rollno=" + stu_rollno + ", stu_name=" + stu_name + ", stu_totalmarks="
				+ stu_totalmarks + "]";
	}



	@Override
	public int compareTo(StudentDetail arg0) {
		if(stu_totalmarks>arg0.stu_totalmarks)
		return 1;
		else if(stu_totalmarks>arg0.stu_totalmarks)
			return 0;
		else
			return -1;
	}
	

	
	
	
	
	
}