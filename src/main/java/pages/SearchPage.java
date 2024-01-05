package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {
	ChromeDriver driver;
	By search=By.xpath("//*[@id=\"small-searchterms\"]");
	By button=By.xpath("//*[@id=\"small-search-box-form\"]/button");
	public SearchPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void values(String s)
	{
		driver.findElement(search).sendKeys(s);
	}
	public void click()
	{
		driver.findElement(button).click();
	}

}
