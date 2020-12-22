package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.AdminLoginPage;
import objects.pages.CreateApplicantPage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class CreateApplicantPageSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(CreateApplicantPageSteps.class.getName());

	protected WebDriver driver;

	public CreateApplicantPageSteps() {
		driver = Hooks.driver;
	}





    @Then("^the admin should see the Create Account page$")
    public void theAdminShouldSeeTheCreateAccountPage() throws Throwable {
       CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
       createApplicantPage.verifyCreateApplicantPage();
    }

    @When("^the admin enters \"([^\"]*)\" in the first name field in the Create Account page$")
    public void theAdminEntersInTheFirstNameFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterFirstname(text);
    }

    @And("^the admin enters \"([^\"]*)\" in the last name field in the Create Account page$")
    public void theAdminEntersInTheLastNameFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterLastName(text);
    }

    @And("^the admin enters \"([^\"]*)\" in the email field in the Create Account page$")
    public void theAdminEntersInTheEmailFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterEmail(text);
    }

    @And("^the admin enters \"([^\"]*)\" in the username field in the Create Account page$")
    public void theAdminEntersInTheUsernameFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterUsername(text);
    }

    @And("^the admin enters \"([^\"]*)\" in the password field in the Create Account page$")
    public void theAdminEntersInThePasswordFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterPassword(text);
    }

    @And("^the admin enters \"([^\"]*)\" in the confirm password field in the Create Account page$")
    public void theAdminEntersInTheConfirmPasswordFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterConfirmPassword(text);
    }

    @And("^the admin selects the Chicago developer role in the Create Account page$")
    public void theAdminSelectsTheChicagoDeveloperRoleInTheCreateAccountPage() throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.togglebutton();
        createApplicantPage.selectDevBaltimoreJob();
    }

    @And("^the user clicks the create button in the Create Account page$")
    public void theUserClicksTheCreateButtonInTheCreateAccountPage() throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.clickCreateApplicantButton();
    }

    @Then("^the new user should be created$")
    public void theNewUserShouldBeCreated() throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.verifyNewUser();
    }

    @When("^the admin enters \"([^\"]*)\" in the middle name field in the Create Account page$")
    public void theAdminEntersInTheMiddleNameFieldInTheCreateAccountPage(String text) throws Throwable {
        CreateApplicantPage createApplicantPage= new CreateApplicantPage(driver);
        createApplicantPage.enterMiddleName(text);
    }
}