package step_definitions;

import java.net.MalformedURLException;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

  public static WebDriver driver;

  @Before
  /**
   * Delete all cookies at the start of each scenario to avoid shared state between tests
   */
  public void openBrowser() throws MalformedURLException {

    String browser = System.getProperty("BROWSER");
    if (browser == null) {
      browser = System.getenv("BROWSER");
      if (browser == null) {
        browser = "chrome";
      }
    }
    System.out.println("openBrowser: browser " + browser);
    switch (browser) {
    case "chrome":

      if (StringUtils.isEmpty(System.getProperty("webdriver.chrome.driver")))
        System.setProperty("webdriver.chrome.driver", "//Applications//chrome//chromedriver");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-extensions");
      options.addArguments("--start-maximized");
      options.addArguments("--always-authorize-plugins=false");
      driver = new ChromeDriver(options);
      driver.manage().deleteAllCookies();
      driver.manage().window().setSize(new Dimension(1280, 1024));
      break;
    case "firefox":
      if (StringUtils.isEmpty(System.getProperty("webdriver.gecko.driver")))
        System.setProperty("webdriver.gecko.driver", "//Applications//gecko//geckodriver");
      driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().setSize(new Dimension(1280, 1024));
      driver.manage().window().maximize();
      break;
    case "ie":
      driver = new InternetExplorerDriver();
      break;
    case "safari":
      driver = new SafariDriver();
      break;
    default:
      driver = new ChromeDriver();
      break;
    }
    System.out.println("Opening Browser...." + browser);
  }

  @After
  /**
   * Embed a screenshot in test report if test is marked as failed
   */
  public void embedScreenshot(Scenario scenario) {

    if (scenario.isFailed()) {
      byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
      scenario.embed(screenshot, "image/png");
    }
    if (driver != null) {
      driver.quit();

    }

  }
}
