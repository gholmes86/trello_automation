package objects.pages;
import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.util.logging.Level;

import static junit.framework.Assert.assertTrue;


public class AdminHomePage extends BasePage {
    private final By dashBoard = By.id("front-desk");

    public AdminHomePage(WebDriver driver) {
        super(driver,20);
    }

    public void clickCreateAccountLink()

    {	Log.info("Clicking create account Link");

        clickElement(driver,By.xpath("//*[@id='createAccountLink']"),20);

    }
    public void clickApplicantAccount()

    {	Log.info("Clicking create account Link");

        clickElement(driver,By.xpath("//*[contains(text(),'Applicant Account')]"),20);

    }












}













