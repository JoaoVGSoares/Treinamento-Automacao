package pageObjects;

import elementMapper.ShippingPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingPage extends ShippingPageElementMapper {
    public ShippingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void agreeToTermsOfService(){
        termsOfService.click();
        System.out.println("Concordou com os termos de serviço.");
    }

    public void proceedToCheckout(){
        checkout.click();
        System.out.println("Clicou em proceder");
    }
    public String getPageHeading(){
        return pageHeading.getText();
    }

}
