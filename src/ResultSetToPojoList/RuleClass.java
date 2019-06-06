package ResultSetToPojoList;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RuleClass extends Base
{

	public RuleClass() throws ClassNotFoundException, SQLException
	{
		super();
	}
	
	
	public <T> List<T> getEmployeeList(Class pojoClass) throws IOException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException
	{
		String sql_Query=QueryClass.EMPLOYEE.getQueryAsString();
		rs=stmt.executeQuery(sql_Query);
		return db.resultSetToList(pojoClass,rs);
		
	}
	
	
}
