package page;
import org.openqa.selenium.WebDriver;
import utils.TestConfiguration;

public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

}
