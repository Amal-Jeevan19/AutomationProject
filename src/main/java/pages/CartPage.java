package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	ChromeDriver driver;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
	WebElement add;
	public CartPage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addc()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", add);
		Actions act=new Actions(driver);
		act.moveToElement(add).click().perform();
	}

}
