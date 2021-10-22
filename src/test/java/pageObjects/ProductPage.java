package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.TestsInfo;

public class ProductPage extends ProductPageElementMapper {
    public ProductPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public void clickProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }

    public void setQuantity() {
        quantityWanted.clear();
        quantityWanted.sendKeys(TestsInfo.quantidade());
    }

    public void setSize() {
        chooseSize.click();
        chooseSize.sendKeys(TestsInfo.size());


    }

    public void setColor() {
        if (TestsInfo.color().equalsIgnoreCase("beige")) {
            colorBeige.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("white")) {
            colorWhite.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("black")) {
            colorBlack.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("orange")) {
            colorOrange.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("blue")) {
            colorBlue.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("green")) {
            colorGreen.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("yellow")) {
            colorYellow.click();
        }
        if (TestsInfo.color().equalsIgnoreCase("pink")) {
            colorPink.click();
        }
    }
}