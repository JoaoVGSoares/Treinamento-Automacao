package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class BuyProductFromSearchFlow extends BaseTests {

    @Test
    public void testEnterProductPageAndAddToCart() {
        String quest = Utils.getSearchObject();

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

        //Acessar o produto
        search.chooseSearchResult();

        //Validar página do produto

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getSearchObject()));

        //Adicionar ao carrinho

        productPage.setQuantity();
        productPage.setSize();
        productPage.setColor();
        productPage.clickAddToCart();
        productPage.clickProceedToCheckoutBtn();

        //Validar página do carrinho
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("controller=order"));

        //Prosseguir
        cart.proceedToCheckout();

        //Fazer login

        login.fillEmail();

        login.fillPasswd();

        login.clickBtnSubmitLogin();

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
