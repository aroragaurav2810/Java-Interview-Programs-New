package studystuff_reflection_and_generic_enum_database;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class StudentTest extends TestSuiteBase

{

	List<Student> student_list=null;
	List<Student> gaurav_student_list=null;
	List<Student> gulshan_student_list=null;
	List<Student> hemant_student_list=null;
	
	
	
	
	@Test
	public void automatingEmployeeTest() throws Exception
	{
		
		student_list=new ArrayList<Student>(); 
		student_list=test_rule.getList(TestEnum.StudentTable,Student.class);
		gaurav_student_list=new ArrayList<Student>();
		gulshan_student_list=new ArrayList<Student>();
		hemant_student_list=new ArrayList<Student>();
		//System.out.println(employee_list.get(0).NAME);
		System.out.println("Employee list is");
		System.out.println(student_list);
		student_list.stream().filter(sl->sl.name.equalsIgnoreCase("Gaurav")).forEach(sl->gaurav_student_list.add(sl));
		System.out.println("list of employee having name gaurav "+gaurav_student_list);
	}
	
	
}
