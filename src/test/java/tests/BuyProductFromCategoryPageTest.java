package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import pageObjects.*;

import static org.junit.Assert.assertTrue;

public class BuyProductFromCategoryPageTest extends BaseTests {
    @Description("Dado que acesso a página 'Category' " +
            "E são exibidos produtos " +
            "E clico no botão 'Quick view' de um produto " +
            "E clico no botão 'Add to cart' " +
            "Quando finalizo a compra " +
            "Então verei o aviso 'Your order on My Store is complete.'")
   @Severity(SeverityLevel.CRITICAL)
    @Test
    public void BuyProductFromCategoryPage() {

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

        //Prosseguir para o checkout
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
