package tests;


import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.CommonsPage;
import pages.homePage.HomePage;
import pages.login.LoginPage;


public class LoginTest {

    private final LoginPage login = new LoginPage();
    private final CommonsPage common = new CommonsPage();
    private final BasePage bp = new BasePage();
    private final HomePage hp = new HomePage();

    @Test
    public void loginComSucesso() {

        common.accessRegisterLogin();
        login.dadosLogin();
        common.infoAccount();
    }

}
