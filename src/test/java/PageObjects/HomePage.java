package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public static String Url = URL;

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[2]/ul/li[1]/p[2]/a[2]")
    private WebElement yealink_T20P;

    @FindBy(how = How.XPATH, xpath = "/html/body/section/div/section[1]/div/p[3]/a[1]")
    private WebElement viewBag;

    public void addItem(String item) {
        if (item.equals("Yealink T20P")){
            yealink_T20P.click();
        }
    }
    public void viewMyBag() {
        viewBag.click();
    }
}
