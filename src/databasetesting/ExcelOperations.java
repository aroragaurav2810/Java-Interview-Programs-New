package databasetesting;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Standard class for interacting with MS Excel file.<br>
 * Provides functions like<br>
 * 1.Create new workbook<br>
 * 2.Create create new sheet.<br>
 * 3.Remove/Add sheet
 * 4.Read/Write from/to cell.
 * 
 * @author priyesh.tuli
 * @author nishant.thakur
 * @author sambhav.chawla
 * @author sonam.chhetri
 *
 */

public class ExcelOperations {


	private Workbook wb;

	/**
	 * boolean to keep track of file type in use. True if XLS file and false for
	 * XLSX file.
	 */
	private boolean isXLS;

	/**
	 * Index of current working sheet
	 */
	private int currentSheetIndex;

	/**
	 * File object of workbook. null is case of default Constructor and
	 * Constructor with Workbook as parameter.
	 */
	private File workbookAsFile;

	// ----------------------Contructors----------------------------------

	/**
	 * Default constructor. Creates a blank XLS workbook.
	 */
	public ExcelOperations() {
		this(true);
	}
	
	/**Closes Workbook object
	 * Must be called at then end otherwise file used will be unusable by following code
	 * @throws IOException
	 */
	public void  close() throws IOException{
	    if (wb != null) 
	    { wb.close(); }
	}

	/**
	 * Accepts boolean to create XLS file true, XLSX file if false.
	 * 
	 * @param isXLS
	 *            true for XLS file, false for XLSX file
	 */
	public ExcelOperations(boolean isXLS) {
		if (isXLS) {
			createNewXLS();
		} else {
			createNewXLSX();
		}

	}

	/**
	 * This constructor accepts object org.apache.poi.ss.usermodel.Workbook to
	 * initialise. Attempts to cast Workbook parameter into XLS or XLSX format.
	 * 
	 * @param book
	 */
	public ExcelOperations(Workbook book) {
		setWorkBook(book);
	}

	/**
	 * This constructor accepts InputStream to initialise
	 * 
	 * @param stream
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public ExcelOperations(InputStream stream) throws InvalidFormatException, IOException {
		this(WorkbookFactory.create(stream));
	}

	/**
	 * This constructor accepts object of File type to initialise.
	 * 
	 * @param file
	 *            XLS or XLSX file object.
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public ExcelOperations(File file) throws InvalidFormatException, IOException {
		this(WorkbookFactory.create(file));

		// Save reference to file. Would be useful is delete operation.
		this.workbookAsFile = file;

	}


	/**
	 * This constructor accepts path of file
	 * 
	 * @param fileLocation of current file
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public ExcelOperations(String fileLocation) throws InvalidFormatException, IOException {
		this(new File(fileLocation));
	}

	/**
	 * Writes the supplied list of String array to file
	 * 
	 * @param startingRow
	 *            where list should start
	 * @param sheetName
	 *            to write in
	 * @param contentToWrite
	 *            List of String array to write
	 * @throws IOException
	 */
	public void writeListOfStringArray(int startingRow, String sheetName, List<String[]> contentToWrite)throws IOException {
		int currentRow = startingRow;
		for (int currentItem = 0; currentItem < contentToWrite.size(); currentItem++) {
			for (int currentArrayIteration = 0; currentArrayIteration < contentToWrite.get(currentItem).length; currentArrayIteration++) {
				writeCell(sheetName, currentRow, currentArrayIteration + 1,contentToWrite.get(currentItem)[currentArrayIteration]);
			}
			currentRow++;
		}
	}

	/**
	 * Writes the supplied list of String array to file
	 * 
	 * @param startingRow
	 *            where list should start
	 * @param contentToWrite
	 *            List of String array to write
	 * @throws IOException
	 */
	public void writeListOfStringArray(int startingRow, List<String[]> contentToWrite) throws IOException {
		int currentRow = startingRow;
		for (int currentItem = 0; currentItem < contentToWrite.size(); currentItem++) {
			for (int currentArrayIteration = 0; currentArrayIteration < contentToWrite.get(currentItem).length; currentArrayIteration++) {
				writeCell(currentRow, currentArrayIteration + 1,contentToWrite.get(currentItem)[currentArrayIteration]);
			}
			currentRow++;
		}
	}
	
	/**Writes the supplied list of String array to file
	 * @param startingRow where list should start
	 * @param startingColumn where list should start
	 * @param contentToWrite List of String array to write
	 * @throws IOException
	 */
	public void writeListOfStringArray(int startingRow, int startingColumn, List<String[]> contentToWrite) throws IOException {
		int currentRow = startingRow;
		for (int currentItem = 0; currentItem < contentToWrite.size(); currentItem++) {
			for (int currentArrayIteration = 0; currentArrayIteration < contentToWrite.get(currentItem).length; currentArrayIteration++) {
				writeCell(currentRow, startingColumn + currentArrayIteration,contentToWrite.get(currentItem)[currentArrayIteration]);
			}
			currentRow++;
		}
	}


/**Writes the supplied list of String array to file
	 * @param startingRow where list should start
	 * @param startingColumn where list should start
	 * @param contentToWrite List of String array to write
	 * @throws IOException
	 */
	public void writeListOfStringArray(int startingRow, int startingColumn, String sheetName, List<String[]> contentToWrite)throws IOException {
		int currentRow = startingRow;
		for (int currentItem = 0; currentItem < contentToWrite.size(); currentItem++) {
			for (int currentArrayIteration = 0; currentArrayIteration < contentToWrite.get(currentItem).length; currentArrayIteration++) {
				writeCell(sheetName, currentRow, startingColumn + currentArrayIteration, contentToWrite.get(currentItem)[currentArrayIteration]);
			}
			currentRow++;
		}
	}

	// --------------------Separate methods for XLS and XLSX
	// operations----------------------------------

	/**
	 * Create new XLS Workbook
	 */
	private void createNewXLS() {
		// Create XLSx workbook
		wb = new HSSFWorkbook();
		isXLS = true;

		workbookAsFile = null;
		currentSheetIndex = -1;
	}

	/**
	 * Create new XLSX Workbook
	 */
	private void createNewXLSX() {
		// Create XLS workbook
		wb = new XSSFWorkbook();
		isXLS = false;

		workbookAsFile = null;
		currentSheetIndex = -1;
	}

	// ---------------------------Public
	// methods-------------------------------------------

	/**
	 * Returns true if current workbook is XLS, false if XLSX
	 * 
	 * @return true if file is xls
	 */
	public boolean isXLS() {
		return isXLS;
	}

	/**
	 * Returns true if current workbook is XLSX, false is if XLS
	 * 
	 * @return false if file is not xls
	 */
	public boolean isXLSX() {
		return !isXLS;
	}

	/**
	 * Returns current Workbook
	 * 
	 * @return object of org.apache.poi.ss.usermodel.Workbook
	 */
	public Workbook getWorkBook() {
		return wb;
	}

	/**
	 * Sets given Workbook as current Workbook
	 * 
	 * @param book
	 */
	public void setWorkBook(Workbook book) {
		if (book instanceof XSSFWorkbook) {
			// Create XLSx workbook
			wb = (XSSFWorkbook) book;
			isXLS = false;
		} 
		else {
			// Create XLS workbook
			wb = (HSSFWorkbook) book;
			isXLS = true;
		}

		workbookAsFile = null;

		// If workbook has sheets inside then set current working sheet as first
		// sheet
		if (wb.getNumberOfSheets() > 0) {
			currentSheetIndex = 0;
		}
		// If no sheets, then set working sheet as -1
		else {
			currentSheetIndex = -1;
		}
	}

	/**
	 * Sets given sheet name as Working sheet. Working sheet would be the sheet
	 * where further operations like getCelValue and writeCellValue would be
	 * performed if sheetname is not provided. 
	 * @param name of sheet
	 */
	public void setWorkingSheet(String name) {
		currentSheetIndex = wb.getSheetIndex(name);
	}

	/**
	 * Sets given sheet as Working sheet.
	 * 
	 * @param name
	 */
	public void setWorkingSheet(int index) {
		currentSheetIndex = index;
	}

	/**
	 * Returns name of Working Sheet.
	 * 
	 * @return current working sheet in String
	 */
	public String getWorkingSheetName() {
		return wb.getSheetAt(currentSheetIndex).getSheetName();
	}

	/**
	 * Returns index of Working sheet.
	 * 
	 * @return current working sheet index in String
	 */
	public int getWorkingSheetIndex() {
		return currentSheetIndex;
	}
	
	/**Returns current working sheet.
	 * 
	 * @return
	 */
	public Sheet getWorkingSheet() {
		
		return wb.getSheetAt(currentSheetIndex);
	}

	
	
	/**
	 * Returns cell value from a particular row and column of a default excel
	 * file. Sets given Sheet name as current working sheet.
	 * @param sheetName to get data from
	 * @param rowNum Row number requested.
	 * @param colNum Column number requested.
	 * @return Returns Value found at the requested row and column.
	 * @throws IOException
	 */
	public String getCellValue(String sheetName, int rowNum, int colNum) throws IOException {
		String currentSheet=getWorkingSheet().getSheetName();
		String value;
		
		setWorkingSheet(sheetName);
		
		setCellType(rowNum, colNum);
		value=wb.getSheetAt(currentSheetIndex).getRow(rowNum-1).getCell(colNum-1).getStringCellValue();
		
		//resetting current sheet 
		setWorkingSheet(currentSheet);
		
		return value;
	}

	/**
	 * Returns cell value from a particular row and column of current working
	 * sheet.
	 * 
	 * @param rowNum
	 *            Row number requested.
	 * @param colNum
	 *            Column number requested.
	 * @return Returns Value found at the requested row and column.
	 * @throws IOException
	 */
	public String getCellValue(int rowNum, int colNum) throws IOException {
		setCellType(rowNum, colNum);
		return wb.getSheetAt(currentSheetIndex).getRow(rowNum - 1).getCell(colNum - 1).getStringCellValue();
	}
	
	/**
	 * Set cell type to string before reading any value.
	 * 
	 */
	private void setCellType(int rowNum, int colNum) {
		
		getWorkingSheet().getRow(rowNum-1).getCell(colNum-1).setCellType(1);	//cell type value 1 is for string
		
	}
	

	/**
	 * Updates cell in default excel file at desired row and column. Sets given
	 * Sheet name as current working sheet.
	 * 
	 * @param sheetName
	 *            sheet of file
	 * @param rowNum
	 *            Row number desired.
	 * @param colNum
	 *            Column number desired.
	 * @param value
	 *            Value to be inserted.
	 * @throws IOException
	 * @throws Exception
	 */
	public void writeCell(String sheetName, int rowNum, int colNum, String value) throws IOException {
		setWorkingSheet(sheetName);
		Row r = wb.getSheet(sheetName).getRow(rowNum - 1);
		if (r == null) {
			r = wb.getSheet(sheetName).createRow(rowNum - 1);
		}
		Cell c = r.getCell(colNum - 1);
		if (c == null) {
			c = r.createCell(colNum - 1);
		}
		c.setCellValue(value);
	}


	/**
	 * Updates cell in default excel file at desired row and column in current
	 * working sheet.
	 * 
	 * @param rowNum
	 *            Row number desired.
	 * @param colNum
	 *            Column number desired.
	 * @param value
	 *            Value to be inserted.
	 * @throws IOException
	 * @throws Exception
	 */
	public void writeCell(int rowNum, int colNum, String value) throws IOException {
		Row r = wb.getSheetAt(currentSheetIndex).getRow(rowNum - 1);
		if (r == null) {
			r = wb.getSheetAt(currentSheetIndex).createRow(rowNum - 1);
		}
		Cell c = r.getCell(colNum - 1);
		if (c == null) {
			c = r.createCell(colNum - 1);
		}
		c.setCellValue(value);
	}

	/**
	 * Creates new file by the name supplied.
	 * 
	 * @param filename
	 *            Name of the file (DO NOT ADD EXTENSION TO FILE).
	 * @param sheetName
	 *            Name of sheet to be created along.
	 * @param location
	 *            Location where new excel file need to be created.
	 * @throws IOException
	 * @deprecated use proper constructor.
	 */
	public File createNewFile(String filename, String sheetName, String location) throws IOException {
		filename = filename + ".xls";
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook();
		@SuppressWarnings("unused")
		Sheet sheet = workbook.createSheet(sheetName);

		FileOutputStream out = new FileOutputStream(new File(location + '/' + filename));
		workbook.write(out);
		out.close();

		File f = new File(location + '/' + filename);
		return f;
	}

	/**
	 * Deletes sheet requested from the excel file.
	 * 
	 * Care must be taken if the removed sheet is the currently working or only
	 * sheet in the workbook.
	 * 
	 * @param sheetName
	 * @throws IOException
	 */
	public void removeSheet(String sheetName) throws IOException {
		if (currentSheetIndex == wb.getSheetIndex(sheetName)) {
			wb.removeSheetAt(currentSheetIndex);
			setWorkingSheet(wb.getActiveSheetIndex());
		}
		
		else {
			wb.removeSheetAt(wb.getSheetIndex(sheetName));
		}

	}

	/**
	 * Create new sheet with requested sheet name and sets this as current
	 * working sheet. Sets given Sheet name as current working sheet.
	 * 
	 * @param sheetName
	 *            Sheet name desired.
	 * @throws IOException
	 */
	public void createNewSheet(String sheetName) throws IOException {
		wb.createSheet(sheetName);
		setWorkingSheet(sheetName);
	}

	/**
	 * Returns number of sheets
	 * 
	 * @return integer representing the number of sheets
	 * @throws IOException
	 */
	public int getNumberOfSheets() throws IOException {
		return wb.getNumberOfSheets();
	}

	/**
	 * Returns names of sheets in excel file
	 * 
	 * @return Sheet names
	 * @throws IOException
	 */
	public ArrayList<String> getSheetNames() throws IOException {

		ArrayList<String> names = new ArrayList<String>();

		for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			names.add(wb.getSheetName(i));
		}

		return names;
	}

	/**
	 * Returns data of each cell in given row in the form of a ArrayList
	 * <string> Sets given Sheet name as current working sheet.
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @return data of each cell in the form of a ArrayList
	 * @throws IOException
	 */
	public ArrayList<String> getRow(String sheetName, int rowNum) throws IOException {

		// Set sheet as current working sheet
		setWorkingSheet(sheetName);

		// Return values
		return getRow(rowNum);

	}
	
	
	/**Returns last populated row of current working sheet.
	 * 
	 * @return
	 */
	public int getLastPopulatedRowNum() {
		
		int lastpopulatedrow=0;
		int firstCell, lastCell;
		
		try {
			//get first and last cells of last row
			firstCell= getWorkingSheet().getRow(getWorkingSheet().getLastRowNum()).getFirstCellNum();
			
			//last cell is always index+1 by default. Hence 1 subtracted.
			lastCell= getWorkingSheet().getRow(getWorkingSheet().getLastRowNum()).getLastCellNum();
			
			if(firstCell==(lastCell-1)) {	//if both cells are same and cell is null or empty.
	
				if(getWorkingSheet().getRow(getWorkingSheet().getLastRowNum()).getCell(firstCell).toString()==null || getWorkingSheet().getRow(getWorkingSheet().getLastRowNum()).getCell(firstCell).toString().isEmpty()) {				
					lastpopulatedrow = 0;
				}
				else {
					lastpopulatedrow=getWorkingSheet().getLastRowNum()+1;
				}
			}
			else {

				for(int i=firstCell; i<lastCell; i++) {
					
					if( !(getWorkingSheet().getRow(getWorkingSheet().getLastRowNum()).getCell(i).toString()==null || getWorkingSheet().getRow(getWorkingSheet().getLastRowNum()).getCell(i).toString().isEmpty()) ) {
						lastpopulatedrow=getWorkingSheet().getLastRowNum()+1;
						break;
					}
				}
			}
		}
		catch(Exception nullPtrExp ) {
			lastpopulatedrow=0;
		}
		return lastpopulatedrow;
	}

	/**Return last populated row of requested sheet.
	 * Method does not change current working sheet to sheetName requested.
	 * 
	 * @param sheetName
	 * @return Last populated sheet
	 */
	public int getLastPopulatedRowNum(String sheetName) {
		int lastRow;
		
		String currentSheet=getWorkingSheet().getSheetName();
		
		
		setWorkingSheet(sheetName);
				
		lastRow=getLastPopulatedRowNum();
		
		setWorkingSheet(currentSheet);		//resetting working sheet
		
		return lastRow;
		
	}
	
	/**Returns the last populated cell from a requested row of current working sheet.
	 * 
	 * @param row : row number as visible on sheet.
	 * 
	 * @return Last populated cell number.
	 */
	public int getLastPopulatedCellNum(int row) {
		int lastCell;
		
		try{
			lastCell = getWorkingSheet().getRow(row-1).getLastCellNum();
		}
		catch(Exception e) {
			lastCell = 0;
		}
		
		return lastCell;
	}
	
	/**Returns the last populated cell of the row in the requested sheet.
	 * Does not change the current working sheet.
	 * 
	 * @param sheetName : Sheet name
	 * @param row : Row number in the sheet
	 * @return Last populated cell number
	 */
	public int getLastPopulatedCellNum(String sheetName, int row) {
		
		int lastcell;
		
		String currentSheet = getWorkingSheet().getSheetName();
		setWorkingSheet(sheetName);
		lastcell = getLastPopulatedCellNum(row);
		setWorkingSheet(currentSheet);			//resetting working sheet
		
		return lastcell;
	}
	

	/**
	 * Returns all data of given row in current working sheet as an ArrayList
	 * <string>
	 * 
	 * @param rowNum
	 * @return all data of a row in the form of a ArrayList
	 * @throws IOException
	 */
	public ArrayList<String> getRow(int rowNum) throws IOException {
		// Create empty list
		ArrayList<String> rowData = new ArrayList<String>();
		
		int limit = getLastPopulatedCellNum(rowNum);
		for (int c=1; c<=limit; c++){
			rowData.add(getCellValue(rowNum, c));
		}

		// Return list of values
		return rowData;
	}

	/**
	 * Saves workbook in location of original file which was used to initialise
	 * the object of this class.
	 * 
	 * NOTE: Use this only if either of following constructors were used for
	 * initialisation. -public ExcelOperations (String fileLocation) -public
	 * ExcelOperations (File file)
	 * 
	 * If any other constructor was used for initialisation, then call
	 * saveWorkboo(String path)
	 * 
	 * @throws IOException
	 * @throws NullPointerException
	 *             if any other constructor was used to initialise the object.
	 * @throws InvalidFormatException
	 */
	public void saveWorkbook() throws IOException, NullPointerException, InvalidFormatException {
		File srcFile = new File(this.workbookAsFile.getAbsolutePath());
		Path oldFilePath = Paths.get(srcFile.getAbsolutePath());
		Path parentPath = Paths.get(srcFile.getAbsolutePath()).getParent();		
		File destFile = new File(parentPath + "\\temp" + this.workbookAsFile.getName());
		destFile.createNewFile();	
		FileOutputStream out = new FileOutputStream(destFile);		
		wb.write(out);
		out.close();
		wb.close();
		String newFilePath = srcFile.getAbsolutePath();
		Files.delete(oldFilePath);
		@SuppressWarnings("unused")
		boolean renamed = destFile.renameTo(new File(newFilePath));
		workbookAsFile = (new File(newFilePath));
		wb = WorkbookFactory.create(workbookAsFile);
		setWorkBook(wb);
		workbookAsFile = (new File(newFilePath));
	}

	/**
	 * Saves workbook in given path.
	 * 
	 * @param path
	 *            location to save file. Note: path = location + workbook file
	 *            name with extension
	 * @throws IOException
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public void saveWorkbook(String path) throws IOException, EncryptedDocumentException, InvalidFormatException {
		int sheetIndex = currentSheetIndex;
		File srcFile = new File(path);
		FileOutputStream out = new FileOutputStream(srcFile);
		wb.write(out);
		out.close();
		// Save reference to this file
		workbookAsFile = srcFile;
		wb = WorkbookFactory.create(workbookAsFile);
		setWorkBook(wb);
		workbookAsFile = srcFile;
		currentSheetIndex = sheetIndex;
	}

	/**
	 * Deletes workbook if present physically, i.e initialisation of this object
	 * was done using File object or Path to excel file, or saveWorkbook(String
	 * path) was called earlier for this object.
	 */
	public void deleteWorkbook() {
		if (workbookAsFile != null) {
			workbookAsFile.delete();
		}
		wb = null;
	}
}
