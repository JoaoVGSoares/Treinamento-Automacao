package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.TestsInfo;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail() {
        email.sendKeys("joao.v.g.soares@gmail.com");
    }

    public void fillPasswd() {
        passwd.sendKeys("#12345");
    }

    public void clickBtnSubmitLogin() {
        SubmitLogin.click();
    }

    public void createAccount() {
        createAccountEmail.sendKeys(TestsInfo.emailAccount());
        createAccountBtn.click();
    }
}
