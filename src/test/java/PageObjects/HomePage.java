package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[text()='My Account']") WebElement linkMyaccount;
	@FindBy(xpath="//a[@class='dropdown-item'][contains(text(),'Register')]") WebElement linkRgister;
	
	public void clickMyaccount()
	{
		linkMyaccount.click();
	}
	public void clickRegister()
	{
		linkRgister.click();
	}
	
}
