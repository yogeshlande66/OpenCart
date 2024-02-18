package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger; // 
	
	
	@BeforeClass
	public void setup()
	{
		//Loading Log4j2  File
		logger=LogManager.getLogger(this.getClass());
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies(); // Deletes All Cookies from browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://demo.opencart.com/index.php");
	    driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();		
	}
	// Used here random data genrator method and class		
	
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
