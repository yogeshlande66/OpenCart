package PageObjects;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Registration pages locator
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement FirstName;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement LastName;
	@FindBy(xpath="//input[@id='input-email']")  WebElement Email;
	@FindBy(xpath="//input[@id='input-password']") WebElement Password;
	@FindBy(xpath="//input[@name='agree']") WebElement AgreeCheckBox;
	@FindBy(xpath="//button[@class='btn btn-primary']") WebElement Login;
	
	
	public void setFirstName(String fname)

	{
		FirstName.sendKeys(fname);
	}
	public void setLastName(String lastname)
	{
		LastName.sendKeys(lastname);
	}
	
	public void setEmail(String email)
	{
		LastName.sendKeys(email);
	}
	public void setPassword(String password)
	{
		LastName.sendKeys(password);
	}
	public void clickAgreeCheckBox()
	{
		AgreeCheckBox.click();
		
	}
	public void Login()
	{
		Login.click();
	}
	public  String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(10);
		return generatedString;
    }
	public String randomeNumber()
	{
		String generatedNumber=RandomStringUtils.randomNumeric(10);
		return  generatedNumber;
		
	}
	public String randomeAlphanumeric()
	{
		String generatedAlphabetic=RandomStringUtils.randomAlphabetic(5);
		String generatedAlphaNo=RandomStringUtils.randomNumeric(5);
		return  (generatedAlphabetic+"@"+generatedAlphaNo);	
	}	
	
	
}
