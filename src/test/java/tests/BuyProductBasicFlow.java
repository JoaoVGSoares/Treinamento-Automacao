package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import pageObjects.*;
import utils.Utils;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BuyProductBasicFlow extends BaseTests {
    @Test
    public void BuyProductBasicFlow() {

        //Iniciar as páginas
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();
        ShoppingCartPage cart = new ShoppingCartPage();
        LoginPage login = new LoginPage();
        AddressPage addressPage = new AddressPage();
        ShippingPage shipping = new ShippingPage();
        PaymentPage payment = new PaymentPage();
        OrderConfirmationPage orderConfirmation = new OrderConfirmationPage();

        //Acessar a categoria Women e selecionar o primeiro produto
        home.selectWomenCategory();
        category.chooseFirstProduct();
        category.clickProceedToCheckout();

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

        //Prosseguir com a compra
        payment.paymentMethod(Utils.modoDePagamento());
        orderConfirmation.clickConfirmOrder();

        //Validar compra feita
        assertTrue(orderConfirmation.isOrderCompleted());


    }
}
