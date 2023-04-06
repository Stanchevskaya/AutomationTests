package bg.notino.navigation;

import bg.notino.BaseTest;
import bg.notino.flow.LoginFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static bg.notino.utils.PopHelpers.acceptCookiesButton;

public class NavigationTest extends BaseTest {

        private LoginFlow loginFlow = new LoginFlow(driver);

        @BeforeEach
        public void navigateToLogin() {
            driver.get("https://www.notino.bg/account/login");
            driver.manage().window().maximize();
            acceptCookiesButton(driver);
        }

    @Test
    public void testNavigateToPromotions() {
        loginFlow.getMainMenuFlow().navigateToPromotions();
        String expected = "Евтини парфюми с големи отстъпки | Notino";
        Assertions.assertEquals(expected, driver.getTitle());

    }

    @Test
    public void testNavigateToMakeUp() {
            loginFlow.getMainMenuFlow().navigateToLogo();
            String expected = "https://www.notino.bg/";
            Assertions.assertEquals(expected, driver.getCurrentUrl());
    }

    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }
}
