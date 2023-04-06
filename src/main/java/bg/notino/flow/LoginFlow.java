package bg.notino.flow;

import bg.notino.flow.commonflow.BaseFlow;
import bg.notino.pages.mainpages.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.RenderedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFlow extends BaseFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setEmailAddressField (String emailAddressField){
        LoginPage.getEmailField().sendKeys(emailAddressField);
    }

    public void setPasswordField(String passwordField){
        LoginPage.getPasswordField()
                .sendKeys(passwordField);
    }

    public void clickEmailAddressField (String emailAddressField) {
        LoginPage.getEmailField();LoginPage.getEmailField().click();
    }

    public void clickSubmitButton(){LoginPage.getSubmitButton().click();
    }

    public String getErrorEmptyPassText() {
        return LoginPage.getErrorEmptyPass().getText();
    }

    public static WebElement getErrorEmptyPass(){return LoginPage.getErrorEmptyPass();
    }

    public String getErrorWrongPassOrEmailText() {
        return LoginPage.getErrorWrongPassOrEmail().getText();
    }
    public static WebElement getErrorWrongPassOrEmail() {return LoginPage.getErrorWrongPassOrEmail();
    }
}