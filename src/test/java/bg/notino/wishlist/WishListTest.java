package bg.notino.wishlist;

import bg.notino.BaseTest;
import bg.notino.flow.WishListFlow;
import org.junit.jupiter.api.*;

import static bg.notino.utils.PopHelpers.acceptCookiesButton;

public class WishListTest extends BaseTest {

    private WishListFlow wishListFlow = new WishListFlow(driver);

     @BeforeEach
    public void navigateToWishList(){
         driver.get("https://www.notino.bg/wishlist/");
         driver.manage().window().maximize();
         acceptCookiesButton(driver);
     }

     @Test
    public void testWishListHeader(){
         String expected = "Засега нямате любими продукти";
         Assertions.assertEquals(expected, wishListFlow.getHeaderText());
     }

     @AfterEach
     public void clean() {
         driver.manage().deleteAllCookies();
     }
}
