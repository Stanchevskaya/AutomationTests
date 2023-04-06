package bg.notino.pages.mainpages;

import bg.notino.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage extends AbstractPage {
    private static final By PAGE_HEADER = By.xpath("//h1");

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageHeader(){
        return driver.findElement(PAGE_HEADER);
    }
}
