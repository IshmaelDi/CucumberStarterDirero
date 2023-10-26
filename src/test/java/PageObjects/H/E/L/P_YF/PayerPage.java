package PageObjects.H.E.L.P_YF;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayerPage extends PageObject {

    String PayerTitleXpath = "//select[@id=\"Title\"]" ;
    String Names = "//input[@id=\"FirstNames\"]" ;
    String Surname = "//input[@id=\"Surname\"]" ;
    String IdNumberXpath = "//*[@id=\"IdentityNumber\"]";
    String IdNumberEnterXpath = "//*[@id=\"mainInput\"]";
    String ConfirmIdNoXpath = "//*[@id=\"confirmationInput\"]";
    String OkButtonXpath = "//*[@id=\"mat-dialog-11\"]/app-shamba-double-verification-dialog/div/div[3]/div/div[2]/button";

    String MobileNum = "//input[@id=\"MobileTelephoneNumber\"]" ;
    String relationship = "//*[@id=\"RelationToMember\"]" ;
    String DebitDay = "//select[@id=\"DebitDay\"]" ;
    String FirstDebitDate = "//select[@id=\"FirstDebitDate\"]" ;
    String IsEmployee = "//select[@id=\"IsEmployee\"]" ;

    String BankName = "//select[@id=\"BankName\"]" ;

    String Branchcode = "id=\"BankBranchCode\"" ;
    String AccountType = "//select[@id=\"BankAccountType\"]" ;
    String AccountNumber = "//input[@id=\"BankAccountNumber\"]" ;
    String EnterAccountNumberXpath = "//*[@id=\"mainInput\"]";
    String ConfirmAccountNumberXapth = "//*[@id=\"confirmationInput\"]";
    String AccountOkButtonXpath = "//*[@id=\"mat-dialog-13\"]/app-shamba-double-verification-dialog/div/div[3]/div/div[2]/button";

    String CheckBoxBankNum = "//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[1]/input";

    String checkBoxtranscation = "//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[2]/input";




    @Step("Select payer title ")
    public void PayerTitle(String PayerTitle){
        WebElement PT = $(By.xpath(PayerTitleXpath));
        selectFromDropdown(PT, PayerTitle);

        }
//        Select product = new Select(getDriver().findElement(By.xpath(PayerTitle)));
//        product.selectByValue(PayerTitle);
//    }

    @Step("Enter payer name")
    public void EnterPayerName(String payerName){
        $(By.xpath(Names)).sendKeys(payerName);
    }
    @Step("Enter payer surname")
    public void EnterPayerSurname(String payerSurname) {
        $(By.xpath(Surname)).sendKeys(payerSurname);

    }

        @Step("Enter main member ID number ")
        public void enterIdNumber() {
            $(By.xpath(IdNumberXpath)).click();
        }

        @Step("Enter ID number ")
        public void IDNumber(String IdNumber) throws InterruptedException {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

            WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IdNumberEnterXpath)));

            ID.click();

            ID.sendKeys(IdNumber);

        }


        @Step("Enter ID number ")
        public void ConfirmID(String IdNumber) {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

            WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmIdNoXpath)));

            ID.click();

            ID.sendKeys(IdNumber);

        }

    @Step("Click Ok Button")
    public void OkButton(){
        $(By.xpath(AccountOkButtonXpath)).click();

    }
    @Step("Enter payer mobile number ")
    public void mobileNum(String Number){
        $(By.xpath(MobileNum)).sendKeys(Number);

    }
    @Step("select payer relationship")
    public void selectRelationship(String RealationshipWithPayer){
        Select produuct = new Select(getDriver().findElement(By.xpath(relationship)));
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        if(getRenderedView().elementIsPresent(By.xpath(relationship))){
            produuct.selectByValue(RealationshipWithPayer);
        }
        else{
            produuct.getFirstSelectedOption();
        }
    }
    @Step("select debit day")
    public void Debitday(String dayOfDebit){

        Select produuct = new Select(getDriver().findElement(By.xpath(DebitDay)));
        produuct.selectByValue(dayOfDebit);
    }
    @Step("select day of first debit")
    public void Firstdebitday(String firstDayOfDebit){
        Select produuct = new Select(getDriver().findElement(By.xpath(DebitDay)));
        produuct.selectByValue(firstDayOfDebit);
    }
    @Step("Select bank name")
    public void Bankname(String selectBankName){
        Select produuct = new Select(getDriver().findElement(By.xpath(BankName)));
        produuct.selectByValue(selectBankName);
    }

    @Step("select bank branch code")
    public void bankBranchcode(String branchcode){
        Select produuct = new Select(getDriver().findElement(By.xpath(Branchcode)));
        produuct.selectByValue(branchcode);
    }
    @Step("Select account type")
    public void AccType(String Accounttype){
        Select produuct = new Select(getDriver().findElement(By.xpath(AccountType)));
        produuct.selectByValue(Accounttype);

    }
    @Step("Enter Account number")
    public void enterAccountNumber(String accountNumber) {
        $(By.xpath(AccountNumber)).sendKeys(accountNumber);
    }

    @Step("Enter Account number ")
    public void AccountNumbner(String IdNumber) throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(EnterAccountNumberXpath)));

        ID.click();

        ID.sendKeys(IdNumber);

    }


    @Step("Enter Accounts number ")
    public void ConfirmAccountNumber(String IdNumber) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

            WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmAccountNumberXapth)));

            ID.click();

            ID.sendKeys(IdNumber);

        }

        @Step("Click Ok Button")
        public void AccountOkButton(){
            $(By.xpath(OkButtonXpath)).click();

        }

    @Step("confirm client number is the same as bank number")
    public void clientNumConfirmation(){
        $(By.xpath(CheckBoxBankNum)).click();

    }
    @Step("confirm with client that the bank sends any transaction messages on this number")
    public void transactionMessagesConfirmation(){
        $(By.xpath(checkBoxtranscation)).click();
    }
}
