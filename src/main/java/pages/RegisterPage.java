package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	ChromeDriver driver;
	@FindBy(xpath="//*[@id=\"gender-male\"]")
	WebElement gender;
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement fname;
	@FindBy(xpath="//*[@id=\"LastName\"]")
	WebElement lname;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	WebElement Day;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	WebElement Month;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	WebElement year;
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"Company\"]")
	WebElement company;
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"ConfirmPassword\"]")
	WebElement confirm;
	@FindBy(xpath="//*[@id=\"register-button\"]")
	WebElement button;
	public RegisterPage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void radio()
	{
		gender.click();
	}
	public void Names()
	{
		fname.sendKeys("Tyler");
		lname.sendKeys("Durden");
	}
	public void drop()
	{
		Select d=new Select(Day);
		d.selectByValue("5");
		Select m=new Select(Month);
		m.selectByValue("7");
		Select y=new Select(year);
		y.selectByValue("2024");
	}
	public void emailid()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)","");
		email.sendKeys("flip@gmail.com");
		company.sendKeys("Luminar");
	}
	public void Passwords()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)","");
		password.sendKeys("abcdefgh");
		confirm.sendKeys("abcdefgh");
		
	}
	public void click()
	{
		button.click();
	}
	
	

}
