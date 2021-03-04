package pages.cart;

import org.openqa.selenium.By;
import pages.BasePage;

public class CartPage extends BasePage {

    private final By INPUT_BLOUSE = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img");
    private final By MORE_BLOUSE = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]");
    private final By QUANTITY_BLOUSE = By.id("quantity_wanted");
    private final By ADD_BLOUSE_TO_CART = By.id("add_to_cart");
    private final By CONTINUE_SHOPPING = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span");
    private final By SEARCH_HOME = By.id("search_query_top");
    private final By SELECT_PRINTED_SUMMER = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
    private final By ADD_PRINTED_TO_CART = By.xpath("//*[@id=\"add_to_cart\"]/button");
    private final By PROCEED_CHECKOUT_1 = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    private final By PROCEED_CHECKOUT_2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    private final By PROCEED_CHECKOUT_3 = By.name("processAddress");
    private final By AGREE_CHECK = By.id("uniform-cgv");
    private final By PROCEED_CHECKOUT_4 = By.name("processCarrier");
    private final By PAY_BY_CHECK = By.className("cheque");
    private final By CONFIRM_ORDER = By.xpath("//*[@id=\"cart_navigation\"]/button");
    private final By ALERT_SUCCESS = By.xpath("//*[@id=\"center_column\"]/p[1]");



    public void inputBlouse(){
        perform(INPUT_BLOUSE);
    }
    public void moreBlouse(){
        click(MORE_BLOUSE);
    }
    public void quantityBlouse(){
        sendKeys(QUANTITY_BLOUSE, "2");
    }
    public void blouseCart(){
        click(ADD_BLOUSE_TO_CART);
    }
    public void continueShoppping(){
        click(CONTINUE_SHOPPING);
    }
    public void searchHome(){
        sendKeys(SEARCH_HOME , "printed Summer dress");
        pressEnter(SEARCH_HOME);

    }
    public void selectPrintedSummer(){
        click(SELECT_PRINTED_SUMMER);
    }
    public void addPrintedCart(){
        waitElement(ADD_PRINTED_TO_CART);
        click(ADD_PRINTED_TO_CART);
    }
    public void proceedCheckout1(){
        waitElement(PROCEED_CHECKOUT_1);
        click(PROCEED_CHECKOUT_1);
    }
    public void proceedCheckout2(){
        waitElement(PROCEED_CHECKOUT_2);
        click(PROCEED_CHECKOUT_2);
    }
    public void proceedCheckout3(){
        waitElement(PROCEED_CHECKOUT_3);
        click(PROCEED_CHECKOUT_3);
    }
    public void proceedCheckout4(){
        waitElement(PROCEED_CHECKOUT_4);
        click(PROCEED_CHECKOUT_4);
    }
    public void agreeCheck(){
      waitElement(AGREE_CHECK);
        click(AGREE_CHECK);

    }
    public void payByCheck(){
        waitElement(PAY_BY_CHECK);
        click(PAY_BY_CHECK);
    }
    public void confirmOrder(){
        waitElement(CONFIRM_ORDER);
        click(CONFIRM_ORDER);
    }
    public void alertSucess(){
        isVisible(ALERT_SUCCESS);


    }
}
