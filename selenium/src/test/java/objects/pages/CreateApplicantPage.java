package objects.pages;

import helpers.Log;
import junit.framework.TestCase;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class CreateApplicantPage extends BasePage {


	public CreateApplicantPage(WebDriver driver){
		super(driver,20);
	}

	String code=RandomStringUtils.randomAlphanumeric(3);
    public static String newuserFname;
    public static String newuserLname;
    public static String newuserFnamefinal;
    public static String newuserLnamefinal;



    public void enterFirstname(String text)
    {	Log.info("entering first name");
        enterText(By.id("Applicant_FirstName"),text+code);
        newuserFname=text+code;
    }
    public void enterMiddleName(String text)
    {	Log.info("entering middle name");
        enterText(By.id("Applicant_MiddleName"),text+code);

    }
    public void enterLastName(String text)
    {	Log.info("entering last name");
        enterText(By.id("Applicant_LastName"),text+code);
        newuserLname=text+code;
        assertTrue(!newuserLname.isEmpty());



    }
    public void enterEmail(String text)
    {	Log.info("entering email");
        enterText(By.id("txt_email"),text+code+"@mailinator.com");

    }
    public void enterUsername(String text)
    {	Log.info("entering username");
        clickElement(driver,By.id("txt_username"),20);
        enterText(By.id("txt_username"),text+code);

    }
    public void enterPassword(String text)
    {	Log.info("entering password");
        enterText(By.id("Password"),text);

    }
    public void enterConfirmPassword(String text)
    {	Log.info("entering confirm password");
        enterText(By.id("ConfirmPassword"),text);

    }

    public void togglebutton()
    {	Log.info("toggle button");
        clickElement(driver,By.id("facility-toggle-button"),20);

    }
    public void selectDevBaltimoreJob()
    {	Log.info("Click create board button");
        clickElement(driver,By.id("JobCategoryDisplayList.developer_baltimore"),20);

    }
    public void clickCreateApplicantButton()
    {	Log.info("Click create Applicant Button");
        clickElement(driver,By.id("createApplicantButton"),20);

    }
    public void verifyCreateApplicantPage()
    {	Log.info("Verify Page displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='h2_grayPageTitle'][contains(text(),'Create Applicant')]")));
    }
    public void verifyNewUser()
    {	Log.info("Verify New User displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='Applicant_Name']")));
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='Applicant_Name'][contains(text(),'"+newuserFname+"')]")));
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='Applicant_Name'][contains(text(),'"+newuserLname+"')]")));


    }

	}











	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
