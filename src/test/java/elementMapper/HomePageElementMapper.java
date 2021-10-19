package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(className = "login")
    public WebElement login;

    public WebElement search_query_top;

    @FindBy(css = "button.btn.btn-default.button-search")
    public WebElement submit_search;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    public WebElement womenCategory;

    @FindBy(id = "homepage-slider")
    public WebElement homePageSlider;
}
