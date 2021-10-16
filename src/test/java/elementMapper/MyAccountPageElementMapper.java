package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPageElementMapper {

    @FindBy(css = "#center_column > h1")
    public WebElement centerColumn;

}
