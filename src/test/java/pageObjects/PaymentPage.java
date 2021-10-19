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
            System.out.println("Selecionou o pagamento por " + TestsInfo.modoDePagamento());

        }
        if (TestsInfo.modoDePagamento().equalsIgnoreCase("check")) {
            check.click();
            System.out.println("Selecionou o pagamento por " + TestsInfo.modoDePagamento());

        }
    }
}