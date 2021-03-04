package pages.register;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import java.util.Locale;

public class RegisterPage extends BasePage {


    private final By ACCESS_REGISTER = By.id("SubmitCreate");
    private final By RESULT_MSG_ERROR = By.id("create_account_error");
    private final By INPUT_TITLE = By.id("id_gender1");
    private final By FIRST_NAME = By.id("customer_firstname");
    private final By LAST_NAME = By.id("customer_lastname");
    private final By DAY_BIRTH = By.id("days");
    private final By MOUNTH_BIRTH = By.id("months");
    private final By YEARS_BIRTH = By.id("years");
    private final By COMPANY_NAME = By.id("company");
    private final By COMPANY_ADDRESS = By.id("address1");
    private final By COMPANY_CITY = By.id("city");
    private final By COMPANY_STATE = By.id("id_state");
    private final By COMPANY_ZIP = By.id("postcode");
    private final By COMPANY_COUNTRY = By.id("id_country");
    private final By MOBILE_PHONE = By.id("phone_mobile");
    private final By FUTURE_REFERENCE = By.id("alias");
    private final By FINAL_REGISTER = By.id("submitAccount");


    private final Faker faker = new Faker(new Locale("pt-BR"));
    private final String firstName = faker.name().firstName();
    private final String lastName = faker.name().lastName();
    private final String companyName = faker.company().name();
    private final String companyAddress = faker.address().fullAddress();
    private final String companyCity = faker.address().city();
    private final String companyZip = faker.number().digits(5);
    private final String mobilePhone = faker.phoneNumber().cellPhone();
    private final String futureReference = faker.address().streetName();


    public void accessRegister() {
        click(ACCESS_REGISTER);
    }
    public void inputTitle() {
        click(INPUT_TITLE);
    }

    public void firstName() {
        sendKeys(FIRST_NAME, firstName);
    }
    public void lastName() {
        sendKeys(LAST_NAME, lastName);
    }
    public void dayBirth() {
        Select dropdown = new Select(getDriver().findElement(DAY_BIRTH));
        dropdown.selectByValue("27");
    }
    public void mounthBirth() {
        Select dropdown = new Select(getDriver().findElement(MOUNTH_BIRTH));
        dropdown.selectByValue("12");

    }
    public void yearBirth() {
        Select dropdown = new Select(getDriver().findElement(YEARS_BIRTH));
        dropdown.selectByValue("1987");

    }
    public void companyName() {
        sendKeys(COMPANY_NAME, companyName);
    }
    public void companyAddress() {
        sendKeys(COMPANY_ADDRESS, companyAddress);
    }
    public void companyCity() {
        sendKeys(COMPANY_CITY, companyCity);
    }
    public void companyState() {
        Select dropdown = new Select(getDriver().findElement(COMPANY_STATE));
        dropdown.selectByValue("9");

    }
    public void companyZip() {
        sendKeys(COMPANY_ZIP, companyZip);
    }
    public void companyCountry() {
        Select dropdown = new Select(getDriver().findElement(COMPANY_COUNTRY));
        dropdown.selectByValue("21");

    }
    public void mobilePhone() {
        sendKeys(MOBILE_PHONE, mobilePhone);
    }
    public void futureReference() {
        sendKeys(FUTURE_REFERENCE, futureReference);
    }
    public void  finalRegister(){
        click(FINAL_REGISTER);
    }


}
