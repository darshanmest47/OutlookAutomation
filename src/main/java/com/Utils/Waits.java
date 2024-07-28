package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    private Waits() {
    }

    public static WebDriverWait webDriverWait(WebDriver driver) {
        return new WebDriverWait(driver, 30);
    }

}
