package studystuff_reflection_and_generic_enum_database;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSetMetaData;

public class DatabaseUtilities_Learn 

{

	
	
	public <T> List<T> toList(ResultSet rs,Class<T> listclass) throws Exception
	{
		
		List<T> resultsettolist = new ArrayList<T>();
		boolean flag=false;
		List<FieldNameTypeClass> datalist=new ArrayList<FieldNameTypeClass>();
		
		// list class specific datalist
		for(Field f:listclass.getDeclaredFields())
		{
			FieldNameTypeClass field_obj = new FieldNameTypeClass();
			field_obj.setName(f.getName());
			field_obj.setType(f.getType());
			datalist.add(field_obj);
		}
		
		// result set specific datalist
		while(rs.next())
		{
			Object pococlass = listclass.newInstance();
			java.sql.ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=1; i<=rsmd.getColumnCount();i++)
			{
				int type = rsmd.getColumnType(i);
				String name = rsmd.getColumnName(i);
				
				for(FieldNameTypeClass objFieldsNames : datalist)
				{
					if(objFieldsNames.Name.equalsIgnoreCase(name))
					{
						flag =true;	
						break;
					}
					else
						flag = false;
				}
				if(flag)
				{
					Field field = listclass.getDeclaredField(name);
					field.setAccessible(true);
					switch(type)
					{
					case Types.VARCHAR:
						field.set(pococlass, rs.getString(name));
						break;
					case Types.INTEGER:
						field.set(pococlass, rs.getInt(name));
						break;
					case Types.DOUBLE:
						field.set(pococlass, rs.getDouble(name));
						break;
					case Types.DATE:
						field.set(pococlass, rs.getDate(name));
						break;
					case Types.TIMESTAMP:
						field.set(pococlass, rs.getTimestamp(name));
						break;
					case Types.CHAR:
						field.set(pococlass, rs.getString(name));
						break;
					case Types.NUMERIC:
						if(rs.getDouble(name) % 1==0)
						field.set(pococlass, rs.getLong(name));
						else
						field.set(pococlass, rs.getDouble(name));
						break;
					case Types.BIGINT:
						field.set(pococlass, rs.getLong(name));
						break;	
					case Types.REAL:
						field.set(pococlass, rs.getDouble(name));
						break;
						
					default:
							
					}
					
				}
				
			}
			
			resultsettolist.add((T) pococlass);
		}
		
		
		 return resultsettolist;
		
	}
	
	
	
}
