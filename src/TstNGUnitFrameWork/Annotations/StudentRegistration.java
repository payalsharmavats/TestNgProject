package TstNGUnitFrameWork.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class StudentRegistration {
	WebDriver driver;

	@BeforeClass
	public void Browserlaunch() {

		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();

	}

	@BeforeMethod
	public void applaunch() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void StudentDetails() throws InterruptedException {

		driver.findElement(By.id("firstName")).sendKeys("payal");
		driver.findElement(By.id("lastName")).sendKeys("sharma");
		driver.findElement(By.id("userEmail")).sendKeys("payal.udana2010@gmail.com");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");

		driver.findElement(By.id("dateOfBirthInput")).click();
		Select selmonth = new Select(driver.findElement(By.xpath("//select[contains(@class,'month-select')]")));
		selmonth.selectByValue("1");
		Select selyear = new Select(driver.findElement(By.xpath("//select[contains(@class,'year-select')]")));
		selyear.selectByValue("1990");
		driver.findElement(By.xpath("//div[text()='15']")).click();

		
		driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\pc\\Downloads\\wallpaperflare.com_wallpaper.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("Chandigrah");
				
	     Thread.sleep(2000);
		 driver.findElement(By.id("state")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'Haryana')]")).click();
		 driver.findElement(By.id("city")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'Karnal')]")).click();
		
		 driver.findElement(By.id("submit")).click();

	}
}