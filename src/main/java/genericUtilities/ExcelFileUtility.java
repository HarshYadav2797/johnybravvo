package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	public String excelDheet(String SheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		
	
	FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CAMPAIGNVTIGER.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    Sheet sht = wb.getSheet(SheetName);
    Row row = sht.getRow(rowNum);
    Cell cell = row.getCell(cellNum);
    String cellValue = cell.getStringCellValue();
    return cellValue;
	}
}
