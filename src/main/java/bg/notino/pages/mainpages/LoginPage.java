package bg.notino.pages.mainpages;

import bg.notino.pages.AbstractPage;
import bg.notino.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private static final By EMAIL_ADDRESS_FIELD = By.id("Email");
    private static final By PASSWORD_FIELD = By.id("Password");
    private static final By SUBMIT_BUTTON = By.name("button");
    private static final By ERROR_WRONG_PASS_OR_EMAIL = By.xpath("//*[@id=\"login\"]/div/fieldset/form/fieldset/p[5]/span");
    private static final By ERROR_EMPTY_PASS = By.xpath("//*[@id=\"login\"]/div/fieldset/form/fieldset/p[4]/span");
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public static WebElement getEmailField(){ return driver.findElement(EMAIL_ADDRESS_FIELD);}
    public static WebElement getPasswordField(){
        return driver.findElement(PASSWORD_FIELD);
    }

    public static WebElement getSubmitButton(){
        return WaitersManager.waitUntilElementIsClickable(driver, SUBMIT_BUTTON);
    }

    public static WebElement getErrorWrongPassOrEmail(){
        return driver.findElement(ERROR_WRONG_PASS_OR_EMAIL);
    }

    public static WebElement getErrorEmptyPass(){
        return driver.findElement(ERROR_EMPTY_PASS);
    }


}
