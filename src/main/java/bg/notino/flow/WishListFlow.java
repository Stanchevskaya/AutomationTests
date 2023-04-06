package bg.notino.flow;

import bg.notino.flow.commonflow.BaseFlow;
import bg.notino.pages.mainpages.WishListPage;
import org.openqa.selenium.WebDriver;

public class WishListFlow extends BaseFlow {
    private WishListPage wishListPage;

    public WishListFlow(WebDriver driver) {

        super(driver);
        wishListPage = new WishListPage(driver);
    }

    public WishListPage getWishListPage() {
        return wishListPage;
    }

    public String getHeaderText(){
        return wishListPage.getPageHeader().getText();
    }
}
