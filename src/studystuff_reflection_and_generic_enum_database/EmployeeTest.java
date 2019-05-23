package studystuff_reflection_and_generic_enum_database;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class EmployeeTest extends TestSuiteBase

{

	List<Employee> employee_list=null;
	List<Employee> gaurav_employee_list=null;
	List<Employee> gulshan_employee_list=null;
	List<Employee> hemant_employee_list=null;
	
	
	
	
	@Test
	public void automatingEmployeeTest() throws Exception
	{
		
		employee_list=new ArrayList<Employee>(); 
		employee_list=test_rule.getList(TestEnum.EmployeeTable, Employee.class);
		gaurav_employee_list=new ArrayList<Employee>();
		gulshan_employee_list=new ArrayList<Employee>();
		hemant_employee_list=new ArrayList<Employee>();
		//System.out.println(employee_list.get(0).NAME);
		System.out.print("Employee list is: ");
		System.out.println(employee_list);
		employee_list.stream().filter(el->el.name.equalsIgnoreCase("Gaurav")).forEach(el->gaurav_employee_list.add(el));
		System.out.println("list of employee having name gaurav "+gaurav_employee_list);
	}
	
	
}
