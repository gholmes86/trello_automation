package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.BoardPage;
import objects.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class BoardPageSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(BoardPageSteps.class.getName());

	protected WebDriver driver;

	public BoardPageSteps() {
		driver = Hooks.driver;
	}


    @Then("^the user should successfully be logged in to Trello$")
    public void theUserShouldSuccessfullyBeLoggedInToTrello() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyBoardPage();
    }

    @When("^the user click the Create new board item in the Boards page$")
    public void theUserClickTheCreateNewBoardItemInTheBoardsPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickNewBoard();
    }

    @And("^the user enters \"([^\"]*)\" in the Add board title in the Create Board modal$")
    public void theUserEntersInTheAddBoardTitleInTheCreateBoardModal(String title) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.enterBoardTitle(title);
    }

    @And("^the user click the Create Board button in the Boards page$")
    public void theUserClickTheCreateBoardButtonInTheBoardsPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickCreateBoardButton();
    }

    @Then("^the \"([^\"]*)\" trello board should be displayed$")
    public void theTrelloBoardShouldBeDisplayed(String header) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyBoardHeader(header);
    }

    @When("^the user enters list title \"([^\"]*)\" in the Board page$")
    public void theUserEntersListTitleInTheBoardPage(String title) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.enterListtitle(title);
    }

    @And("^the user enters card title \"([^\"]*)\" in the Board page$")
    public void theUserEntersCardTitleInTheBoardPage(String title) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.enterCardTitle(title);
    }
    @And("^the user chooses \"([^\"]*)\" for the Boards visibility option$")
    public void theUserChoosesForTheBoardsVisibilityOption(String choice) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.selectBoardChoicePublicOrPrivate(choice);
    }

    @And("^the user clicks the Add List button in the Board page$")
    public void theUserClicksTheAddListButtonInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickAddListButton();
    }

    @Then("^the Title \"([^\"]*)\" should be displayed in the Board page$")
    public void theTitleShouldBeDisplayedInTheBoardPage(String title) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyListTitle(title);
}

    @When("^the user clicks Add a card in the Board page$")
    public void theUserClicksAddACardInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickAddCardIcon();
    }

    @And("^the user clicks the Add Card button in the Board page$")
    public void theUserClicksTheAddCardButtonInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickAddCardGreenButton();
    }

    @Then("^the Automated card \"([^\"]*)\" should be displayed$")
    public void theAutomatedCardShouldBeDisplayed(String card) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyCardDisplayed(card);
    }

    @When("^the user clicks Add another card in the Board page$")
    public void theUserClicksAddAnotherCardInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickAddAnotherCardButton();
    }

    @When("^the user clicks Add another list in the Board page$")
    public void theUserClicksAddAnotherListInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickAddAnotherList();
    }

    @When("^the user selects the \"([^\"]*)\" board in the Board page$")
    public void theUserSelectsTheBoardInTheBoardPage(String title) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickBoardTitle(title);
    }

    @And("^the user can drag \"([^\"]*)\" card over to the \"([^\"]*)\" list$")
    public void theUserCanDragCardOverToTheList(String card, String list) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.dragaAndDropCard(card,list);
    }

    @When("^the user navigates to \"([^\"]*)\"$")
    public void theUserNavigatesTo(String url) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.userNavigate(url);
    }

    @When("^the user clicks the \"([^\"]*)\" card in the Board page$")
    public void theUserClicksTheCardInTheBoardPage(String card) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickCardDisplayed(card);
    }

    @Then("^the card detail window should be displayed$")
    public void theCardDetailWindowShouldBeDisplayed() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyCardDetailWindow();
    }

    @When("^the user enters \"([^\"]*)\" in the description in the card detail window$")
    public void theUserEntersInTheDescriptionInTheCardDetailWindow(String text) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.enterCardDescription(text);
    }

    @And("^the user clicks the save button$")
    public void theUserClicksTheSaveButton() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickSaveButton();
    }

    @And("^the user enters \"([^\"]*)\" in the comments section in the card detail window$")
    public void theUserEntersInTheCommentsSectionInTheCardDetailWindow(String text) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.enterCardComments(text);
    }

    @And("^the user closes the card detail window$")
    public void theUserClosesTheCardDetailWindow() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickCloseIcon();
    }

    @Then("^the card should now have details attached in the Board page$")
    public void theCardShouldNowHaveDetailsAttachedInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyCardHasComments();
    }


    @Then("^the card should now have the description icon displayed in the card in the Board page$")
    public void theCardShouldNowHaveTheDescriptionIconDisplayedInTheCardInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyCardHasDescription();
    }

    @And("^the card should now have the comments icon displayed in the card in the Board page$")
    public void theCardShouldNowHaveTheCommentsIconDisplayedInTheCardInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyCardHasComments();
    }

    @And("^the user clicks the save button for comments$")
    public void theUserClicksTheSaveButtonForComments() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickSaveButtonComments();
    }

    @And("^the user should see \"([^\"]*)\" comment text displayed in the card$")
    public void theUserShouldSeeCommentTextDisplayedInTheCard(String number) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyCardCommentNumber(number);
    }

    @And("^the user clears the Description in the card detail window$")
    public void theUserClearsTheDescriptionInTheCardDetailWindow() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clearDescription();
    }

    @And("^the user clears the Comments in the card detail window$")
    public void theUserClearsTheCommentsInTheCardDetailWindow() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clearComments();
    }

    @Then("^the card should not have the description icon displayed in the card in the Board page$")
    public void theCardShouldNotHaveTheDescriptionIconDisplayedInTheCardInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyIconRemoved();
    }

    @When("^the user clicks the Invite icon in the Board page$")
    public void theUserClicksTheInviteIconInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickInviteIcon();
    }

    @And("^the user enter \"([^\"]*)\" in the email address in the Invite To Board pop up$")
    public void theUserEnterInTheEmailAddressInTheInviteToBoardPopUp(String text) throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.enterInviteeEmail(text);
    }

    @And("^the user clicks the Send Invite button in the Invite To Board pop up$")
    public void theUserClicksTheSendInviteButtonInTheInviteToBoardPopUp() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickSendInviteButton();
    }

    @Then("^the membership invitee member should appear in the Board page$")
    public void theMembershipInviteeMemberShouldAppearInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyInviteeDisplays();
    }

    @When("^the user click the invitee member in the Board page$")
    public void theUserClickTheInviteeMemberInTheBoardPage() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickInviteeDisplayed();
    }

    @And("^the user selects Remove from Board in the pop up$")
    public void theUserSelectsRemoveFromBoardInThePopUp() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickRemoveFromBoard();
    }

    @And("^the user click the Remove Memeber button$")
    public void theUserClickTheRemoveMemeberButton() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.clickRemoveMemberButton();
    }

    @Then("^the invitee should be removed$")
    public void theInviteeShouldBeRemoved() throws Throwable {
        BoardPage boardPage= new BoardPage(driver);
        boardPage.verifyMemberRemoved();
    }
}