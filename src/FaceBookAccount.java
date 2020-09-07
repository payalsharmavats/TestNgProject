

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccount {

	public static void main(String[] args) {
		//set the path, launch the application
		//String path=System.getProperty("user.dir")+"\\src\\BrowsersDrivers\\chromedriver.exe";
		String path=System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		//launch the application
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		//fill details
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("payal");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("sharma");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("goodforeveryon@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("goodforeveryon@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("payal");
		//driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("sharma");
		//driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("goodforeveryon@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys("goodforeveryon@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("chips@123");
		
		
		
		Select selday=new Select(driver.findElement(By.id("day")));
		
		selday.selectByValue("15");
		Select selmonth=new Select(driver.findElement(By.id("month")));
				selmonth.selectByValue("7");
		Select selyear=new Select(driver.findElement(By.id("year")));
		selyear.selectByValue("1990");
		driver.findElement(By.id("u_0_6")).click();
		
		driver.findElement(By.xpath("//*[@id=\"u_0_12\"]")).click();
		
	}

}
