package bg.notino.login;

import bg.notino.BaseTest;
import bg.notino.flow.LoginFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static bg.notino.utils.PopHelpers.acceptCookiesButton;

public class LoginTest extends BaseTest {

    private LoginFlow loginFlow = new LoginFlow(driver);

    @BeforeEach
    public void navigateToLogin() {
        driver.get("https://www.notino.bg/account/login");
        driver.manage().window().maximize();
        acceptCookiesButton(driver);
    }

        @Test
        public void testErrorEmptyPass() {
            loginFlow.setEmailAddressField("test@gmail.com");
            loginFlow.clickSubmitButton();
            Assertions.assertTrue(loginFlow.getErrorEmptyPass().isDisplayed());
            Assertions.assertEquals(loginFlow.getErrorEmptyPassText(), "Полето Парола е задължително.");
        }

        @Test
        public void testErrorWrongEmailOrPass() {
            loginFlow.setEmailAddressField("test@gmail.com");
            loginFlow.setPasswordField("dtg");
            loginFlow.clickSubmitButton();
            Assertions.assertTrue(loginFlow.getErrorWrongPassOrEmail().isDisplayed());
            Assertions.assertEquals(loginFlow.getErrorWrongPassOrEmailText(), "Невалиден вход – неправилен имейл или парола.");
    }
    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }

    }



