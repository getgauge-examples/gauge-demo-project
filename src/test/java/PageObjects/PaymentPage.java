package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by gauge on 6/8/15.
 */
public class PaymentPage {

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/div/form/p/input")
    private WebElement reviewOrder;

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/div/form/fieldset/dl[1]/dd/input")
    private WebElement cardNumber;

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/div/form/fieldset/dl[3]/dd/input")
    private WebElement securityCode;

    public void reviewOrder() {
        reviewOrder.click();
    }

    public void enterDetails(String number, String code) {
        cardNumber.sendKeys(number);
        securityCode.sendKeys(code);
    }
}
