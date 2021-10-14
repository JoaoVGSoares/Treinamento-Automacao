package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTest extends BaseTests {
    @Test
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL!");
    }

    @Test
    public void testLogin() {
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("Click em Sign in e direcionou para a pagina de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu email");

        login.fillPasswd();
        System.out.println("Preencheu a senha");

        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sing in");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));

        System.out.println("Validou a URL de minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no site");


        //  Browser.getCurrentDriver().findElement(By.className("login")).click();
        //  System.out.println("Clicou em Sign in e direcionou para a página de login");
        //  assertTrue(Browser.getCurrentDriver().getCurrentUrl()
        //          .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        //  Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("joao.v.g.soares@gmail.com");
        //  System.out.println("Preencheu email");
        //  Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("#12345");
        //  System.out.println("Preencheu a senha");
        //  Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        //  System.out.println("Clicou em Sing in");
        //  assertTrue(Browser.getCurrentDriver().getCurrentUrl()
        //  .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        //  System.out.println("Validou a URL de minha conta");
        //  assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        //  System.out.println("Validou Minha Conta no site");
    }
    @Test
    public void testSearch(){
        String quest = "DRESS";
        String questResultQtd = "7";
        //Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Fazer a pesquisa
        home.doSearch(quest);

        //Validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""),quest);
        assertThat(search.getTextHead_counter(), CoreMatchers.containsString(questResultQtd));
    }
}
