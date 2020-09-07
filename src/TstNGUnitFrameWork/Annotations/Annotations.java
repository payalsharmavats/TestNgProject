package TstNGUnitFrameWork.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	/*beforesuite
beforetest
beforeclass
beforemethod
Browserlaunch
aftermethod
beforemethod
launchapp
aftermethod
Afterclass
Aftertest
PASSED: browserlaunch
PASSED: launchapp

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

Aftersuite*/
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("Aftertest");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("Aftersuite");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("Afterclass");
	}
	
	@Test
	public void browserlaunch() {
		System.out.println("Browserlaunch");
	}

	@Test
	public void launchapp() {
		System.out.println("launchapp");
	}
	@BeforeMethod
	public void clearFields()
{
		System.out.println("beforemethod");
		
		}
	@AfterMethod
	public void afterMethod()
	{
			System.out.println("aftermethod");
			
			}
}
