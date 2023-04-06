package bg.notino.pages.fragments;

import bg.notino.pages.AbstractPage;
import bg.notino.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu extends AbstractPage {
    private static final By PROMOTIONS = By.xpath("/html/body/nav/div[1]/div[2]/div[2]/div/a/div");
    private static final By LOGO = By.xpath("//*[@id=\"pageHeader\"]/div[2]/div[2]");

    public MainMenu(WebDriver driver) {
        super(driver);
    }
    public WebElement getPromotions() {
        return driver.findElement(PROMOTIONS);
    }

    public WebElement getLogo(){
        return WaitersManager.waitUntilElementIsClickable (driver, LOGO);
    }

}
