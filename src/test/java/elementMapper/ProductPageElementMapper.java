package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {

    @FindBy(css = "button.exclusive")
    public WebElement addToCart;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
    public WebElement proceedToCheckoutBtn;

    @FindBy(css = "#quantity_wanted")
    public WebElement quantityWanted;

    @FindBy(css = "#color_7")
    public WebElement colorBeige;

    @FindBy(css = "#color_8")
    public WebElement colorWhite;

    @FindBy(css = "#color_11")
    public WebElement colorBlack;

    @FindBy(css = "#color_13")
    public WebElement colorOrange;

    @FindBy(css = "#color_14")
    public WebElement colorBlue;

    @FindBy(css = "#color_15")
    public WebElement colorGreen;

    @FindBy(css = "#color_16")
    public WebElement colorYellow;

    @FindBy(css = "#color_24")
    public WebElement colorPink;

    @FindBy(css = "#group_1")
    public WebElement chooseSize;


}
