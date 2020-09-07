package SeleniumEasycom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputInTofields {

	public static void main(String[] args) throws InterruptedException {
		String driverPath=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		//driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello EveryOne");
		//driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("10");
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
	}

}
