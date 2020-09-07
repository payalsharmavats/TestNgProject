package CustomUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Workbook wb;
	Sheet sheet;
	Row row;
	
	public ExcelReader(String sheetpath) throws IOException {
		FileInputStream fis=new FileInputStream(sheetpath);
		wb=new XSSFWorkbook(fis);
			}
	public Sheet getCustomSheetName(String sheet_name) {
		sheet=wb.getSheet(sheet_name);
		return sheet;
			}
	public int rowCount() {
		getCustomSheetName("Login");
		int lastrownumber=sheet.getLastRowNum();
		int ttlRows=lastrownumber+1;
		return ttlRows;
	}
	public int colCount() {
		row=sheet.getRow(0);
		int lastcellNum=row.getLastCellNum();
		return lastcellNum;
	}
	public String getCellData(int r, int c) {
		String cellData=sheet.getRow(r).getCell(c).getStringCellValue();
				return cellData;
	}
	

}
