package pageObjects;

import elementMapper.PaymentPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

public class PaymentPage extends PaymentPageElementMapper {
    public PaymentPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }

    public void paymentMethod(String option){
        if (option.equalsIgnoreCase("bank wire")){
            bankWire.click();
            System.out.println("Selecionou o pagamento por "+ Utils.modoDePagamento());

        }
        if (option.equalsIgnoreCase("check")){
            check.click();
            System.out.println("Selecionou o pagamento por "+ Utils.modoDePagamento());

        }
    }
}