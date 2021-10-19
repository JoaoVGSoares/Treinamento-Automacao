package pageObjects;

import elementMapper.ShoppingCartPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShoppingCartPage extends ShoppingCartPageElementMapper {
    public ShoppingCartPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void proceedToCheckout() {
        checkout.click();
    }
}
