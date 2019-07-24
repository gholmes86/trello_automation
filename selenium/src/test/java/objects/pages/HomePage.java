package objects.pages;
import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.util.logging.Level;

import static junit.framework.Assert.assertTrue;


public class HomePage extends BasePage {
    private final By dashBoard = By.id("front-desk");

    public HomePage(WebDriver driver) {
        super(driver,20);
    }

    public void HomePageDisplays(){
        Log.info("Homepage displays");
        String verURL= "https://trello.com";
        driver.get(verURL);
        assertTrue(elementIsDisplayed(By.xpath("//*[@href='/signup'][contains(text(),'Sign Up')]")));
        }
    public void verifyHeaderDisplays(String header){
        Log.info("Verify header displays");
        assertTrue(elementIsDisplayed(By.xpath("//h3[contains(text(),'"+header+"')]")));
    }
    public void verifysubHeaderDisplays(String header){
        Log.info("Verify header displays");
        assertTrue(elementIsDisplayed(By.xpath("//h5[contains(text(),'"+header+"')]")));
    }
    public void verifyHomePageTextDisplays(String text){
        Log.info("Verify Home page text displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[p='"+text+"']")));
    }
    public void verifySmallTextDisplays(String text){
        Log.info("Verify Home page small text displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='small'][contains(text(),'"+text+"')]")));
    }
    public void clickLoginButton(){
        Log.info("Click Login button");
        clickElement(driver,By.xpath("//a[@href='/login'][contains(text(),'Log In')]"),20);
    }












}













