import PageObjects.*;
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

    @Step("Checkout items in basket")
    public void checkoutAllItems() {
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.checkout();
    }

    @Step("Accept the default address")
    public void acceptDefaultAddress() {
        CheckOutPage checkOutPage = PageFactory.initElements(DriverFactory.driver, CheckOutPage.class);
        checkOutPage.makePayment();
    }


    @Step("Make payment with card number <68628348> and security code <789>")
    public void makePayment(String cardNumber, String code) {
        PaymentPage paymentPage = PageFactory.initElements(DriverFactory.driver, PaymentPage.class);
        paymentPage.enterDetails(cardNumber, code);
        paymentPage.reviewOrder();
    }

    @Step("Confirm order submission")
    public void confirmOrder() {
        ConfirmationPage confirmationPage = PageFactory.initElements(DriverFactory.driver, ConfirmationPage.class);
        confirmationPage.reviewOrder();
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.checkIfOrderIsPlaced();
    }
}
