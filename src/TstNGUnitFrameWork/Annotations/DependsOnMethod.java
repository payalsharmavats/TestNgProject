package TstNGUnitFrameWork.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	WebDriver driver;
	@Test
	public void Browserlaunch() {

		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();

	}
@Test(dependsOnMethods="Browserlaunch")
	public void applaunch()  {
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
@Test(dependsOnMethods="applaunch")
public void login() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	WebElement elm=driver.findElement(By.id("txtPassword"));
	elm.sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}

}
