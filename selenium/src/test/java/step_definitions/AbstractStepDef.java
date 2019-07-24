package step_definitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by gabrielholmes on 3/6/16.
 */
public class AbstractStepDef {
    protected static WebDriver driver;

    public AbstractStepDef() {
    }

    public WebDriver getDriver() {
        if (driver == null)

        {
        driver=new ChromeDriver();
        }
        return getDriver();
    }

}
