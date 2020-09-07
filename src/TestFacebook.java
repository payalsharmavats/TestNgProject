import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) {
		// get the path
		String driverpath=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe";
		//System.out.println(driverpath);
		//launch the browser
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		
		//launch the application
		//driver.get("https://www.facebook.com/");
	    driver.navigate().to("https://www.facebook.com/");
	    
	    //maximize window
	    driver.manage().window().maximize();
	    
	    //find elements
	    driver.findElement(By.id("email")).sendKeys("payal.udana2010@gmail.com");
	    
	    driver.findElement(By.id("pass")).sendKeys("samosa@1234");
	    
	    //login button
	    driver.findElement(By.id("loginbutton")).click();
	  //*[@id="u_0_m"]
	    
	}

}
