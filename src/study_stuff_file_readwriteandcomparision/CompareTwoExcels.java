package study_stuff_file_readwriteandcomparision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareTwoExcels 

{
	
	
	static File  file;
	static FileInputStream fis;
	static FileOutputStream fout;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static  Object arr[][];
	
	DataFormatter df=new DataFormatter();
	public Object[][] readExcelData(String excel_path, String sheetname) throws Exception
	{
		 file=new File(excel_path);
		 
		 fis=new FileInputStream(file);
				
		 wb=new XSSFWorkbook(fis);
		
		 sheet=wb.getSheet(sheetname);
		
		 row=sheet.getRow(0);
		
		 cell=row.getCell(0);
		 
		 int rowcount=sheet.getLastRowNum()+1;
				
		 arr=new Object[rowcount][];
				
		for(int i=0;i<rowcount;i++)	//-- Excel row loop   
		{
			row=sheet.getRow(i);
			int columncount=row.getLastCellNum();
			arr[i]=new Object[columncount];
			for(int j=0;j<columncount;j++) //-- Excel column loop   
			{
				
				cell=row.getCell(j);
				arr[i][j]=df.formatCellValue(cell);
				System.out.print("\t"+ arr[i][j]);
			}
				System.out.println();
			
		}
		return arr;
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception
	
	{
		Object excel1_arr[][]=new CompareTwoExcels().readExcelData("C:\\Users\\ABC\\Desktop\\atharv.xlsx","sonika");
		Object excel2_arr[][]=new CompareTwoExcels().readExcelData("C:\\Users\\ABC\\Desktop\\atharv1.xlsx","sonika");
		
		if(Arrays.deepEquals(excel1_arr,excel2_arr))
		{
			System.out.println("Excels are equal");
		}
		else
		{
			System.out.println("Excels are not equal");
		}

	}

}
