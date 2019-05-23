package studystuff_memory_management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FileWriting

{

	public void fileWriting(String wbname) throws Exception
	{

		
		String arr2d[][]=new String[4][3];
		Scanner scan=new Scanner(System.in);
	
		// Step1:  Created a data source for writing data into a file 
		
		for(int i=0;i<arr2d.length;i++)
		{
			for(int j=0;j<arr2d[i].length;j++)
			{
			System.out.println("Please enter value at index "+i+" and "+j);
				arr2d[i][j]=scan.next();	
				System.out.println("Array Value at index "+ i+" " + j+" " + arr2d[i][j]);
			}
		}
		
		// Step2:  Need a file to write data
		String file_path="C:\\Users\\ABC\\Desktop\\"+wbname;
		
		// Step:3 locate a file
		File file=new File(file_path);
		
		// Step4: need a workbook
		XSSFWorkbook wb=new XSSFWorkbook();
		
		// Step5: need a sheet
		XSSFSheet sheet=wb.createSheet("data2");
		
		
		// Step6: logic to write data in file
		for(int rownum=0;rownum<arr2d.length;rownum++)
		{
			XSSFRow row=sheet.createRow(rownum);
			for(int cellnum=0;cellnum<arr2d[rownum].length;cellnum++)
			{
				XSSFCell cell=row.createCell(cellnum);
				cell.setCellValue(arr2d[rownum][cellnum]);
			}
		}

		// Step7: File Writing via FileOutputStream
		FileOutputStream fout=new FileOutputStream(file);
		wb.write(fout);
		
		fout.close();
		
		System.out.println("Excel written Successfully");
	
	}
	
	public static void main(String[] args) throws Exception 
	
	{
		new FileWriting().fileWriting("gaurav.xlsx");
	}

}
