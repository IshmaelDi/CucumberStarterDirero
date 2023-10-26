package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class memberPage extends PageObject {

    String TitleXpath = "//select[@id='Title']";


    String NameXpath = "//input[@id=\"FirstNames\" ]";

    String SurnameXpath = "//input[@id=\"Surname\"]";

    String CellNumberXpath = "//input[@id=\"MobileTelephoneNumber\" ]";
    String EmailAddressXpath = "//*[@id=\"EmailAddress\"]";

    String SouthAfricanCitizenXpath = "//select[@id=\"IsSouthAfricanCitizen\"]";

    String EnterIDNumXpath = "//*[@id=\"IdentityNumber\"]";

    String DOBXpath = "//*[@id=\"DateOfBirth\"]";

    String IdNumberXpath = "//*[@id=\"mainInput\"]"; // //*[@id="mainInput"]
    String ConfirmIdNoXpath = "//*[@id=\"confirmationInput\"]";

    String OkBtnXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";
    //"//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String MonthlyIncomeXpath = "//*[@id=\"MonthlyIncomeRange\"]";

    String OccupationXpath = "//select[@id=\"Occupation\"]";
    String EducationXpath = "//select[@id=\"EducationLevel\"]";
    String MedicalConditionsXpath = "//*[@id=\"MedicalConditions\"]";
    String PostalAddressXpath = "//*[@id=\"PostalAddressLine1\"]";
    String SuburbXpath = "//*[@id=\"PostalAddressLine2\"]";
    String TownXpath = "//*[@id=\"PostalAddressLine3\"]";
    String PostalCodeXpath = "//*[@id=\"PostalAddressCode\"]";
    String SaveMainMemberXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";

    String CopyToPhysicalXpath = "//i[@class='fa fa-clipboard']";
    String ValidateBtnXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";


    @Step("Select main member Title")
    public void SelectTitle(String MainMemberTitle) {
        WebElement Ti = $(By.xpath(TitleXpath));
        selectFromDropdown(Ti, MainMemberTitle);

    }

    @Step("Enter main member Name ")
    public void EnterName(String MainMemberName) {
        $(By.xpath(NameXpath)).sendKeys(MainMemberName);

    }

    @Step("Enter main member surname")
    public void enterSurname(String MainMemberSurname) {
        $(By.xpath(SurnameXpath)).sendKeys(MainMemberSurname);

    }

    @Step("Enter main member cell number")
    public void EnterCellNumber(String MainMemberCellNumber) {
        $(By.xpath(CellNumberXpath)).sendKeys(MainMemberCellNumber);

    }

    @Step("Enter Email Address")
    public void EnterEmailAddress(String EmailAddress) {
        $(By.xpath(EmailAddressXpath)).sendKeys(EmailAddress);
    }

    @Step("Select main member citizenship ")
    public void SelectCitizenship(String Citizenship) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(SouthAfricanCitizenXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(Citizenship);

    }

    @Step("Enter main member ID number ")
    public void enterIdNumber() {
        $(By.xpath(EnterIDNumXpath)).click();
    }

    @Step("Enter ID number ")
    public void IDNumber(String IdNumber) throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement ID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IdNumberXpath)));

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


    @Step("Click Ok Button ")
    public void ClickOnButton() {
        $(By.xpath(OkBtnXpath)).click();
    }


    @Step("select Date of Birth for main member")
    public void MainMemberDOB() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(DOBXpath)).click();

        $(By.xpath(DOBXpath)).sendKeys("2002-02-11" + Keys.ENTER);

    }

    @Step(" select Monthly income for main member")
    public void selectMonthlyIncome(String MonthlyIncome) {

        WebElement dropdown = $(By.xpath(MonthlyIncomeXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(MonthlyIncome);


    }

    @Step(" select occupation for main member")
    public void selectOccupation(String Occupation) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(OccupationXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue((Occupation));


    }

    @Step("Enter Education")
    public void selectEducation(String Education) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(EducationXpath));
        Select selectObject = new Select((dropdown));
        selectObject.selectByValue(Education);
    }


//    @Step("Enter medical conditions")
//    public void selectMedicalConditions() throws InterruptedException {
//        Thread.sleep(5000);
//        WebElement dropdown = $(By.xpath(MedicalConditionsXpath));
//        Select selectObject = new Select((dropdown));
//        selectObject.selectByValue("Oper");
//
//
//    }

    @Step("Enter Postal Address")
    public void PostalAddress(String PostalAddress) {
        $(By.xpath(PostalAddressXpath)).sendKeys(PostalAddress);

    }

    @Step("Enter Suburb")
    public void EnterSuburb(String Suburb) {
        $(By.xpath(SuburbXpath)).sendKeys(Suburb);
    }

    @Step("Enter Town/City")
    public void EnterTown(String Town) {
        $(By.xpath(TownXpath)).sendKeys(Town);

    }

    @Step("Enter Postal Code")
    public void EnterPostalCode(String PostalCode) {
        $(By.xpath(PostalCodeXpath)).sendKeys(PostalCode);
    }

    @Step("Validate Address")
    public  void ValidateAddress(){
        $(By.xpath(ValidateBtnXpath)).click();
    }
    @Step("Copy to Physical ")
    public void CopyToPhyscButton() {
        $(By.xpath(CopyToPhysicalXpath)).click();

    }
    @Step("Save Main Member")
    public void SaveMainMember(){
        $(By.xpath(SaveMainMemberXpath)).click();
    }
}