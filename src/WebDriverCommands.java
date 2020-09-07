import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		//1. launch browser
		//driver path
        // absolute path---E:\SeleniumBasics\src\BrowserDrivers\chromedriver.exe
		//dynamic path
		//String path=System.getProperty("user.dir");//project directory path-E:\SeleniumBasics
		//System.out.println(path);
		//\src\BrowserDrivers\chromedriver.exe we need this path
		
		String driverpath=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe";
		//System.out.println(driverpath);
		
		//set browser properties
		System.setProperty("webdriver.chrome.driver",driverpath);

		WebDriver driver=new ChromeDriver();//complex object
		
		//for firefox
		//String driverpath=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\geckodriver.exe";
		
		//System.setProperty("webdriver.Firefox.driver",driverpath);
		//WebDriver driver=new ChromeDriver();//complex object
		
		//how to maximize window
		driver.manage().window().maximize();
	   
		//launch the application
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//get the current/actual url of app
		String actualUrl=driver.getCurrentUrl();
		String expUrl="https://opensource-demo.orangehrmlive.com/";
		
		if(expUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("Matched");
			
		}else {
			System.out.println("Not Matched");
		}
		
		//to get the title
		System.out.println(driver.getTitle());
		
		//to find the elements
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement elm=driver.findElement(By.id("txtPassword"));
		elm.sendKeys("admin123");
		
		//forgot password link
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.navigate().forward();
		
		//to cancel on the forgot password page
		//driver.findElement(By.id("btnCancel")).click();
		
		//login Button
		
		
		//to go back
		//driver.navigate().back();
		
		//logout
		driver.findElement(By.linkText("Welcome Admin")).click();
		//driver.findElement(By.id("aboutDisplayLink")).click();
		//driver.findElement(By.className("close")).click();
		//driver.findElement(By.partialLinkText("Logout")).click();
		
		driver.findElement(By.className("panelContainer")).isDisplayed();
		driver.findElement(By.id("aboutDisplayLink")).click();
		driver.findElement(By.className("close")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//enter text in username and clear it
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).clear();
		
	}

}
