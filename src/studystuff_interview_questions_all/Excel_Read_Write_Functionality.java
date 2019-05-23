package studystuff_interview_questions_all;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write_Functionality 


{
	String file_path="C:\\Users\\gaurav.arora\\Desktop\\readData.xlsx";
	String file_path_new="C:\\Users\\gaurav.arora\\Desktop\\readData_new.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fout;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int row_num;
	int column_num;
	String data[][];
	
	public void readExcelData() throws Exception
	{
		file=new File(file_path);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("data");
		row_num=sheet.getLastRowNum()+1;
		column_num=sheet.getRow(0).getLastCellNum();
		
		System.out.println("No of rows "+row_num);
		System.out.println("No of Columns "+column_num);
		
		
		for(int i=0;i<row_num;i++)
		{
			row=sheet.getRow(i);
			System.out.println(row.getLastCellNum());
			data=new String[row_num][row.getLastCellNum()];
			for(int j=0;j<row.getLastCellNum();j++)
			{
				cell=row.getCell(j);
			
			data[i][j]=cell.getStringCellValue();
			System.out.println(data[i][j]);
			}
		}
		fis.close();
	}
	
	public void writeDataToExcel() throws Exception
	{
		System.out.println("Check write data to excel function");
		workbook=new XSSFWorkbook();
		sheet=workbook.createSheet("data_new");
		System.out.println(data.length);
		System.out.println(data[0].length);
		System.out.println(data[1].length);
		System.out.println(data[2].length);
		System.out.println(data[3].length);
		System.out.println(data[4].length);
		System.out.println(data[5].length);
		System.out.println(data[6].length);
		System.out.println(data[7].length);
		for(int i=0;i<data.length;i++)
		{
			row=sheet.createRow(i);
			for(int j=0;j<data[i].length;j++)
			{
				cell=row.createCell(j);
				cell.setCellValue(data[i][j]+" Data appended Successfully");
			}
		}
		file=new File(file_path_new);
		fout=new FileOutputStream(file);
		workbook.write(fout);
		System.out.println("Excel written successfully");
		fout.close();	
	}

	public static void main(String[] args) throws Exception 
	
	
	{
		Excel_Read_Write_Functionality obj=new Excel_Read_Write_Functionality();
		obj.readExcelData();
		obj.writeDataToExcel();
	}

}
