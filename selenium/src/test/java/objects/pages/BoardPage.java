package objects.pages;

import helpers.Log;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class BoardPage extends BasePage {


	public BoardPage(WebDriver driver){
		super(driver,25);
	}

	public void verifyBoardPage()
	{	Log.info("Verify Board page");
		assertTrue(elementIsDisplayed(By.xpath("//*[@class='boards-page-board-section-header-name'][contains(text(),'Personal Boards')]")));

	}
	public void clickNewBoard()
    {	Log.info("Click new board");
        clickElement(driver,By.xpath("//*[@class='board-tile mod-add']"),20);

    }
    public void enterBoardTitle(String text)
    {	Log.info("entering board title");
        enterText(By.xpath("//*[@class='subtle-input']"),text);

    }
    public void selectBoardChoicePublicOrPrivate(String choice)
    {	Log.info("selecting board display");
        clickElement(driver,By.xpath("//*[contains(@class,'subtle-chooser-trigger')]"),20);
        clickElement(driver,By.xpath("//*[@class='icon-sm icon-"+choice+"']"),20);
        clickElement(driver,By.xpath("//*[@class='js-confirm full primary']"),20);

    }
    public void clickCreateBoardButton()
    {	Log.info("Click create board button");
        clickElement(driver,By.xpath("//*[@type='submit']"),20);

    }
    public void verifyBoardHeader(String header)
    {	Log.info("Verify Board header");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='js-board-editing-target board-header-btn-text'][contains(text(),'"+header+"')]")));

    }
    public void enterListtitle(String text)
    {	Log.info("Enter List title");
        clickElement(driver,By.xpath("//*[@class='open-add-list js-open-add-list']"),20);
        enterText(By.name("name"),text);
        find(By.name("name")).sendKeys(Keys.ENTER);
    }

    public void clickAddListButton()
    {	Log.info("Click add list button");
        clickElement(driver,By.xpath("//*[@class='primary mod-list-add-button js-save-edit']"),20);

    }
    public void verifyListTitle(String title)
    {	Log.info("Verify List Title");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input'][contains(text(),'"+title+"')]")));

    }
    public void clickAddCardIcon()
    {	Log.info("Click add card icon");
        clickElement(driver,By.xpath("//*[@class='js-add-a-card']"),20);

    }
    public void enterCardTitle(String text)
    {	Log.info("Enter Card title");
        enterText(By.xpath("//*[@class='list-card-composer-textarea js-card-title']"),text);
    }
    public void clickAddCardGreenButton()
    {	Log.info("Click add card green button");
        clickElement(driver,By.xpath("//*[@class='primary confirm mod-compact js-add-card']"),20);

    }
    public void verifyCardDisplayed(String card)
    {	Log.info("Verify Cardpage");
        driver.navigate().refresh();
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='list-card-title js-card-name'][contains(text(),'"+card+"')]")));

    }
    public void clickAddAnotherCardButton()
    {	Log.info("Click add another card option");
        clickElement(driver,By.xpath("//*[@class='js-add-another-card'][contains(text(),'Add another card')]"),30);

    }
    public void clickAddAnotherList()
    {	Log.info("Click add another list option");
        clickElement(driver,By.xpath("//*[@class='open-add-list js-open-add-list']"),30);

    }
    public void clickBoardTitle(String title)
    {	Log.info("Click Board title");
        clickElement(driver,By.xpath("//*[contains(@href,'"+title+"')]"),30);

    }
    public void dragaAndDropCard(String card,String list)
    {	Log.info("Click Board title");
        elementIsClickable(By.xpath("//*[@class='list-card-title js-card-name'][contains(text(),'"+card+"')]"));
        WebElement element = find(By.xpath("//*[@class='list-card-title js-card-name'][contains(text(),'"+card+"')]"));
        WebElement target = find(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input'][contains(text(),'"+list+"')]"));
        (new Actions(driver)).dragAndDrop(element, target).perform();
        driver.navigate().refresh();
    }
    public void userNavigate(String url)
    {	Log.info("Navigating to url");
        driver.navigate().to(url);

    }
    public void clickCardDisplayed(String card)
    {	Log.info("Clicking Card");
        clickElement(driver,By.xpath("//*[@class='list-card-title js-card-name'][contains(text(),'"+card+"')]"),20);

    }
    public void verifyCardDetailWindow()
    {	Log.info("Verify Card Detail Window displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='card-detail-window u-clearfix']")));

    }
    public void enterCardDescription(String text)
    {	Log.info("Enter Card Description");
        clickElement(driver,By.xpath("//*[@class='description-fake-text-area hide-on-edit js-edit-desc js-hide-with-draft']"),25);
        enterText(By.xpath("//*[@class='field field-autosave js-description-draft description card-description']"),text);
    }
    public void enterCardComments(String text)
    {	Log.info("Enter Card Comments");
        enterText(By.xpath("//*[@class='comment-box-input js-new-comment-input']"),text);
    }
    public void verifyCardCommentNumber(String number)
    {	Log.info("Verify Card Comment Number");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='badge-text'][contains(text(),'"+number+"')]")));

    }
    public void clickSaveButton()
    {	Log.info("Clicking Save Button");
        clickElement(driver,By.xpath("//*[@class='primary confirm mod-submit-edit js-save-edit']"),20);

    }
    public void clickSaveButtonComments()
    {	Log.info("Clicking Save Button Comments");
        clickElement(driver,By.xpath("//*[@class='primary confirm mod-no-top-bottom-margin js-add-comment']"),20);

    }

    public void clickCloseIcon()
    {	Log.info("Clicking Close window");
        clickElement(driver,By.xpath("//*[@class='icon-lg icon-close dialog-close-button js-close-window']"),20);

    }
    public void verifyCardHasDescription()
    {	Log.info("Verify Card Description icon");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='badge-icon icon-sm icon-description']")));

    }
    public void verifyCardHasComments()
    {	Log.info("Verify Comments icon");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='badge-icon icon-sm icon-comment']")));

    }
    public void clearDescription()
    {	Log.info("Clear Description");
        clickElement(driver,By.xpath("//*[@class='button subtle hide-on-edit js-show-with-desc js-edit-desc']"),30);
        find(By.xpath("//*[@class='field field-autosave js-description-draft description card-description']")).clear();

    }
    public void clearComments()
    {	Log.info("Clear Comments");
        clickElement(driver,By.xpath("//*[@class='js-confirm-delete-action']"),30);
        clickElement(driver,By.xpath("//*[@class='js-confirm full negate']"),30);

    }
    public void verifyIconRemoved()
    {	Log.info("Verify icon removed");
        //BADGE IS ICON ONLY SINCE OTHER ICONS REMOVED
        driver.navigate().refresh();
        elementIsDisplayed(By.xpath("//*[@class='badge is-icon-only']"));
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='badge is-icon-only']")));

    }
    public void clickInviteIcon()
    {	Log.info("Click Invite icon");
        clickElement(driver,By.xpath("//*[@title='Invite To Board']"),30);
    }
    public void enterInviteeEmail(String text) throws InterruptedException {	Log.info("Enter Invitee Email");
        enterText(By.xpath("//*[@class='autocomplete-input']"),text);
        find(By.xpath("//*[@class='autocomplete-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void clickSendInviteButton()
    {	Log.info("Click Send Invite Button");
        clickElement(driver,By.xpath("//*[@class='autocomplete-btn primary'][contains(text(),'Send Invitation')]"),30);
    }
    public void verifyInviteeDisplays()
    {	Log.info("Verify Invitee Displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='member-initials'][@title='Gabriel Holmes (gabrielholmes1)']")));

    }
    public void clickInviteeDisplayed()
    {	Log.info("Click Invitee Displayed");
        clickElement(driver,By.xpath("//*[@class='member-initials'][@title='Gabriel Holmes (gabrielholmes1)']"),20);

    }
    public void clickRemoveFromBoard()
    {	Log.info("Click Remove From Board");
        clickElement(driver,By.xpath("//*[@class='js-remove-member']"),20);

    }
    public void clickRemoveMemberButton()
    {	Log.info("Click Remove Member Button");
        clickElement(driver,By.xpath("//*[@class='js-confirm full negate']"),20);

    }
    public void verifyMemberRemoved()
    {	Log.info("Click Remove Member Button");
        if(elementExists(By.xpath("//*[@class='member js-member member-virtual-invitee member-virtual ui-draggable']")))
        {
            fail();
        }
        else
            System.out.print("member removed");

    }








	}











	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
