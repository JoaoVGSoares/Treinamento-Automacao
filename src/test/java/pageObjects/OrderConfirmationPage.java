package pageObjects;

import elementMapper.OrderConfirmationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderConfirmationPage extends OrderConfirmationPageElementMapper {
    public OrderConfirmationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public String getCenterColumnText(){
        return centerColumn.getText();
    }
    public String getCenterColumnAlert(){
        return centerColumnAlert.getText();
    }
    public String getCenterColumnStrongText(){
        return centerColumnStrong.getText();
    }
    public String getBoxText(){
        return box.getText();
    }

    public boolean isOrderConfirmationPage(){
        return (getCenterColumnText().equalsIgnoreCase("ORDER CONFIRMATION"));
    }
    public void clickConfirmOrder(){
        confirmBtn.click();
    }

    public boolean isOrderCompleted(){
       return  getBoxText().contains("Your order on My Store is complete.");
    }
}
