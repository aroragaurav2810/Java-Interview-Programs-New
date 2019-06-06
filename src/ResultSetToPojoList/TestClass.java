package ResultSetToPojoList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.io.LineIterator;





public class TestClass extends RuleClass
{

	public TestClass() throws ClassNotFoundException, SQLException 
	{
		super();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException 
	
	{
			
		RuleClass rule=new RuleClass();
		List<Employee>  employee_list=rule.getEmployeeList(Employee.class);
		con.close();
		System.out.println(employee_list);
		Collections.sort(employee_list, new Comparator<Employee>() {
		
		
				@Override
			public int compare(Employee o1, Employee o2) {
				
				if(o1.getAGE()>o2.getAGE())
					return -1;
				else if(o1.getAGE()==o2.getAGE())
					return 1;
				else
					return -1;
			}
		});
		File file=new File("");
		//FileInputStream fis=new FileInputStream(file);
		BufferedReader br=new BufferedReader(new FileReader(file));
		LineIterator it=new LineIterator(br);
		while( it.hasNext())
		{
			String line=it.next();
		}
		System.out.println("Sorted list by Age: "+employee_list);
	//	Collections.sort(employee_list, (o1, o2) -> o2.getSALARY()-o1.getSALARY());
		System.out.println("Sorted list by Age:  "+employee_list);
		System.out.println(employee_list.size());
	}

}
