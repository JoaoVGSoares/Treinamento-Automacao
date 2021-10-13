package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests {
    @Test
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL!");
    }
        @Test
    public void testLogin(){
        Browser.getCurrentDriver().findElement(By.className("login")).click();
            System.out.println("Click em Sign in e direcionou para a pagina de login");
            assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
            Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("joao.v.g.soares@gmail.com");
            System.out.println("Preencheu email");
            Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("#12345");
            System.out.println("Preencheu a senha");
            Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
            System.out.println("Clicou em Sing in");
            assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
            System.out.println("Validou a URL de minha conta");
            assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
            System.out.println("Validou Minha Conta no site");
        }
}
