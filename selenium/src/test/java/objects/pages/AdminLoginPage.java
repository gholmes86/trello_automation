package objects.pages;

import helpers.Log;
import org.apache.commons.lang.StringUtils;
import org.fluttercode.datafactory.impl.DataFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.logging.Level;

import static org.testng.AssertJUnit.assertTrue;

public class AdminLoginPage extends BasePage {


	public AdminLoginPage(WebDriver driver){
		super(driver,25);
	}

	public void getURL(){
		String envName = "dev";
		if (!StringUtils.isEmpty(System.getProperty("catalyte.siteUrl"))) {
			envName = System.getProperty("catalyte.siteUrl");
		}
		final String loginUrl = "https://admin.talent." + envName + ".catalystdevworks.com/Catalyte/login";
        driver.get(loginUrl);
	}

	public void enterUsername(String text)
	{	Log.info("Enter username");
		enterText(By.id("usernameInput"),text);

	}
	public void enterPassword(String text)
	{	Log.info("Enter password");
		enterText(By.id("passwordInput"),text);

	}
	public void clickLoginButton()
	{	Log.info("Click Sign in Button");
		clickElement(driver,By.id("loginSubmitbtn"),20);

	}
    public void verifyAdminHomePage()
    {	Log.info("verify Admin Home Page");
        assertTrue(elementIsDisplayed(By.id("applicantLink")));

    }

	}











	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
