import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// click on multiple links in footer area
		int linkCount = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li/a")).size();
		// System.out.println(linkCount);
		for (int i = 0; i < linkCount; i++) {
			
			//to get the name of link
			//String linkName = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li/a")).get(i).getText();
			// System.out.println(linkName);
			
			 String link=driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li/a")).get(i).getAttribute("href");
			// System.out.println(link);
			driver.navigate().to(link);
			driver.navigate().back();

		}

	}

}
