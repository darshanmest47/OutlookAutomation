import POM.OutlookWelcomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
    OutlookWelcomePage outlookWelcomePage;

    @BeforeClass
    public void beforeClass() {
     outlookWelcomePage = OutlookWelcomePage.getInstance(driver);
    }

    @Test(priority = 0)
    public void openBrowserAndClickSignIn() {
    outlookWelcomePage.clickSignInIcon();
    }
}
