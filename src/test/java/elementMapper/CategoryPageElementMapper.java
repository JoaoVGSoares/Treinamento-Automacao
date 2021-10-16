package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {

@FindBy(css = "#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link > img")
    public WebElement firstProduct;

@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
public WebElement proceedToCheckout;
}
