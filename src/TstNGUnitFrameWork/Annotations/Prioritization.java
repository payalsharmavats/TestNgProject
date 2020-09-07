package TstNGUnitFrameWork.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Prioritization {
	WebDriver driver;//null
	@Test(priority=1)
	public void browserlaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(priority=2)
	public void applaunch() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority=3)
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement elm=driver.findElement(By.id("txtPassword"));
		elm.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
//to ignore a method
	@Test(enabled=false)
	public void logout() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
