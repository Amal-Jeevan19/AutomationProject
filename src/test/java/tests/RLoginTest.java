package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.RLoginPage;

public class RLoginTest {
	ChromeDriver driver;
	@BeforeTest
	public void get()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}
	@Test
	public void values()
	{
		RLoginPage obj=new RLoginPage(driver);
		obj.set("flip@gmail.com", "abcdefgh");
		obj.click();
	}


}
