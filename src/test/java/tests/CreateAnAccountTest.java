package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import pageObjects.CreateAnAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

import static org.junit.Assert.assertTrue;

public class CreateAnAccountTest extends BaseTests {
    @Description("Dado que preencho os dados obrigatórios para criar uma conta " +
            "Quando clico no botão 'Register' " +
            "Então acessarei a página 'My Account'")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void createAnAccountTest() {
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CreateAnAccountPage create = new CreateAnAccountPage();
        MyAccountPage account = new MyAccountPage();


        //Acessar a página de login
        home.clickBtnLogin();

        //Acessar a página para criar conta
        login.createAccount();

        //Preencher o formulário
        create.create();

        //Validar acesso a página My Account
        assertTrue(account.isMyAccountPage());


    }
}
