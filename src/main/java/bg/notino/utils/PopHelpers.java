package bg.notino.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PopHelpers {

    private static final By ACCEPT_COOKIES_BUTTON = By.xpath("//*[@id=\"exponea-cookie-compliance\"]/div/p/a/span");

    private PopHelpers() {
    }

    public static void acceptCookiesButton(WebDriver driver) {
        try {
            driver.findElement(ACCEPT_COOKIES_BUTTON).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop up is not displayed");
        }
    }
}
