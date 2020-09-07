package CustomUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReader {
	private Workbook wb;
	private Sheet sheet;
	private Row row;

	public XlReader(String sheetpath) throws IOException {
		// data read from file byte wise--fileinputstream,fileoutputstream
		// char--FileReader,FileWriter
		FileInputStream fis = new FileInputStream(sheetpath);
		wb = new XSSFWorkbook(fis);

	}

	/*
	 * public Sheet getCustomSheetName(String sheet_Name) { Sheet
	 * sheet=wb.getSheet(sheet_Name); return sheet; }
	 */
	public int getRowCount(String sheetName) {
		sheet = wb.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum();// 4
		int firstRow = sheet.getFirstRowNum();// 0
		// System.out.println(lastRow+" "+firstRow);
//int ttlRows=lastRow-firstRow+1;
		int ttlRows = lastRow + 1;
		return ttlRows;

		// sheet.getRow(arg0)
		// getCustomSheetName(sheetName);
	}

	public int getColCount() {

		row = sheet.getRow(0);// 0 is for row number
		int lastCellNum = row.getLastCellNum();
		System.out.println("last CellNum--" + lastCellNum);
		return lastCellNum;
	}

	public String getCellData(int r, int c) {

		String cellData = sheet.getRow(r).getCell(c).getStringCellValue();
		return cellData;

	}

	public static void main(String[] args) throws IOException {
		String sheetpath = System.getProperty("user.dir") + "\\src\\TestData\\testData.xlsx";

		XlReader xlr = new XlReader(sheetpath);
		int rCount = xlr.getRowCount("Login");
		System.out.println("Row Count" + rCount);
		int cCount = xlr.getColCount();
		System.out.println(cCount);
		for (int i = 0; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				String cellValue = xlr.getCellData(i, j);
				System.out.print("cell data--" + cellValue);
			}

			System.out.println();
		}
	}
}
