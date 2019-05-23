package studystuff_geeksforgeeks_string;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.util.ArrayUtil;
import org.apache.tools.ant.taskdefs.Length;



public class RemoveTrailingOrLeadingZerosFromString_ByArray_or_ByStringBuffer {

	

	public StringBuffer removeLeadingZeros(String str1)
	{
		
		int i=0;
		while(str1.charAt(i)=='0')
		{
			i++;
		}
		
		StringBuffer sb=new StringBuffer(str1);
		sb.replace(0, i, "");
		return sb;
	}
	
	public String removeTrailingZeros(String str1)
	{
		String rev_str="";
		char ch[]=str1.toCharArray();
		int arraylength=ch.length-1;
		// 00001122003300
		for(int j=arraylength;j>=0;j--)
		{
			if(ch[j]!='0')
			{	
			break;
			}
			else
			{
				// ch=ArrayUtils.removeElement(ch, ch[j]);
				arraylength--;
			}
		
		}
		char ch1[]=new char[arraylength+1];
		for(int k=0;k<=arraylength;k++) 
		{
			ch1[k]=ch[k];
		}
		return rev_str=new String(ch1);	
		
		
			}
	
	
public static void main(String[] args) 
	
	{
		
		RemoveTrailingOrLeadingZerosFromString_ByArray_or_ByStringBuffer obj=new RemoveTrailingOrLeadingZerosFromString_ByArray_or_ByStringBuffer();
		String str="00001122003300";
		System.out.println("Actual String is: "+str); 
		StringBuffer removeleadingzerostring=obj.removeLeadingZeros(str);
		System.out.println("Removed Leading Zeros String is: "+removeleadingzerostring);
		String removetrailingzerostring=obj.removeTrailingZeros(str);
		System.out.println("Removed Trailing Zeros String is: "+removetrailingzerostring);
		
		
	}
	
}
