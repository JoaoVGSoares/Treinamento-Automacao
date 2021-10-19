package pageObjects;

import elementMapper.AddressPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddressPage extends AddressPageElementMapper {
    public AddressPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void proceedToCheckout() {
        checkout.click();
    }
}
