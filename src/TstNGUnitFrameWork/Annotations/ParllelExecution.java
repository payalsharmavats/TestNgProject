package TstNGUnitFrameWork.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParllelExecution {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void Browserlaunch(String browser_name) {
//System.out.println(browser_name);
if(browser_name.equalsIgnoreCase("chrome")) {
		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form/");
}else if(browser_name.equalsIgnoreCase("firefox")){
	String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver", driverpath);
driver = new FirefoxDriver();

driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
	}

	}

}

