package pageObjects;

import elementMapper.CreateAnAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.TestsInfo;

public class CreateAnAccountPage extends CreateAnAccountPageElementMapper {
    public CreateAnAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    public void create() {
        if (TestsInfo.gender().equalsIgnoreCase("Mrs")) {
            gender2.click();
            } else {
                gender1.click();
            }
            customerFirstName.sendKeys(TestsInfo.customerFirstName());
            customerLastName.sendKeys(TestsInfo.customerLastName());
            password.sendKeys(TestsInfo.password());
            days.sendKeys(TestsInfo.days());
            months.sendKeys(TestsInfo.months());
            years.sendKeys(TestsInfo.years());
            company.sendKeys(TestsInfo.company());
            address1.sendKeys(TestsInfo.address1());
            address2.sendKeys(TestsInfo.address2());
            city.sendKeys(TestsInfo.city());
            state.sendKeys(TestsInfo.state());
            postCode.sendKeys(TestsInfo.postCode());
            country.sendKeys(TestsInfo.country());
            phone.sendKeys(TestsInfo.phone());
            alias.clear();
            alias.sendKeys(TestsInfo.alias());
            submitBtn.click();

        }
    }

