package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

public class ProductPage extends ProductPageElementMapper {
    public ProductPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getCenterColumnTxt(){
        return centerColumnTxt.getText();
    }

    public void clickAddToCart() {
        addToCart.click();
        System.out.println("Clicou em adicionar ao carrinho");
    }

    public void clickProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
        System.out.println("Clicou em ir pro checkout");
    }

    public void setQuantity() {
        quantityWanted.clear();
        quantityWanted.sendKeys(Utils.quantidade());
        System.out.println("Escolheu a quantidade " + Utils.quantidade());
    }

    public void setSize() {
        chooseSize.click();
        chooseSize.sendKeys(Utils.size());
        System.out.println("Escolheu o tamanho " + Utils.size());


    }

    public void setColor() {
        if (Utils.color().equalsIgnoreCase("beige")) {
            colorBeige.click();
        }
        if (Utils.color().equalsIgnoreCase("white")) {
            colorWhite.click();
        }
        if (Utils.color().equalsIgnoreCase("black")) {
            colorBlack.click();
        }
        if (Utils.color().equalsIgnoreCase("orange")) {
            colorOrange.click();
        }
        if (Utils.color().equalsIgnoreCase("blue")) {
            colorBlue.click();
        }
        if (Utils.color().equalsIgnoreCase("green")) {
            colorGreen.click();
        }
        if (Utils.color().equalsIgnoreCase("yellow")) {
            colorYellow.click();
        }
        if (Utils.color().equalsIgnoreCase("pink")) {
            colorPink.click();
        }
        System.out.println("Escolheu a cor " + Utils.color().toLowerCase());
    }
}