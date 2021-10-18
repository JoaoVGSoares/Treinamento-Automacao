package pageObjects;

import elementMapper.PaymentPageElementMapper;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.TestsInfo;

public class PaymentPage extends PaymentPageElementMapper {
    public PaymentPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }

    public void paymentMethod(){
        if (TestsInfo.modoDePagamento().equalsIgnoreCase("bank wire")){
            bankWire.click();
            System.out.println("Selecionou o pagamento por "+ TestsInfo.modoDePagamento());

        }
        if (TestsInfo.modoDePagamento().equalsIgnoreCase("check")){
            check.click();
            System.out.println("Selecionou o pagamento por "+ TestsInfo.modoDePagamento());

        }
    }
    public String getCartQtdText(){
        return cartQtd.getText();
    }
    public String getCartItem(){
        return cartItem1.getText();
    }
    public boolean isCartQtd(){
        return getCartQtdText().equals(TestsInfo.quantidade());
    }

    public boolean isCartItem(){
        return getCartItem().equalsIgnoreCase(new ProductPage().getCenterColumnTxt());
    }
}