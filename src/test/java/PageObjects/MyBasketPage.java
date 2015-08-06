package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by gauge on 6/8/15.
 */
public class MyBasketPage extends BasePage {

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/div/table/tfoot/tr[4]/td[2]")
    private WebElement totalAmount;

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[1]/div/p[3]/a[2]")
    private WebElement checkMyBag;

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/div/table/tbody/tr/td[2]")
    private WebElement item1;

    public void checkTotal(String price) {
        Assert.assertEquals(price, totalAmount.getText());
    }

    public void checkout() {
        checkMyBag.click();
    }

    public void checkProductExists(String item) {
        Assert.assertTrue(item1.getText().contains(item));
    }
}
