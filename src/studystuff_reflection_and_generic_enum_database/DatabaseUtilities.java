package studystuff_reflection_and_generic_enum_database;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

import org.apache.log4j.Logger;

/**
 * A class for converting SQL query to list of objects depending on the variable names and types
 * 
 * @author ashish.mohanty
 * @version 1.0
 * @since 2016-05-23
 *
 */

public class DatabaseUtilities {

	
	private static Logger log = Logger.getLogger(DatabaseUtilities.class);

	/**
	 * This method converts the sql query to list of objects of the POCO class
	 * @param rs
	 * @param listClass
	 * @return list of objects of the list class with values setup from the query
	 * @throws SQLException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws InstantiationException
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> toList(ResultSet rs,Class<T> listClass) throws SQLException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, InstantiationException 
	{
		List<T> resultsettolist = new ArrayList<T>();
		boolean flag = false;
		List<FieldNameTypeClass> datalist = new ArrayList<FieldNameTypeClass>();
		// There are two classes that are going to use over here: 
		// One is Field class(java.lang.reflect package) that is used to get the information of listclass fields at run time and
		// Second is ResultSetMetaData(java.sql package) that is used to get the information of data present in result set.
		log.info("Get variables from Bean class:: "+ listClass.getName().toString());
		// getDeclaredFields() method is a method of a class Class which helps us to get the name and type of 
		// all the declared fields/variables of a class dynamically/at run time
		// list class specific datalist
		for (Field f : listClass.getDeclaredFields())
		{
			FieldNameTypeClass field_obj = new FieldNameTypeClass();
			field_obj.setName(f.getName());
			field_obj.setType(f.getType());
			datalist.add(field_obj);
		}
		
		log.info("Generate list of variables and mapping for Bean class:: "+ listClass.getName().toString());
		
		// result set specific datalist
		while(rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			Object pococlass = listClass.newInstance();
			for(int i =1; i<= rsmd.getColumnCount();i++)
			{
					int type = rsmd.getColumnType(i);
					String name = rsmd.getColumnName(i);
					
					for(FieldNameTypeClass objFieldNametypeclass : datalist)
					{
						if(objFieldNametypeclass.Name.equalsIgnoreCase(name))
						{
							flag =true;	
							break;
						}
						else
							flag = false;
					}
					if(flag)
					{
						Field field = listClass.getDeclaredField(name);
						//field.setAccessible(true);
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
		log.info("Return list of objects of the Bean class");
		return resultsettolist;
	}
}
