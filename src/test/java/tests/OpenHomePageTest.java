package tests;

import org.junit.Test;
import pageObjects.HomePage;

import static org.junit.Assert.assertTrue;

public class OpenHomePageTest extends BaseTests{
    @Test
    public void openHomePageTest(){

        //Iniciar a página
        HomePage home = new HomePage();

        //Validar Home
        assertTrue(home.isHomePage());




    }
}
