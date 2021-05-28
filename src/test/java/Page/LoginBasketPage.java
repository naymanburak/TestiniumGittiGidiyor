package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static Constants.Constants.*;

/**
 * @author  Mustafa Burak Nayman
 * @version 1.0
 * @since   2021-05-28
 */

public class LoginBasketPage extends BasePage {
    public LoginBasketPage(WebDriver driver) {
        super(driver);
    }
    private static Logger logger = LogManager.getLogger(BasePage.class);

    public LoginBasketPage hoverToLogin() {
        logger.info("start conditions are preparing...");
        assertionPage(TITLE);
        hoverElement(USER_MENU);
        logger.info("start conditions are prepared.");
        return this;
    }
    public LoginBasketPage login() throws InterruptedException {
        logger.info("member login...");
        click(LOGIN);
        sendKeys(USER_NAME,USER);
        sendKeys(PW,PASSWORD);
        click(LOGIN_ENTER);
        Thread.sleep(5000);
        assertionPage(TITLE);
        logger.info("member login completed.");
        return this ;
    }

    public LoginBasketPage search(){
        logger.info(PRODUCT +"The word 'bilgisayar' is typed in the search box...");
        findElement(SEARCH);
        sendKeys(SEARCH,PRODUCT);
        click(FIND);
        logger.info(PRODUCT + "completed.");
        return this ;
    }

    public LoginBasketPage nextPage(){
        logger.info("The second page opens...");
        scrollToElement(NEXT_PAGE);
        click(NEXT_PAGE);
        assertionUrl(SECOND_PAGE_CONTROL);
        logger.info("Second page opened.");
        return this;
    }

    public LoginBasketPage randomClick(){
        randomItemClick(PRODUCT_LIST);
        logger.info("random product selection...");
        return this;
    }

    public LoginBasketPage dustBin(){
        click(DUST_BIN);
        logger.info("click dust bin...");
        return this;
    }

    public LoginBasketPage incCount(){
        logger.info("The unit is increasing...");
        scrollToElement(INC_UNIT);
        click(INC_UNIT);
        logger.info("the unit is increased.");
        return this;
    }

    public LoginBasketPage addBasket(){
        logger.info("the product is add to basket, the basket is go and the number of products is check.");
        click(ADD_TO_BASKET);
        click(GOTO_BASKET);
        Assert.assertEquals(findElement(BASKET_PRICE).getText(), findElement(SELECT_COUNT).getText());
        Assert.assertEquals(findElement(PRODUCT_COUNT).getText(), "Ürün Toplamı (2 Adet)");
        logger.info("completely completed.");
        return this;
    }
}

