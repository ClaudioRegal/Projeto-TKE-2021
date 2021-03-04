package pages;


import org.openqa.selenium.interactions.Actions;
import utils.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

  private final long DEFAULT_TIME_WAIT = 10;

  public BasePage() {
    if (Browsers.driver == null) {
      Browsers.initializeDriver();
    }
  }

  public static WebDriver getDriver() {
    return Browsers.driver;
  }
  public static WebDriver quit() {
    getDriver().quit();
    return Browsers.driver;

     }

  public void visit(String url) {
    getDriver().get(url);
  }

  protected void sendKeys(By locator, String text) {
    isVisible(locator);
    getElement(locator).clear();
    this.waitForTextInElement(locator, "");
    getElement(locator).sendKeys(text);
  }
  protected void pressEnter(By locator) {
    isVisible(locator);
    getElement(locator).sendKeys(Keys.ENTER);
  }
  protected void click(By locator) {
    isClickable(locator);
    getElement(locator).click();
  }
  protected void perform(By locator){
    Actions act = new Actions(getDriver());
    act.moveToElement(getElement(locator)).perform();
    act.click();
  }
  protected WebElement waitElement(By locator) {
    return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
        .until(ExpectedConditions.presenceOfElementLocated(locator));
  }
  protected List<WebElement> waitElements(By locator) {
    return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
        .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
  }
  protected boolean isVisible(By locator) {
    new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
        .until(ExpectedConditions.visibilityOf(getElement(locator)));
    return getElement(locator).isDisplayed();
  }
  protected boolean isClickable(By locator) {
    new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
        .until(ExpectedConditions.elementToBeClickable(getElement(locator)));
    return getElement(locator).isDisplayed() && getElement(locator).isEnabled();
  }
  protected void waitForTextInElement(By locator, String textToBeWait) {
    new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
        .until(ExpectedConditions.textToBe(locator, textToBeWait));
  }

  private WebElement getElement(By locator) {
    return waitElement(locator);
  }
  private List<WebElement> getElements(By locator) {
    return waitElements(locator);
  }
}
