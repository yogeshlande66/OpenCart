package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']") WebElement LoginButton;
	@FindBy(xpath="//input[@id='input-email']") WebElement email_id;
	@FindBy(xpath="//input[@id='input-password']") WebElement  email_password;
	@FindBy(xpath="//button[text()='Login']") WebElement Login_Submit;
	@FindBy(xpath="//div[@class='mb-3']/a[normalize-space()='Forgotten Password']") WebElement ForgetPassword;
	
	public void loginPage()
	{
		LoginButton.click();
		
	}
	public void enterEmail(String email)
	{
		email_id.sendKeys(email);
		
	}
	public void enterPassword(String pass)
	{
		email_password.sendKeys(pass);
		
	}
	public void clickLoginButton()
	{
		Login_Submit.click();		
	}

}
