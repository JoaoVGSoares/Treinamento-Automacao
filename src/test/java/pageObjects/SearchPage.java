package pageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.TestsInfo;

import static utils.Browser.driver;

public class SearchPage extends SearchPageElementMapper {

    public SearchPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickProductLink() {
        product_link.click();
        System.out.println("Acessou a página do produto " + TestsInfo.getSearchObject());
    }

    public String getTextNavigation_page() {
        return navigation_page.getText();
    }

    public String getTextLighter() {
        return lighter.getText();
    }

    public String getTextHead_counter() {
        return heading_counter.getText();
    }

    public boolean isSearchPage() {
        return getTextNavigation_page().equals("Search");
    }


    public void chooseSearchResult(){

        Actions actions = new Actions(driver);
        WebElement target = Browser.getCurrentDriver().findElement
                (By.cssSelector(String.format(".ajax_block_product:nth-child("+TestsInfo.searchResult()+") .replace-2x")));
        actions.moveToElement(target).perform();
        Browser.getCurrentDriver().findElement
                (By.cssSelector(String.format(".ajax_block_product:nth-child("+TestsInfo.searchResult()+") .button:nth-child(2) > span"))).click();
    }
}
