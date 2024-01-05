package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest {
	ChromeDriver driver;
	@BeforeTest
	public void get()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fsearch%3Fq%3Dpride%2Band%2Bprejudice%26cid%3D0%26mid%3D0%26advs%3Dfalse%26isc%3Dfalse%26sid%3Dfalse");
	}
	@Test
	public void set()
	{
		SearchPage ob=new SearchPage(driver);
		ob.values("pride and prejudice");
		ob.click();
	}

}
