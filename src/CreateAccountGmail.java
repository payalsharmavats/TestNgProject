import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountGmail {

	public static void main(String[] args) {
		// to get the path
		String driverpath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
		// System.out.println(driverpath);
         //set the browser properties
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		// make a complex object
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();
		
		//launch the app
		driver.get("https://www.gmail.com/mail/help/intl/en/about.html?utm_expid=...");
		
		//to get the title
		System.out.println(driver.getTitle());
		
		//to find the elements
		//driver.findElement(By.id("identifierId")).sendKeys("payal.udana2010@gmail.com");
		
		//create account
		driver.findElement(By.id("gmail-create-account")).click();
		driver.findElement(By.id("firstName")).sendKeys("Payal");
		driver.findElement(By.id("lastName")).sendKeys("Sharma");
		driver.findElement(By.id("username")).sendKeys("sharmapayalvats");
		driver.findElement(By.name("Passwd")).sendKeys("sharma@1234");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("sharma@1234");
		
		driver.findElement(By.id("accountDetailsNext")).click();
	}

}
