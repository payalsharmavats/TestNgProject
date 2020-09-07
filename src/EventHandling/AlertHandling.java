package EventHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertHandling {
	
	WebDriver driver;
	Alert alt;
	@BeforeClass
	public void browserLaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		
	}
	@Test(priority=1)
	public void alertBox() {
		driver.findElement(By.id("alertButton")).click();
		alt=driver.switchTo().alert();
		String text=alt.getText();//fetch the text
		System.out.println(text);
		alt.accept();//click on ok
		//alt.dismiss();//click on cancel
	
	}
	@Test(priority=2)
public void confirmationBox() {
	driver.findElement(By.id("confirmButton")).click();
	alt.dismiss();
}
	@Test(priority=3)
	public void promptBox() {
		driver.findElement(By.id("promtButton")).click();
		alt.sendKeys("Hello");
		alt.accept();
	}
}
