package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPageElementMapper {

    @FindBy(css = "#center_column > h1")
    public WebElement centerColumn;

    @FindBy(css = "#cart_navigation > button > span")
    public WebElement confirmBtn;

    @FindBy(css = "#center_column > p.alert.alert-success")
    public WebElement centerColumnAlert;

    @FindBy(css = "#center_column > div > p")
    public WebElement centerColumnStrong;

    @FindBy(css = "#center_column > div")
    public WebElement box;
}
