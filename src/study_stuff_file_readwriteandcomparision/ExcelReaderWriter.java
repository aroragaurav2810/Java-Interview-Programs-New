package study_stuff_file_readwriteandcomparision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.log.output.FileOutputLogTarget;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderWriter

{
	static String path="C:\\Users\\ABC\\Desktop\\atharv.xlsx";
	static File  file=new File(path);
	static FileInputStream fis;
	static FileOutputStream fout;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static  Object arr[][];
	
	DataFormatter df=new DataFormatter();
	public Object[][] readExcelData() throws Exception
	{

		 
		
		
		
		
		
		 fis=new FileInputStream(file);
		
		
		 wb=new XSSFWorkbook(fis);
		

		 sheet=wb.getSheet("sonika");
		
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
				 
				//df.formatCellValue(cell);
				arr[i][j]=df.formatCellValue(cell);
				
				System.out.print("\t"+ arr[i][j]);
			}
			System.out.println();
			
		}
		return arr;
	}
	
	
	public void writeDataToExcel(Object ar1[][]) throws Exception
	{
		path="C:\\Users\\ABC\\Desktop\\atharv.xlsx";
		//file=	new File(path);	
		//wb=new XSSFWorkbook();
		sheet= wb.createSheet("sonika1");
		for(int i=0;i<ar1.length;i++)
		{
		row=sheet.createRow(i);
				for(int j=0;j<ar1[i].length;j++)
				{
				cell=row.createCell(j);
				cell.setCellValue(ar1[i][j].toString());
				}
		}
		fout=new FileOutputStream(file);
		wb.write(fout);
		wb.close();
		System.out.println("Excel Written Successfully");
	}
	
	public static void main(String[] args) throws Exception 
	
	
	{
		Object data[][]	=new ExcelReaderWriter().readExcelData();
		new ExcelReaderWriter().writeDataToExcel(data);
	}	

}
