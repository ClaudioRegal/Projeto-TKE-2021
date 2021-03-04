package pages.homePage;

import pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By RESULT_WELCOME_TEXT = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private final By BACK_TO_WELCOME = By.xpath("//*[@id=\"center_column\"]/ul/li/a");

    public void validateWelcome(){
        waitElement(RESULT_WELCOME_TEXT);
    }
    public void inputWelcome(){
        waitElement(BACK_TO_WELCOME);
        click(BACK_TO_WELCOME);
    }
}
