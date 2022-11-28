package Utils;

import Consts.Consts;
import Pages.BasePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;


public class UseCaseBase {
    private static WebDriver webDriver;
   private static BasePage page;



   //@BeforeAll
//    public static void setUpMain() {
//        page = new BasePage();
//        webDriver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
////        webDriver.getCurrentUrl();
//        page.setWebDriver(webDriver);

    @BeforeAll
    public static void setUpMain() {
        page = new BasePage();
        webDriver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        webDriver.get(Consts.MAIN_URL);
        page.setWebDriver(webDriver);

    }
    @AfterAll
    public static void tearDownMain() {
        SharedDriver.closeDriver();
        webDriver = null;
    }

    public static void setPage(BasePage page) {
        UseCaseBase.page = page;
    }
}


