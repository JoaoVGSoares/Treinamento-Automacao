package pageObjects;

import elementMapper.OrderConfirmationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderConfirmationPage extends OrderConfirmationPageElementMapper {
    public OrderConfirmationPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getBoxText() {
        return box.getText();
    }

    public void clickConfirmOrder() {
        confirmBtn.click();
    }

    public boolean isOrderCompleted() {
        return getBoxText().contains("Your order on My Store is complete.");
    }
}
