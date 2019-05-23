package study_stuff_file_readwriteandcomparision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log.output.FileOutputLogTarget;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUsingIteratorClass

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
	public void readExcelData() throws Exception
	{

		
		 fis=new FileInputStream(file);
		
		 wb=new XSSFWorkbook(fis);
		
		 sheet=wb.getSheet("sonika");
		
		 row=sheet.getRow(0);
		
		 cell=row.getCell(0);
		
		 int rowcount=sheet.getLastRowNum()+1;
		
		 arr=new Object[rowcount][];
		 
		Iterator<Row> row_iterator=sheet.iterator();
		while(row_iterator.hasNext())
		{
			
			Iterator<Cell> cell_iterator=row_iterator.next().iterator();	
			//int row_num=row_iterator.next().getRowNum();
			//int column_num=cell_iterator.next().getColumnIndex();
			//arr[row_num]=new Object[column_num];
			while(cell_iterator.hasNext())
			{
				
				//arr[row_num][column_num]=df.formatCellValue(cell_iterator.next());
				System.out.print("\t"+df.formatCellValue(cell_iterator.next()));
				//System.out.print("\t"+ arr[row.getRowNum()][cell.getColumnIndex()]);
			}
			System.out.println();
		}
		 
		 
	//	return arr;
	}
	
	
	
	public static void main(String[] args) throws Exception 
	
	
	{
		new ExcelReaderUsingIteratorClass().readExcelData();
		
		
	}	

}
