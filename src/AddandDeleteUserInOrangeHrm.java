import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddandDeleteUserInOrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement elm = driver.findElement(By.id("txtPassword"));
		elm.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		//driver.findElement(By.id("menu_admin_UserManagement")).click();

		 //driver.findElement(By.id("btnAdd")).click();
		/*or (int i = 1; i <= 3; i++) {
			driver.findElement(By.id("btnAdd")).click();
			int num = generateRandomNumber();
			String name = "Payal_" + num;
			
			driver.findElement(By.id("systemUser_userType")).sendKeys("ESS");
			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Thomas Fleming");

			driver.findElement(By.id("systemUser_userName")).sendKeys(name);
			driver.findElement(By.id("systemUser_status")).sendKeys("Enabled");
			// driver.findElement(By.id("systemUser_passwords")).sendKeys("Hello@123");
			// driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Hello@123");
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(2000);

		}*/
		//to delete the users
		//count the rows
		int ttlrows=driver.findElements(By.xpath("//a[contains(text(),'Payal_')]")).size();
		//System.out.println(ttlrows);
		for(int i=0;i<ttlrows;i++) {
			driver.findElements(By.xpath("//a[contains(text(),'Payal_')]/parent::td/preceding-sibling::td/input")).get(i).click();
			//driver.findElement(By.id("btnDelete")).click();
		}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
		

	}

	public static int generateRandomNumber() {
		Random rnd = new Random();
		int ranNum = rnd.nextInt(1000);
		return ranNum;

	}

}
