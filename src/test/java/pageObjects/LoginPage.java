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
        System.out.println("Preencheu email");
    }

    public void fillPasswd() {
        passwd.sendKeys("#12345");
        System.out.println("Preencheu a senha");

    }

    public void clickBtnSubmitLogin() {
        SubmitLogin.click();
        System.out.println("Clicou em Sing in");
    }

    public void createAccount() {
        createAccountEmail.sendKeys(TestsInfo.emailAccount());
        System.out.println("Preencheu o email");
        createAccountBtn.click();
        System.out.println("Clicou em create account");
    }
}
