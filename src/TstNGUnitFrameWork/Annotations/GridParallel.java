package TstNGUnitFrameWork.Annotations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridParallel {
	DesiredCapabilities cap;
	@Parameters("browser")
	@Test
	public void launchBrowser(String browserName) throws MalformedURLException {
		if(browserName.equalsIgnoreCase("chrome")) {
			cap= DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
		cap= DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		}
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://automationpractice.com");
	}
}
