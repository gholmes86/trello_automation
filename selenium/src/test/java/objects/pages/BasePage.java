package objects.pages;

import helpers.Log;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

import static org.testng.AssertJUnit.assertTrue;

public abstract class BasePage<T extends WebDriver> {

    protected final int waitTimeOutSeconds;


    protected WebDriver driver;

    public BasePage(WebDriver driver, int waitTimeOutSeconds) {
        this.driver = driver;
        this.waitTimeOutSeconds = waitTimeOutSeconds;

    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected List<WebElement> finds(By locator) {
        return driver.findElements(locator);
    }

    public boolean elementExists(By by) {
        try {
            findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void elementIsVisible(By e) {
        wait_until_true_or_timeout(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void elementIsPresent(By e) {
        wait_until_true_or_timeout(ExpectedConditions.presenceOfElementLocated(e));
    }

    public void elementIsClickable(By e) {
        wait_until_true_or_timeout(ExpectedConditions.elementToBeClickable(e));
    }

    /**
     * wait until condition is true or timeout kicks in
     */
    protected <V> V wait_until_true_or_timeout(ExpectedCondition<V> isTrue) {
        Wait<WebDriver> wait = new WebDriverWait(this.driver, waitTimeOutSeconds)
                .ignoring(StaleElementReferenceException.class);
        return wait.until(isTrue);
    }

    public boolean elementIsDisplayed(By by) {
        return waitUntilElementIsVisible(by).isDisplayed();
    }

    public boolean elementIsSelected(By by) {
        return waitUntilElementIsVisible(by).isSelected();
    }

    public void chooseSelectByValue(By by, String value) {
        new Select(findElement(by)).selectByValue(value);
    }

    public void enterText(By by, String text) {
        waitUntilElementIsClickable(by).sendKeys(text);
    }

    public WebElement waitUntilElementIsVisible(By by) {
        return new WebDriverWait(driver, waitTimeOutSeconds).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitUntilElementIsClickable(By by) {
        return new WebDriverWait(driver, waitTimeOutSeconds).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void clickElement(WebDriver driver, By by, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            //wait for element to be present in DOM
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            //scroll element into view
            WebElement element = driver.findElement(by);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            //wait for element to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(by));
            js.executeScript("arguments[0].click();", element);

        } catch (StaleElementReferenceException e) {
            Log.info("StaleElementReferenceException-" + e.getLocalizedMessage());
            e.printStackTrace();


        } catch (WebDriverException e) {
            Log.info("WebDriverException getMessage-" + e.getMessage());
            e.printStackTrace();
            Log.info("WebDriverException done");

        }
    }
    public void waitforduration(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void takeWebElementScreenshot(By by, String fileName) {
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        WebElement element = driver.findElement(by);
        Point p = element.getLocation();

        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        BufferedImage img = null;
        try {
            img = ImageIO.read(screen);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedImage dest = img.getSubimage(p.getX(), p.getY(), width,
                height);

        File testFile = new File("./log/" + "ActualScreenshots/" + fileName + ".png");
        try {
            ImageIO.write(dest, "png", testFile);
            // ImageIO.write(dest, "png", testFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // FileUtils.copyFile(screen, testFile);
	}

	}
