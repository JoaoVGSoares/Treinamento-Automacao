package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageElementMapper {
    @FindBy(css = "#cgv")
    public WebElement termsOfService;

    @FindBy(css = "#form > p > button > span")
    public WebElement checkout;

}
