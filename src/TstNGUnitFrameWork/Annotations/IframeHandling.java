package TstNGUnitFrameWork.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IframeHandling {
	WebDriver driver;
	@BeforeClass
	public void iframe() {
	String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverpath);

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.navigate().to("https://demoqa.com/frames");
	}
	@Test
	public void iframeWays() {
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.id("sampleHeading")).getText();
	//by using webelement
		WebElement iframeElm=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElm);
		//to switch out from the current frame
		driver.switchTo().defaultContent();
		
		
	}
}
