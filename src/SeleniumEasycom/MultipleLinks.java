package SeleniumEasycom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		
		
		int countlink=driver.findElements(By.xpath("//div[contains(@class,'col-md-6')]/child::ul//child::li//a[contains(text(),'Tutorial')]")).size();
		       //System.out.println(countlink);
		for(int i=0;i<countlink;i++){
			String link=driver.findElements(By.xpath("//div[contains(@class,'col-md-6')]/child::ul//child::li//a[contains(text(),'Tutorial')]")).get(i).getAttribute("href");
			driver.navigate().to(link);
			driver.navigate().back();
			}
		}

}
