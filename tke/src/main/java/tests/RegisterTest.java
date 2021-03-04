package tests;


import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.CommonsPage;
import pages.homePage.HomePage;
import pages.register.RegisterPage;
import static utils.HandleProperties.getValue;


public class RegisterTest {

    private final CommonsPage commons = new CommonsPage();
    private final RegisterPage rp = new RegisterPage();
    private final BasePage bp = new BasePage();
    private final HomePage hp = new HomePage();

    @Test
    public void cadastroValido() {

        commons.accessLogin(getValue("URL"));
        hp.validateWelcome();
        commons.accessRegisterLogin();
        commons.inputEmailRegister();
        rp.accessRegister();
        rp.inputTitle();
        rp.firstName();
        rp.lastName();
        commons.inputPass();
        rp.dayBirth();
        rp.mounthBirth();
        rp.yearBirth();
        rp.companyName();
        rp.companyAddress();
        rp.companyCity();
        rp.companyState();
        rp.companyZip();
        rp.companyCountry();
        rp.mobilePhone();
        rp.futureReference();
        rp.finalRegister();
        commons.infoAccount();

    }

 }
