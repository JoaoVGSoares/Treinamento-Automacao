package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageElementMapper {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
    public WebElement bankWire;

    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
    public WebElement check;

    @FindBy(css =" td.cart_quantity.text-center > span")
    public WebElement cartQtd;

    @FindBy(css =" td.cart_description > p")
    public WebElement cartItem1;
}
