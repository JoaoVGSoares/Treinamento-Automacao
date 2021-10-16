package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {
    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String getCenterColumnText(){
        return centerColumn.getText();
    }

    public boolean isMyAccountPage(){
        return getCenterColumnText().equalsIgnoreCase("MY ACCOUNT");
    }


}
