package EventHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseHandling {
	WebDriver driver;
	Actions action;
	@BeforeClass
	public void browserLaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/menu");
		action=new Actions(driver);
		
	}
	@Test(priority=1)
	public void click() {
		WebElement elm=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(elm).click().perform();
		driver.navigate().back();
	}
	@Test(priority=2)
	public void doubleclick() {
		WebElement elm=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.doubleClick(elm).perform();
		driver.navigate().back();
	}
	@Test(priority=3)
	public void moveToElem() {
		WebElement elm=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement elm1=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		WebElement elm2=driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		action.moveToElement(elm).perform();
		action.moveToElement(elm1).perform();
		action.moveToElement(elm2).click().perform();
		driver.navigate().back();
	}
	@Test(priority=4)
	public void clickAndHold() {
		WebElement elm=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.clickAndHold(elm).perform();
		
	}
	@Test(priority=5)
	public void contextClick() {
		WebElement elm=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.clickAndHold(elm).perform();
		
	}
	

}
