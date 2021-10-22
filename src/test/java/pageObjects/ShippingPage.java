package pageObjects;

import elementMapper.ShippingPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingPage extends ShippingPageElementMapper {
    public ShippingPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void agreeToTermsOfService() {
        termsOfService.click();
    }

    public void proceedToCheckout() {
        checkout.click();
    }
}
