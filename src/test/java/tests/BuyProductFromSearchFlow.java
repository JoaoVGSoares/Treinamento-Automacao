package tests;

import org.junit.Test;
import pageObjects.*;
import utils.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        OrderConfirmationPage orderConfirmation = new OrderConfirmationPage();

        //Fazer a pesquisa
        home.doSearch(quest);

        //Acessar o produto
        search.chooseSearchResult();

        //Adicionar ao carrinho
        String product = productPage.getCenterColumnTxt();
        productPage.setQuantity();
        productPage.setSize();
        productPage.setColor();
        productPage.clickAddToCart();
        productPage.clickProceedToCheckoutBtn();

        //Prosseguir
        cart.proceedToCheckout();

        //Fazer login
        login.fillEmail();
        login.fillPasswd();
        login.clickBtnSubmitLogin();

        //Prosseguir
        addressPage.proceedToCheckout();

        //Prosseguir para próxima página
        shipping.agreeToTermsOfService();
        shipping.proceedToCheckout();

        //Validar itens
        assertTrue(payment.isCartQtd());
        assertEquals(payment.getCartItem(),product);


        //Prosseguir com a compra

        payment.paymentMethod(Utils.modoDePagamento());
        orderConfirmation.clickConfirmOrder();

        //Validar compra feita
        assertTrue(orderConfirmation.isOrderCompleted());

    }
}
