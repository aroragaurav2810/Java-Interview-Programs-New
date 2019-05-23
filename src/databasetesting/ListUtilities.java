package databasetesting;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
/**
 * This class sets two lists of delta
 * deltainlist1 - Contains the list of objects not present in list2
 * deltainlist2 - Contains the list of objects not present in list1
 * @author ashish.mohanty
 * @version 1.0
 * @since 2016/05/05
 */
public class ListUtilities{

	private static Logger log = Logger.getLogger(ListUtilities.class);
	
	public List <Object> deltainlist1 = new ArrayList<Object>();
	public List <Object> deltainlist2 = new ArrayList<Object>();
	int list1flag, list2flag;

	/**
	 * This methods sets the delta values for the input lists in output lists
	 * @param list1
	 * @param list2
	 */
	public  <T> void listDelta (List<T> list1, List<T> list2)
	{
		
		log.info("Calculating Delta for List1...");
		//Check for objects in list1 in list2
		for(Object l1 : list1)
		{
			list1flag=0;
			for(Object l2:list2)
			{
				if (l1.equals(l2))
				{
					list1flag = list1flag+1;
					break;
				}
			}
			if (list1flag==0)
			{
				deltainlist1.add(l1);
			}
		}
		
		log.info("Delta Calculated for List1...");
		
		log.info("Calculating Delta for List2...");
		//Check for objects in list2 in list1
		for(Object l2 : list2)
		{
			list2flag=0;
			for(Object l1:list1)
			{
				if (l2.equals(l1))
				{
					list2flag = list2flag+1;
					break;
				}
			}
			if (list2flag==0)
			{
				deltainlist2.add(l2);
			}
		}
		
		log.info("Delta Calculated for List2...");
	}
	
	
	/**
	 * Chop list into smaller lists
	 * @param list
	 * @param L -size of list
	 * @return list of smaller lists
	 */
	public static <T> List<List<T>> chopped(List<T> list, final int L) {
	    List<List<T>> parts = new ArrayList<List<T>>();
	    final int N = list.size();
	    for (int i = 0; i < N; i += L) {
	        parts.add(new ArrayList<T>(
	            list.subList(i, Math.min(N, i + L)))
	        );
	    }
	    log.info("Lists Chopped with set size of:: "+ L);
	    return parts;
	}
}
