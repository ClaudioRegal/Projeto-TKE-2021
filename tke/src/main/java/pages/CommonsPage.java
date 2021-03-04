package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import java.util.Locale;

public class CommonsPage extends BasePage {

  public final By INPUT_EMAIL_LOGIN = By.id("email");
  public final By INPUT_EMAIL_REGISTER = By.id("email_create");
  private final By INPUT_PASSWORD = By.id("passwd");
  public final By BTN_ENTER = By.cssSelector("button[type=submit]");
  private final By ACESSAR_REGISTER_LOGIN = By.className("login");
  private final By INFO_ACCOUNT = By.className("info-account");

  private final Faker faker = new Faker(new Locale("pt-BR"));
  private final String email = faker.internet().emailAddress();

  public void clickEnter() {
    click(BTN_ENTER);
  }
  public void accessLogin(String url) {
    visit(url);
  }
  public void accessRegisterLogin(){

    click(ACESSAR_REGISTER_LOGIN);
  }
  public void inputEmailRegister() {
        sendKeys(INPUT_EMAIL_REGISTER,email );
  }
  public void inputEmailLogin() {
    sendKeys(INPUT_EMAIL_LOGIN, "claudio.r.castro@noesis.pt");
  }
  public void inputPass() {
    sendKeys(INPUT_PASSWORD, "123456");
  }
  public void infoAccount(){
    waitElement(INFO_ACCOUNT);
  }

}

