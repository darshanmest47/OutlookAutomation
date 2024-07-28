package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ActionsClass {
    /*Actions class utility which contains different actions*/
    private static WebDriver driver;
    private static ActionsClass actionsclass = null;
    private Actions actions;


    private ActionsClass(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public static ActionsClass getInstance(WebDriver driver) {
        if (actionsclass == null) {
            actionsclass = new ActionsClass(driver);
            return actionsclass;
        } else {
            return actionsclass;
        }
    }


    public void moveToElementAndClick(WebElement element) {
        Waits.webDriverWait(driver).until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element).click();
    }

    public void sendKeys(WebElement element, String value) {
        Waits.webDriverWait(driver).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
}
