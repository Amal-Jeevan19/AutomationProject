package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterTest {
ChromeDriver driver;
@BeforeTest
public void get()
{
	driver=new ChromeDriver();	
}
@BeforeMethod
public void url()
{
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fsearch%3Fq%3Dpride%2Band%2Bprejudice");
}
@Test
public void test()
{
	RegisterPage ob=new RegisterPage(driver);
	ob.radio();
	ob.Names();
	ob.drop();
	ob.emailid();
	ob.Passwords();
	ob.click();
	
}


}
