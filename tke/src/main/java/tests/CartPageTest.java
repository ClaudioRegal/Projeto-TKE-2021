package tests;


import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.CommonsPage;
import pages.cart.CartPage;
import pages.homePage.HomePage;
import pages.login.LoginPage;


public class CartPageTest {

    private final LoginPage login = new LoginPage();
    private final CommonsPage common = new CommonsPage();
    private final CartPage cart = new CartPage();
    private final HomePage hp = new HomePage();
    private final BasePage bp = new BasePage();


    @Test
   public void compraComSucesso() {

        hp.inputWelcome();
        cart.inputBlouse();
        cart.moreBlouse();
        cart.quantityBlouse();
        cart.blouseCart();
        cart.continueShoppping();
        cart.searchHome();
        cart.selectPrintedSummer();
        cart.addPrintedCart();
        cart.proceedCheckout1();
        cart.proceedCheckout2();
        cart.proceedCheckout3();
        cart.agreeCheck();
        cart.proceedCheckout4();
        cart.payByCheck();
        cart.confirmOrder();
        cart.alertSucess();


    }
}
