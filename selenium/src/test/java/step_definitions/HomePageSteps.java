package step_definitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Log;
import objects.pages.HomePage;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
public class HomePageSteps extends AbstractStepDef {
    protected WebDriver driver;

    public HomePageSteps()
    {
        driver = Hooks.driver;
    };

    @Given("^the Trello home page is loaded$")
    public void theTrelloHomePageIsLoaded() throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.HomePageDisplays();
    }

    @Then("^the user should see header \"([^\"]*)\" displayed in the Trello homepage$")
    public void theUserShouldSeeHeaderDisplayedInTheTrelloHomepage(String header) throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.verifyHeaderDisplays(header);
    }

    @And("^the user should see text \"([^\"]*)\" displayed in the Trello homepage$")
    public void theUserShouldSeeTextDisplayedInTheTrelloHomepage(String text) throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.verifyHomePageTextDisplays(text);
    }

    @And("^the user should see subheader \"([^\"]*)\" displayed in the Trello homepage$")
    public void theUserShouldSeeSubheaderDisplayedInTheTrelloHomepage(String header) throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.verifysubHeaderDisplays(header);
    }

    @And("^the user should see small text \"([^\"]*)\" displayed in the Trello homepage$")
    public void theUserShouldSeeSmallTextDisplayedInTheTrelloHomepage(String text) throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.verifySmallTextDisplays(text);
    }

    @When("^the user click the login button in the Trello homepage$")
    public void theUserClickTheLoginButtonInTheTrelloHomepage() throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.clickLoginButton();
    }
}