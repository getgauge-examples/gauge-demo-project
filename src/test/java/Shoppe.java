import PageObjects.HomePage;
import com.thoughtworks.gauge.Step;

/**
 * Created by gauge on 6/8/15.
 */
public class Shoppe {
    @Step("Navigate to shoppe homepage")
    public void navigateToHomePage() {
        DriverFactory.driver.get(HomePage.Url);
    }
}
