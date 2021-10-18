package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import pageObjects.*;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTests {
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void loginTest() {

        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage account = new MyAccountPage();

        //Acessar a página de login
        home.clickBtnLogin();

        //Preencher email e senha
        login.fillEmail();

        login.fillPasswd();

        login.clickBtnSubmitLogin();

        //Validar acesso
       assertTrue(account.isMyAccountPage());


    }
}
