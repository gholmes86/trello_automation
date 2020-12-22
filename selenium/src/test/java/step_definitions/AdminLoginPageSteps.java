package step_definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import objects.pages.AdminLoginPage;
import objects.pages.AdminHomePage;
import org.openqa.selenium.WebDriver;

public class AdminLoginPageSteps extends AbstractStepDef {
    protected WebDriver driver;

    public AdminLoginPageSteps()
    {
        driver = Hooks.driver;
    };

    @Given("^the Catalyte Admin login page is loaded$")
    public void theCatalyteAdminLoginPageIsLoaded() throws Throwable {
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        adminLoginPage.getURL();
    }

    @And("^the user enters \"([^\"]*)\" in the username field in the Admin login page$")
    public void theUserEntersInTheUsernameFieldInTheAdminLoginPage(String name) throws Throwable {
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        adminLoginPage.enterUsername(name);
    }

    @And("^the user enters \"([^\"]*)\" in the password field in the Admin login page$")
    public void theUserEntersInThePasswordFieldInTheAdminLoginPage(String text) throws Throwable {
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        adminLoginPage.enterPassword(text);
    }

    @And("^the user clicks the sign in button in the Admin login page$")
    public void theUserClicksTheSignInButtonInTheAdminLoginPage() throws Throwable {
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        adminLoginPage.clickLoginButton();
    }

    @Then("^the user should successfully be logged in to the Catalyte home page$")
    public void theUserShouldSuccessfullyBeLoggedInToTheCatalyteHomePage() throws Throwable {
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        adminLoginPage.verifyAdminHomePage();
    }

}