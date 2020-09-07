package TstNGUnitFrameWork.Annotations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CustomUtility.ExcelReader;
import CustomUtility.XlReader;

public class LoginDataProvider {
	WebDriver driver;
	@BeforeClass
public void browserLaunch() {
	String driverpath=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driverpath);

	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	   
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
}
	@DataProvider
	public String[][] readData() throws IOException {
		String sheetpath = System.getProperty("user.dir") + "\\src\\TestData\\Login.xlsx";

		ExcelReader xlr = new ExcelReader(sheetpath);
		int rCount = xlr.rowCount();
		
		int cCount = xlr.colCount();
		
		String[][] dataArr = new String[rCount - 1][cCount];

		for (int i = 1; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				dataArr[i - 1][j] = xlr.getCellData(i, j);
			
			}

		}
		return dataArr;
	}
	@Test(dataProvider="readData")
	public void login(String username,String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

}
