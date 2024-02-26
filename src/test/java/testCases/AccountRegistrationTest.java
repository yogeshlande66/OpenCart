package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegistrationTest extends  BaseClass{
	
	public WebDriver driver;
    public WebDriverWait wait;	
	
	@Test
	public void testAccountRegistration()
	{
		logger.info("*********Strting AccountRegistration********");
		
		HomePage hpage=new HomePage(driver);
		hpage.clickMyaccount();
		logger.info("Click on account");
		hpage.clickRegister();	
		logger.info("Click on Registration");
		AccountRegistrationPage acPage=new AccountRegistrationPage(driver);
		acPage.setFirstName(randomeString().toUpperCase());
		acPage.setLastName(randomeString().toLowerCase());
		acPage.setEmail(randomeString()+"@gmail.com"); // Randomly generated the mail
		acPage.setPassword(randomeAlphanumeric());
		acPage.clickAgreeCheckBox();
		acPage.Login();
		logger.info("Click on login");
		Assert.assertEquals(true,"Sucessfully login");
		logger.info("Sucessfully Login The");
		
	}
		
}
	
