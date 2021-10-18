package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPageElementMapper {

    @FindBy(css = "#cart_navigation > button > span")
    public WebElement confirmBtn;

    @FindBy(css = "#center_column > div")
    public WebElement box;
}
