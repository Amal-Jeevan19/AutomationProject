package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest {
	ChromeDriver driver;
	@BeforeTest
	public void get()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://demo.nopcommerce.com/search?q=pride+and+prejudice");;
	}
	@Test
	public void test()
	{
		CartPage ob=new CartPage(driver);
		ob.addc();
	}

}
