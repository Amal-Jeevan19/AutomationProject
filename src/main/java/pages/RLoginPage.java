package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RLoginPage {
	ChromeDriver driver;
	By user=By.xpath("//*[@id=\"Email\"]");
	By pass=By.xpath("//*[@id=\"Password\"]");
	By button=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
	public RLoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void set(String u,String p )
	{
		driver.findElement(user).sendKeys(u);
		driver.findElement(pass).sendKeys(p);
	}
	public void click()
	{
		driver.findElement(button).click();
	}


}
