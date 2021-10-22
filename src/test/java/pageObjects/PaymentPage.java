package pageObjects;

import elementMapper.PaymentPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.TestsInfo;

public class PaymentPage extends PaymentPageElementMapper {
    public PaymentPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    public void paymentMethod() {
        if (TestsInfo.modoDePagamento().equalsIgnoreCase("bank wire")) {
            bankWire.click();
        }
        if (TestsInfo.modoDePagamento().equalsIgnoreCase("check")) {
            check.click();

        }
    }
}