/*package tests;

import elementMapper.ProductPageElementMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.*;
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
    public void testSearch() {
        String quest = "DRESS";
        String questResultQtd = "7";
        //Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Fazer a pesquisa
        home.doSearch(quest);

        //Validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHead_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Test
    public void testEnterProductPageAndAddToCart() {
        String quest = Utils.getSearchObject();
        String questResultQtd = "1";
        //Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();
        ProductPage productPage = new ProductPage();
        ShoppingCartPage cart = new ShoppingCartPage();
        LoginPage login = new LoginPage();
        AddressPage addressPage = new AddressPage();
        ShippingPage shipping = new ShippingPage();
        PaymentPage payment = new PaymentPage();

        //Fazer a pesquisa
        home.doSearch(quest);

        //Validar a pesquisa

        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        //assertThat(search.getTextHead_counter(), CoreMatchers.containsString(questResultQtd));

        //Acessar o produto
        search.clickProductLink();

        //Validar página do produto

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getSearchObject()));

        //Adicionar ao carrinho

        productPage.setQuantity();
        productPage.setColor();
        productPage.clickAddToCart();
        productPage.clickProceedToCheckoutBtn();

        //Validar página do carrinho
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("controller=order"));

        //Prosseguir
        cart.proceedToCheckout();

        //Fazer login

        login.fillEmail();
        System.out.println("Preencheu email");

        login.fillPasswd();
        System.out.println("Preencheu a senha");

        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sing in");

        //Validar página de endereço
        assertThat(addressPage.getPageHeading(), CoreMatchers.containsString("ADDRESSES"));

        //Prosseguir
        addressPage.proceedToCheckout();

        //Validar página de envio
        assertThat(shipping.getPageHeading(), CoreMatchers.containsString("SHIPPING"));

        //Prosseguir para próxima página
        shipping.agreeToTermsOfService();
        shipping.proceedToCheckout();

        //Validar página de pagamento
        assertThat(payment.getPageHeading(), CoreMatchers.containsString("PLEASE CHOOSE YOUR PAYMENT METHOD"));

        //Prosseguir com a compra

        payment.paymentMethod(Utils.modoDePagamento());








    }
}

        /*Limpar o carrinho
        cart.delete();

        //Validar produto no carrinho


        //assertTrue(productPage.wasItemAddedToCart());


        //assertTrue(productPage.checkoutBtn().isDisplayed());
        // assertTrue(Browser.getCurrentDriver().findElement(By.id("layer_cart")).isDisplayed());


        //assertTrue(Browser.getCurrentDriver().findElement(By.id("layer_cart")).getText().contains("Product successfully added to your shopping cart\n"));

        //  assertTrue(productPage.getLayerCartText().equals("Product successfully added to your shopping cart\n"));


    }

}*/
