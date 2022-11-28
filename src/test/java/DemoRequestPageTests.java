import Pages.BasePage;
import Pages.DemoRequestPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoRequestPageTests extends UseCaseBase {
    private static final Logger logger = LogManager.getLogger(DemoRequestPage.class);
    private static DemoRequestPage demoRequestPage = new DemoRequestPage();
    private static BasePage basePage = new BasePage();


    @Test
    public void PositiveDemoRequestPageTest() {
        demoRequestPage.clickOnRequestDemoButton();
        logger.info("correct input");
        demoRequestPage.firstNameInput("Yulia");
        demoRequestPage.lastNameInput("Kabuya");
        demoRequestPage.workEmailInput("Yulia.kabuya@gmail.com");
        demoRequestPage.phoneNumberInput("7877878787");
        demoRequestPage.companyInput("NoCompany");
        demoRequestPage.howDidYouHearAboutUsInput("Somehow");
        demoRequestPage.clickOnSubmitButton();
        Boolean success = demoRequestPage.isWrongEmailErrVisible();
        assertTrue(success);
        demoRequestPage.takeScreenshot("PositiveDemoRequestsPageTest");
    }

    @Test
    public void emptyFirstNameFieldTest() {
        demoRequestPage.clickOnRequestDemoButton();
        logger.info("enter incorrect first name");
        demoRequestPage.firstNameInput(" ");
        demoRequestPage.clickOnSubmitButton();
        Boolean success = demoRequestPage.isEmptyFirstNameErrVisible();
        assertTrue(success);
        demoRequestPage.takeScreenshot("emptyFirstNameFieldTest");
    }
    @Test
    public void emptyLastNameFieldTest() {
        demoRequestPage.clickOnRequestDemoButton();
        logger.info("enter incorrect last name");
        demoRequestPage.lastNameInput(" ");
        demoRequestPage.clickOnSubmitButton();
        Boolean success = demoRequestPage.isEmptyLastNameErrVisible();
        assertTrue(success);
        demoRequestPage.takeScreenshot("emptyLastNameFieldTest");
    }
    @Test
    public void emptyEmailFieldTest() {
        demoRequestPage.clickOnRequestDemoButton();
        logger.info("enter incorrect email");
        demoRequestPage.workEmailInput(" ");
        demoRequestPage.clickOnSubmitButton();
        Boolean success = demoRequestPage.isEmptyWorkEmailErrVisible();
        assertTrue(success);
        demoRequestPage.takeScreenshot("emptyEmailFieldTest");
    }
}

