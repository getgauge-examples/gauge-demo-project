package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by gauge on 6/8/15.
 */
public class CheckOutPage extends BasePage{

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/div/form/p/input")
    private WebElement makePayment;


    public void makePayment() {
        makePayment.click();
    }
}
