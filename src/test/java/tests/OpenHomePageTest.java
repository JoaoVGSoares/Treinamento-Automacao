package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import pageObjects.HomePage;

import static org.junit.Assert.assertTrue;

public class OpenHomePageTest extends BaseTests{
    @Description("Dado que insiro o endereço do site 'Automationpractice.com' no Google Chrome " +
            "Quando pressiono a tecla enter " +
            "Então acessarei a página 'Home'")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void openHomePageTest(){

        //Iniciar a página
        HomePage home = new HomePage();

        //Validar Home
        assertTrue(home.isHomePage());




    }
}
