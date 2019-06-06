package ResultSetToPojoList;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;



public class DatabaseUtility 

{

	
	public <T> List<T> resultSetToList(Class<T> pojoClass,ResultSet rs) throws SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException
	{
		List<T> pojoClassList=new ArrayList<T>();
		// ------------------- Let's work on Pojo Fields so that we may work with result set columns -----------------
		
		List<String> list_string=new ArrayList<String>();
		String ar[]={"Gaurav","Kamiya","Gautam"};
		for(String str:ar)
		{
			list_string.add(str);
		}
		
		
		List<pojoFieldsNameAndTypeClass> pojoNameAndTypeList=new ArrayList<pojoFieldsNameAndTypeClass>();
		
		Field[] pojoFields=pojoClass.getDeclaredFields();
		for(Field pojoField:pojoFields)
		{
			pojoFieldsNameAndTypeClass pojoNameAndTypeObject=new pojoFieldsNameAndTypeClass();	
			pojoNameAndTypeObject.setName(pojoField.getName());
			pojoNameAndTypeObject.setType(pojoField.getType());
			pojoNameAndTypeList.add(pojoNameAndTypeObject);
		}
		
		
		// ------------------- Let's work on Result Set columns so that we may work with pojo fields-----------------
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int columnCount=rsmd.getColumnCount();
		// row loop
		while(rs.next())
		{
			Object pojoClassObject=pojoClass.newInstance();
			boolean flag=false;
			// column loop
			for(int i=1; i<=columnCount;i++)
			{
				for(pojoFieldsNameAndTypeClass pojoFieldNameAndType:pojoNameAndTypeList)
				{
					if(rsmd.getColumnName(i).equalsIgnoreCase(pojoFieldNameAndType.getName()))
					{
						 flag=true;
						break;
					}
				}
				if(flag)
				{
					Field field=pojoClass.getDeclaredField(rsmd.getColumnName(i));
					switch (rsmd.getColumnType(i)) {
						case Types.VARCHAR: 
										field.set(pojoClassObject,rs.getString(rsmd.getColumnName(i)));
										break;
								
						case Types.INTEGER: 
										field.set(pojoClassObject,rs.getString(rsmd.getColumnName(i)));
										break;
						
						case Types.DATE: 
										field.set(pojoClassObject,rs.getDate(rsmd.getColumnName(i)));
										break;
						
						case Types.TIMESTAMP:
										field.set(pojoClassObject, rs.getTimestamp(i));
										break;
						
						case Types.FLOAT:
										field.set(pojoClassObject,rs.getFloat(rsmd.getColumnName(i)));
										break;
						
						case Types.DOUBLE: 
										field.set(pojoClassObject,rs.getDouble(rsmd.getColumnName(i)));
										break;
						
						case Types.BIGINT: 
										field.set(pojoClassObject,rs.getLong(rsmd.getColumnName(i)));
										break;
						
						case Types.BOOLEAN: 
										field.set(pojoClassObject,rs.getBoolean(rsmd.getColumnName(i)));
										break;
						
					
						case Types.NUMERIC: 
										if(rs.getDouble(rsmd.getColumnName(i)) % 1==0)
											field.set(pojoClassObject, rs.getLong(rsmd.getColumnName(i)));
										else
											field.set(pojoClassObject, rs.getDouble(rsmd.getColumnName(i)));
										break;
						
						default:
										break;
			}	
			}
			}
			
			pojoClassList.add((T) pojoClassObject);
		}
		
		
		return pojoClassList;
		

		
	}
	
	
}
