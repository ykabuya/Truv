package Pages;

import Consts.Consts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoRequestPage extends BasePage {


    public DemoRequestPage clickOnRequestDemoButton() {
        clickElementByXpath(Consts.TOP_MENU_DEMO_REQUEST_BUTTON);
        return new DemoRequestPage();
    }


    public boolean isPasswordWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.TOP_MENU_DEMO_REQUEST_BUTTON)));
        return elementExist(Consts.LETS_CHAT_HEADER);
    }

    public void firstNameInput(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.LETS_CHAT_HEADER)));
        sendTextToElementByXpath(Consts.FIRST_NAME_INPUT, firstName);
    }
    public void lastNameInput(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.LETS_CHAT_HEADER)));
        sendTextToElementByXpath(Consts.LAST_NAME_INPUT, lastName);
    }
    public void workEmailInput(String workEmail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.LETS_CHAT_HEADER)));
        sendTextToElementByXpath(Consts.WORK_EMAIL_INPUT, workEmail);
    }
    public void phoneNumberInput(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.LETS_CHAT_HEADER)));
        sendTextToElementByXpath(Consts.PHONE_NUMBER_INPUT, phoneNumber);
    }
    public void companyInput(String company) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.LETS_CHAT_HEADER)));
        sendTextToElementByXpath(Consts.COMPANY_INPUT, company);
    }
    public void howDidYouHearAboutUsInput(String howDidYouHearAboutUs) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.LETS_CHAT_HEADER)));
        sendTextToElementByXpath(Consts.HOW_DID_YOU_HEAR_ABOUT_US_INPUT, howDidYouHearAboutUs);
    }
    public void clickOnSubmitButton() {
        clickElementByXpath(Consts.SUBMIT_BUTTON);
    }
    public boolean isEmptyErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_ERR)));
        return elementExist(Consts.EMPTY_ERR);
    }
    public boolean isEmptyFirstNameErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_FIRST_NAME_ERR)));
        return elementExist(Consts.EMPTY_FIRST_NAME_ERR);

    }
    public boolean isEmptyLastNameErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_ERR)));
        return elementExist(Consts.EMPTY_ERR);

    }
    public boolean isEmptyWorkEmailErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_ERR)));
        return elementExist(Consts.EMPTY_ERR);

    }
    public boolean isIncorrectWorkEmailErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.INCORRECT_WORK_EMAIL_ERR)));
        return elementExist(Consts.INCORRECT_WORK_EMAIL_ERR);

    }
    public boolean isWrongEmailErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.WRONG_EMAIL_ERR)));
        return elementExist(Consts.WRONG_EMAIL_ERR);

    }
    public boolean isEmptyPhoneNumberErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_ERR)));
        return elementExist(Consts.EMPTY_ERR);

    }
    public boolean isIncorrectPhoneNumberErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.INCORRECT_PHONE_NUMBER_ERR)));
        return elementExist(Consts.INCORRECT_PHONE_NUMBER_ERR);

    }
    public boolean isEmptyCompanyErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_ERR)));
        return elementExist(Consts.EMPTY_ERR);

    }
    public boolean isEmptyHowDidYouHearAboutUsErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.EMPTY_ERR)));
        return elementExist(Consts.EMPTY_ERR);

    }


}
