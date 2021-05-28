package Constants;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class Constants {

    public static String PAGELINK = "https://www.gittigidiyor.com/";
    public static String TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static String USER = "mbnayman95@gmail.com";
    public static String PASSWORD = "sifre123";
    public static String PRODUCT = "bilgisayar";
    public static String SECOND_PAGE_CONTROL = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
    public static final By USER_MENU = By.cssSelector("[data-cy='header-user-menu']");
    public static final By LOGIN = By.cssSelector("[data-cy='header-login-button']");
    public static final By USER_NAME = By.id("L-UserNameField");
    public static final By PW = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By SEARCH = By.cssSelector("[data-cy='header-search-input']");
    public static final By FIND = By.cssSelector("[data-cy='search-find-button']");
    public static final By NEXT_PAGE = By.className("next-link");
    public static final By PRODUCT_LIST = By.className("product-hslider-container");
    public static final By INC_UNIT = By.xpath("//a[@aria-label='Adeti Artır']");
    public static final By ADD_TO_BASKET = By.id("add-to-basket");
    public static final By GOTO_BASKET = By.xpath("//span[text()='Sepetim']");
    public static final By BASKET_PRICE = By.xpath("//div[@class='total-price']");
    public static final By SELECT_COUNT = By.xpath("(//p)[14]");
    public static final By PRODUCT_COUNT = By.xpath("//div[@class='gg-d-16 detail-text']");
    public static final By DUST_BIN = By.className("gg-icon-bin-medium");
}
