package studystuff_reflection_and_generic_enum_database;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;



public class DatabaseUtilities2

{
	
	public <T> List<T> toList(ResultSet rs, Class<T> listclass) throws Exception
	{
		List<T> resultsettolist=new ArrayList<>();
		List<FieldNameTypeClass> datalist = new ArrayList<FieldNameTypeClass>();
		// There are two classes that are going to use over here: 
		// One is Field class(java.lang.reflect package) that is used to get the information of listclass fields at run time and
		// Second is ResultSetMetaData(java.sql package) that is used to get the information of data present in result set.
		boolean flag=false;
		
		for(Field field:listclass.getDeclaredFields())
		{
			FieldNameTypeClass fieldnametype=new FieldNameTypeClass();
			fieldnametype.setName(field.getName());
			fieldnametype.setType(field.getType());
			datalist.add(fieldnametype);
		}
		
		while(rs.next())
		{
		
		Object pococlass = listclass.newInstance();
		ResultSetMetaData rsmd=rs.getMetaData();
		for(int i=1; i<=rsmd.getColumnCount();i++)
		{
			String columnname=rsmd.getColumnName(i);
			int columntype=rsmd.getColumnType(i);
			for(FieldNameTypeClass objFieldNametypeclass:datalist)
			{
				if(objFieldNametypeclass.Name.equalsIgnoreCase(columnname))
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
			}
			if(flag)
			{
				Field field=listclass.getDeclaredField(columnname);
				switch(columntype)
				{
				case Types.VARCHAR:
					field.set(pococlass, rs.getString(columnname));
					break;
				case Types.INTEGER:
					field.set(pococlass, rs.getInt(columnname));
					break;
				case Types.DOUBLE:
					field.set(pococlass, rs.getDouble(columnname));
					break;
				case Types.DATE:
					field.set(pococlass, rs.getDate(columnname));
					break;
				case Types.TIMESTAMP:
					field.set(pococlass, rs.getTimestamp(columnname));
					break;
				case Types.CHAR:
					field.set(pococlass, rs.getString(columnname));
					break;
				case Types.NUMERIC:
					if(rs.getDouble(columnname) % 1==0)
					field.set(pococlass, rs.getLong(columnname));
					else
					field.set(pococlass, rs.getDouble(columnname));
					break;
				case Types.BIGINT:
					field.set(pococlass, rs.getLong(columnname));
					break;	
				case Types.REAL:
					field.set(pococlass, rs.getDouble(columnname));
					break;
					
				default:
						
				}
			}
			}
		
		
		
		resultsettolist.add((T) pococlass);
		}
		return resultsettolist;
		
	}
	
	

	public static void main(String[] args) 
	
	{
		

	}

}
