import PageObjects.HomePage;
import PageObjects.MyBasketPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by gauge on 6/8/15.
 */
public class Shoppe {
    @Step("Navigate to shoppe homepage")
    public void navigateToHomePage() {
        DriverFactory.driver.get(HomePage.Url);
    }

    @Step("Add item <Yealink T20P> to my basket")
    public void addItemToBasket(String item) {
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.addItem(item);
    }

    @Step("Check if my basket has item <item>")
    public void checkBasket(String item) {
        navigateToHomePage();
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.viewMyBag();
        MyBasketPage myBasketPage = PageFactory.initElements(DriverFactory.driver, MyBasketPage.class);
        myBasketPage.checkProductExists(item);
    }

    @Step("Check if total price is <$75.59>")
    public void checkTotalPrice(String price) {
        MyBasketPage myBasketPage = PageFactory.initElements(DriverFactory.driver, MyBasketPage.class);
        myBasketPage.checkTotal(price);
    }
}
