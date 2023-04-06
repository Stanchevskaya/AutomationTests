package bg.notino.flow.commonflow;

import bg.notino.pages.fragments.MainMenu;
import org.openqa.selenium.WebDriver;

public class MainMenuFlow {

    private MainMenu mainMenu;

    public MainMenuFlow(WebDriver driver) {
        mainMenu = new MainMenu(driver);
    }

    public MainMenu getMainMenu() {

        return mainMenu;
    }

    public void navigateToPromotions() { mainMenu.getPromotions().click();
    }

    public void navigateToLogo() {mainMenu.getLogo().click();
    }
}
