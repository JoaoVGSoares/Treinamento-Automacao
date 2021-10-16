package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageElementMapper {
    @FindBy(css = "#center_column > form > p > button > span")
    public WebElement checkout;

    @FindBy(className = "page-heading")
    public WebElement pageHeading;


}
