package utils;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.concurrent.TimeUnit;
import static utils.HandleProperties.getValue;

public class Browsers {

  public static WebDriver driver;

  public static void initializeDriver() {

    switch (getValue("BROWSER").toLowerCase()) {
      case "chrome_linux":
        System.setProperty("webdriver.chrome.driver", "./drivers/linux/chromedriver_linux");

        ChromeOptions chrome_linux = new ChromeOptions();
        chrome_linux.addArguments(
            "--headless",
            "--disable-gpu",
            "--window-size=1920,1200",
            "--ignore-certificate-errors",
            "--no-sandbox");
        driver = new ChromeDriver(chrome_linux);
        break;

      case "chrome_win":
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\win\\chromedriver_win.exe");

        ChromeOptions chrome_win = new ChromeOptions();
        chrome_win.addArguments(
        //    "--headless",
            "--incognito",
            "--disable-gpu",
            "--window-size=1920,1200",
            "--ignore-certificate-errors",
            "--no-sandbox");
        driver = new ChromeDriver(chrome_win);
        break;

      case "chrome_mac":
        System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedriver_mac");

        ChromeOptions chrome_mac = new ChromeOptions();
        chrome_mac.addArguments(
            "--headless",
            "--disable-gpu",
            "--window-size=1920,1200",
            "--ignore-certificate-errors",
            "--no-sandbox");
        driver = new ChromeDriver(chrome_mac);
        break;

      case "firefox_linux":
        System.setProperty("webdriver.gecko.driver", "./drivers/linux/geckodriver_linux");

        FirefoxOptions firefox_linux = new FirefoxOptions();
        firefox_linux.addArguments(
            "--headless",
            "--disable-gpu",
            "--window-size=1920,1200",
            "--ignore-certificate-errors",
            "--no-sandbox");
        driver = new FirefoxDriver(firefox_linux);
        break;

      case "firefox_win":
        System.setProperty("webdriver.gecko.driver", ".\\drivers\\win\\geckodriver_win.exe");

        FirefoxOptions firefox_win = new FirefoxOptions();
        firefox_win.addArguments(
            "--headless",
            "--disable-gpu",
            "--window-size=1920,1200",
            "--ignore-certificate-errors",
            "--no-sandbox");
        driver = new FirefoxDriver(firefox_win);
        break;

      case "firefox_mac":
        System.setProperty("webdriver.gecko.driver", "./drivers/mac/geckodriver_mac");

        FirefoxOptions firefox_mac = new FirefoxOptions();
        firefox_mac.addArguments(
            "--headless",
            "--disable-gpu",
            "--window-size=1920,1200",
            "--ignore-certificate-errors",
            "--no-sandbox");
        driver = new FirefoxDriver(firefox_mac);
        break;

      default:
        throw new NotFoundException("Navegador inválido. Por favor, escolher um browser válido!");
    }

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  public static void finishDriver() {
    driver.quit();

  }
}
