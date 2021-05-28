package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Base.BaseTest;
import Page.LoginBasketPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author  Mustafa Burak Nayman
 * @version 1.0
 * @since   2021-05-28
 */

public class LoginBasketPageTest extends BaseTest {
    LoginBasketPage LoginBasketPage;
    private static Logger logger = LogManager.getLogger(LoginBasketPageTest.class);

    @Before
    public void before() {
        logger.info("Driver activations starting");
        LoginBasketPage = new LoginBasketPage(getWebDriver());
        logger.info("Driver activated");
    }

    @Test
    public void testLogin() throws InterruptedException {
        logger.info("Test is starting.");
        LoginBasketPage.hoverToLogin().login().search().nextPage().randomClick().incCount().addBasket().dustBin();
        logger.info("Test started");
    }

    @After
    public void after() throws InterruptedException {
        logger.info("Driver tear down.");
        tearDown();
    }
}