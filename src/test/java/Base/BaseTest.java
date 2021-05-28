package Base;
import Constants.Constants;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

/**
 * @author  Mustafa Burak Nayman
 * @version 1.0
 * @since   2021-05-28
 */

public class BaseTest {
    static WebDriver webDriver=null;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "DriverChrome/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(Constants.PAGELINK);
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getWebDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }
}
