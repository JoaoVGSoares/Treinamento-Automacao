package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

import static utils.Browser.driver;

public class CategoryPage extends CategoryPageElementMapper {
    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void chooseFirstProduct(){
        Actions actions = new Actions(driver);
        WebElement target = Browser.getCurrentDriver().findElement
                (By.cssSelector(String.format("#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link > img")));
        actions.moveToElement(target).perform();
        Browser.getCurrentDriver().findElement
                (By.cssSelector("#center_column > ul > li:nth-child(1) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
        System.out.println("Escolheu o primeiro produto");
    }
    public void clickProceedToCheckout(){
        proceedToCheckout.click();
        System.out.println("Clicou para prosseguir");
    }
}
