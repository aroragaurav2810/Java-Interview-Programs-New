package databasetesting;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


/**
* This Class contains functions to:
*  • The workbook is created with the instance of the class with name "Alp-Output.xls" in "output" folder.
*  • Create a result sheet
*  • Save a result sheet
*  • Write a list of objects to excel with auto-mapping of headers and values
*  • Handles input with nested objects - 1 level of nesting -- added in version 1.1
*  • Handles Date Objects -- added in version 1.2
 * @author ashish.mohanty
 * @version 1.2
 * @since 2016/05/09
 */
public class ExcelUtilities {

	private static Logger log = Logger.getLogger(ExcelUtilities.class);
	public String OutputPath;
	ExcelOperations eop;
	
	/**
	 * The Result workbook is created when the instance of the class.
	 */
	public ExcelUtilities()
	{
		this.OutputPath = System.getProperty("user.dir")+"/output/Alp-Output.xlsx";
		log.info("Creating Result Sheet.");
		this.eop = new ExcelOperations(false);
	}
	/**
	 * A new file is created with overload name passed on object creation.
	 * @param name - name of the file to be created
	 */
	public ExcelUtilities(String name)
	{
		this.OutputPath = System.getProperty("user.dir")+"/output/"+name+".xlsx";
		log.info("Creating Result Sheet::" + name);
		this.eop = new ExcelOperations(false);
	}
	
	public ExcelUtilities(File file) throws InvalidFormatException, IOException
	{
		log.info("Opening Result Sheet::" + file.getName());
		this.eop = new ExcelOperations(file);
	}
	
	
	public void writeToCell(int row,int column,String message, String sheetname) throws IOException
	{
		eop.setWorkingSheet(sheetname);
		eop.writeCell(row, column, message);
	}
	/**
	 * This function is used to create new sheets in the result workbook.
	 * @param sheetname
	 * @throws IOException
	 * @throws NullPointerException
	 * @throws InvalidFormatException
	 */
	public void createResultSheet(String sheetname) throws IOException, NullPointerException, InvalidFormatException
	{
		int flag = 0;
		List<String> sheetNames = eop.getSheetNames();
		if(sheetNames.size()>0)
		{
			for(String name: sheetNames)
			{
				if(sheetname.equals(name))
				{
					eop.removeSheet(sheetname);
					eop.createNewSheet(sheetname);
					eop.setWorkingSheet(sheetname);
					flag=1;
				}
			}
		}
		if(flag == 0)
		{
			eop.createNewSheet(sheetname);
		}
	}
	
	
	/**
	 * This function write a list of java objects to excel sheet with headers extracted from the objects
	 * Performs the auto-mapping of variable and values to be written in excel.
	 * Takes a list of java objects to write it to excel.
	 * @param list1 - The list of java objects
	 * @param sheetName -  The sheet name to write value into
	 * @param row -  the start row from where the data is to be written
	 * @param head - boolean flag false to auto generate header, true for no header
	 * @return true or false on the basis if the operation was completed successfully
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException 
	 */
	public <T> boolean listToSheet(List<T> list1, String sheetName, int row, boolean head) throws IOException, IllegalArgumentException, IllegalAccessException, InstantiationException
	{
		boolean flag =head;
		log.info("Converting List to List of String Array for Excel.");
		List<String[]> datatowrite = new ArrayList<String[]>();
		String header[] , body[];
		int count =0;
		for(Object o : list1)
		{
			try
			{
			Field[] objectFields = o.getClass().getFields();
			if(!flag)
			{
					header = new String[objectFields.length];
					header = convertToStringArray(o, false);
					datatowrite.add(header);
					flag = true;
			}
				body =new String[objectFields.length];
				body = convertToStringArray(o, true);
				datatowrite.add(body);
				count++;
				//log.info("Converting data for list object:: "+ count);
			}
			catch(NullPointerException e)
			{
				log.info("Caught null pointer at position::" + count);
			}
		}
		eop.writeListOfStringArray(row, sheetName, datatowrite);
		log.info("Data Written to excel successfully.");
		return true;
	}
	
	
	/**
	 * This function write a list of java objects to excel sheet with headers extracted from the objects
	 * Performs the auto-mapping of variable and values to be written in excel.
	 * Takes a list of java objects to write it to excel.
	 * @param list1 - The list of java objects
	 * @param sheetName -  The sheet name to write value into
	 * @param row -  the start row from where the data is to be written
	 * @param column - the start column from where the data is to be written
	 * @param head - boolean flag false to auto generate header, true for no header
	 * @return true or false on the basis if the operation was completed successfully
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public <T> boolean listToSheet(List<T> list1, String sheetName, int row,int column, boolean head) throws IOException, IllegalArgumentException, IllegalAccessException, InstantiationException
	{
		boolean flag =head;
		log.info("Converting List to List of String Array for Excel.");
		List<String[]> datatowrite = new ArrayList<String[]>();
		String header[] , body[];
		int count =0;
		for(Object o : list1)
		{
			try
			{
			Field[] objectFields = o.getClass().getFields();
			if(!flag)
			{
					header = new String[objectFields.length];
					header = convertToStringArray(o, false);
					datatowrite.add(header);
					flag = true;
			}
				body =new String[objectFields.length];
				body = convertToStringArray(o, true);
				datatowrite.add(body);
				count++;
				//log.info("Converting data for list object:: "+ count);
			}
			catch(NullPointerException e)
			{
				log.info("Caught null pointer at position::" + count);
			}
		}
		eop.writeListOfStringArray(row,column, sheetName, datatowrite);
		log.info("Data Written to excel successfully.");
		return true;
	}
	
	
	/**
	 * This function is used to the save the work done on the result work book.
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void saveResultWorkbook() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		eop.saveWorkbook(OutputPath);
	}
	
	/**
	 * This function converts a list of objects to a string array ignoring the data type of the fields in the objects
	 * Individual object for which the values and field name are to be converted to string
	 * Flag true id the variable names are to be included as header row, false if no header row is required 
	 * @param object -  The object which is to be converted to String array with values
	 * @param flag - true or false
	 * @return String[] - An array of string of the converted values
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException 
	 */
	public String[] convertToStringArray(Object object, boolean flag) throws IllegalArgumentException, IllegalAccessException, InstantiationException
	{
		/** Added code to accept primitive type variables
		 * Code to handle primitive class variables
		 */
		if (object instanceof String || object instanceof Double || object instanceof Integer || object instanceof Long || object instanceof Boolean || object instanceof Float)
		{
			if (!flag)
			{
				String body[] = new String[1];
				//List Data is considered as the header for the column
				body[0] = "List Data"; 
				return body;
			}
			else
			{
				String body[] = new String[1];
				body[0] = object.toString();
				return body;
			}
		}
		else
		{
			
			Field[] objectFields = object.getClass().getFields();
			if(flag)
			{
				int bodycount=0;
				String body[] =new String[objectFields.length];
				for (Field f : objectFields)
				{
					/** Checks to verify if the field is a object or list of objects
					 *  Below code handles objects and list of objects
					 */
					Class<?> type = f.getType();
					if(!type.isPrimitive())
					{
						/** Added code to accept list of objects
						 * Code to handle List<?> variables
						 */
						if (Collection.class.isAssignableFrom(type))
						{
							List<?> innerlist = (List<?>) f.get(object);
							if(innerlist != null)
							{
							try
								{
									for(Object innerobject : innerlist)
									{
										if(innerobject !=null)
										{
											Field[] innerobjectFields = innerobject.getClass().getFields();
											body = Arrays.copyOf(body, body.length+innerobjectFields.length);
											for(Field finner : innerobjectFields)
											{
												try
												{
												body[bodycount] = finner.get(innerobject).toString();
												}
												catch(NullPointerException e)
												{
													body[bodycount] = "";
												}
												bodycount= bodycount+1;
											}
										}
									}
								}
								catch(NullPointerException e)
								{
									
								}
							}
						}
						
						else if(String.class.isAssignableFrom(type))
						{
							try
							{
								body[bodycount] = f.get(object).toString();
							}
							catch(NullPointerException e)
							{
								body[bodycount] = "";
							}
							bodycount= bodycount+1;
						}
						
						else if(Date.class.isAssignableFrom(type))
						{
							try
							{
								SimpleDateFormat dateformatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss") ;
								body[bodycount] = dateformatter.format(f.get(object)).toString();
							}
							catch(NullPointerException e)
							{
								body[bodycount] = "";
							}
							bodycount= bodycount+1;
						}
						
						else if(Long.class.isAssignableFrom(type))
						{
							try
							{
								body[bodycount] = f.get(object).toString();
							}
							catch(NullPointerException e)
							{
								body[bodycount] = "";
							}
							bodycount= bodycount+1;
						}
						else if(Double.class.isAssignableFrom(type))
						{
							try
							{
								body[bodycount] = f.get(object).toString();
							}
							catch(NullPointerException e)
							{
								body[bodycount] = "";
							}
							bodycount= bodycount+1;
						}
						else if(Integer.class.isAssignableFrom(type))
						{
							try
							{
								body[bodycount] = f.get(object).toString();
							}
							catch(NullPointerException e)
							{
								body[bodycount] = "";
							}
							bodycount= bodycount+1;
						}
						/** Added code to accept nested objects
						 * Below code handles conversion of nested objects
						 */
						else
						{
							Object internalclass = f.get(object);
							if(internalclass !=null)
							{
								Field[] internalobjectFields = internalclass.getClass().getFields();
								body = Arrays.copyOf(body, objectFields.length+internalobjectFields.length);
								for(Field fi : internalobjectFields)
								{
									try
									{
									body[bodycount] = fi.get(internalclass).toString();
									}
									catch(NullPointerException e)
									{
										body[bodycount] = "";
									}
									bodycount= bodycount+1;
								}
							}
						}
					}
					/** Added code to accept classes
					 * Code to handle class variables
					 */
					else
					{
						try
						{
							body[bodycount] = f.get(object).toString();
							
						}
						catch (NullPointerException e)
						{
							body[bodycount] = "";
							
						}
						bodycount= bodycount+1;
					}
				}
				return body;
			}
			else
			{
				int bodycount=0;
				String body[] =new String[objectFields.length];
				for (Field f : objectFields)
				{
					/** Checks to verify if the field is a object or list of objects
					 *  Below code handles objects and list of objects
					 */
					
					Class<?> type = f.getType();
					if(!type.isPrimitive())
					{
						/** Added code to accept list of objects
						 * Code to handle List<?> variables
						 */
						if (Collection.class.isAssignableFrom(type))
						{
							List<?> innerlist = (List<?>) f.get(object);
							String name =f.getName().toString();
							
							
							if(innerlist!=null)
							for(Object innerobject : innerlist)
							{
								Field[] innerobjectFields = innerobject.getClass().getFields();
								body = Arrays.copyOf(body, body.length+innerobjectFields.length);
								for(Field finner : innerobjectFields)
								{
									body[bodycount] = name +"/"+finner.getName().toString();
									bodycount= bodycount+1;
								}
								
							}
							
							
						}
						
						else if(String.class.isAssignableFrom(type))
						{
							body[bodycount] = f.getName().toString();
							bodycount= bodycount+1;
						}
						else if(Date.class.isAssignableFrom(type))
						{
							body[bodycount] = f.getName().toString();
							bodycount= bodycount+1;
						}
						else if(Long.class.isAssignableFrom(type))
						{
							body[bodycount] = f.getName().toString();
							bodycount= bodycount+1;
						}
						else if(Double.class.isAssignableFrom(type))
						{
							body[bodycount] = f.getName().toString();
							bodycount= bodycount+1;
						}
						else if(Integer.class.isAssignableFrom(type))
						{
							body[bodycount] = f.getName().toString();
							bodycount= bodycount+1;
						}
											
						/** Added code to accept nested objects
						 * Below code handles conversion of nested objects
						 */
						else
						{
							String name = f.getName();
							Object internalclass = f.getType().newInstance();
							Field[] internalobjectFields = internalclass.getClass().getFields();
							body = Arrays.copyOf(body, objectFields.length+internalobjectFields.length);
							for(Field fi : internalobjectFields)
							{
								body[bodycount] = name +"/"+fi.getName().toString();
								bodycount= bodycount+1;
							}
						}
					}	
					
					/** Added code to accept objects
					 * Code to handle class variables
					 */
					else
					{
						body[bodycount] = f.getName().toString();
						bodycount= bodycount+1;
					}
				}
				return body;
			}
		}
	}
}
