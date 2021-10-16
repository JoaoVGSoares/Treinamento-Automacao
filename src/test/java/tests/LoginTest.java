package tests;

import org.junit.Test;
import pageObjects.*;

import static org.junit.Assert.assertTrue;

//@Description("Dado que já tenho cadastro e acesso a página de login quando preencho meus dados de acesso " +
//      "e clico em Sign In então entrarei na minha conta")
public class LoginTest extends BaseTests {
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
