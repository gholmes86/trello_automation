package objects.pages;

import helpers.Log;
import org.fluttercode.datafactory.impl.DataFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.testng.AssertJUnit.assertTrue;

public class LoginPage extends BasePage {


	public LoginPage(WebDriver driver){
		super(driver,25);
	}

	public void enterUsername(String text)
	{	Log.info("Enter username");
		enterText(By.id("user"),text);

	}
	public void enterPassword(String text)
	{	Log.info("Enter password");
		enterText(By.id("password"),text);

	}
	public void clickLoginButton()
	{	Log.info("Click Login Button");
		clickElement(driver,By.id("login"),20);

	}




	}











	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
