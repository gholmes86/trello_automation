package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.LoginPage;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(LoginSteps.class.getName());
	
	protected WebDriver driver;

	public LoginSteps() {
		driver = Hooks.driver;
	}

	@And("^the user enters \"([^\"]*)\" in the email field in the Trello login page$")
    public void theUserEntersInTheEmailFieldInTheTrelloLoginPage(String email) throws Throwable {
       LoginPage loginPage= new LoginPage(driver);
       loginPage.enterUsername(email);
    }

    @And("^the user enters \"([^\"]*)\" in the password field in the Trello login page$")
    public void theUserEntersInThePasswordFieldInTheTrelloLoginPage(String password) throws Throwable {
        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterPassword(password);
    }

    @And("^the user clicks the login button in the Trello login page$")
    public void theUserClicksTheLoginButtonInTheTrelloLoginPage() throws Throwable {
        LoginPage loginPage= new LoginPage(driver);
        loginPage.clickLoginButton();
    }


}