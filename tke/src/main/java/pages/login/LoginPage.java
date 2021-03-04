package pages.login;

import org.openqa.selenium.By;
import pages.BasePage;
import pages.CommonsPage;

public class LoginPage extends BasePage {

    private final CommonsPage commons = new CommonsPage();

    private final By INPUT_LOGIN = By.id ("SubmitLogin");

    public void dadosLogin() {
        commons.inputEmailLogin();
        commons.inputPass();
        clickLogin();
    }
    public void clickLogin(){
        click(INPUT_LOGIN);
    }


}

