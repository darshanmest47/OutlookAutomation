package POM;

import com.Utils.ActionsClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutlookWelcomePage {


    private static OutlookWelcomePage outlookWelcomePage = null;
    private static WebDriver driver = null;
    private static ActionsClass actionsClass;

    private OutlookWelcomePage(WebDriver driver) {
        this.driver = driver;
        actionsClass = ActionsClass.getInstance(driver);
    }


    public static OutlookWelcomePage getInstance(WebDriver driver) {
        if (outlookWelcomePage == null) {
            outlookWelcomePage = new OutlookWelcomePage(driver);
            return outlookWelcomePage;
        } else {
            return outlookWelcomePage;
        }
    }

    @FindBy(id = "mectrl_headerPicture")
    private WebElement signInIcon;


    public void clickSignInIcon() {
        actionsClass.moveToElementAndClick(signInIcon);
    }
}





