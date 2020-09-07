package TstNGUnitFrameWork.Annotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CustomUtility.XlReader;

public class DataProviderDemo {
	@DataProvider
	public String[][] readData() throws IOException {
		String sheetpath = System.getProperty("user.dir") + "\\src\\TestData\\tdata.xlsx";

		XlReader xlr = new XlReader(sheetpath);
		int rCount = xlr.getRowCount("Login");
		System.out.println("Row Count" + rCount);
		int cCount = xlr.getColCount();
		System.out.println(cCount);
		String[][] dataArr = new String[rCount - 1][cCount];

		for (int i = 1; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				dataArr[i - 1][j] = xlr.getCellData(i, j);
				// System.out.println(dataArr[i][j]);
			}

		}
		return dataArr;
	}

	@Test(dataProvider = "readData")
	public void login(String username, String password) {
		System.out.println(username + "====" + password);

	}

}
