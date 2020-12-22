package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.AdminHomePage;
import objects.pages.AdminLoginPage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class AdminHomePageSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(AdminHomePageSteps.class.getName());

	protected WebDriver driver;

	public AdminHomePageSteps() {
		driver = Hooks.driver;
	}

	@When("^the admin clicks the Create Account link in the Catalyte home page$")
    public void theAdminClicksTheCreateAccountLinkInTheCatalyteHomePage() throws Throwable {
        AdminHomePage adminHomePage = new AdminHomePage(driver);
        adminHomePage.clickCreateAccountLink();
    }
    @And("^the admin selects the Applicant Account link$")
    public void theAdminSelectsTheApplicantAccountLink() throws Throwable {
        AdminHomePage adminHomePage = new AdminHomePage(driver);
        adminHomePage.clickApplicantAccount();
    }
}