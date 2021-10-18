package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import pageObjects.*;
import utils.TestsInfo;

import static org.junit.Assert.assertTrue;

public class BuyProductFromSearchTest extends BaseTests {
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void buyProductFromSearchPage() {
        String quest = TestsInfo.getSearchObject();

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

        //Prosseguir com a compra
        payment.paymentMethod();
        orderConfirmation.clickConfirmOrder();

        //Validar compra feita
        assertTrue(orderConfirmation.isOrderCompleted());

    }
}
