package PageObjects.H.E.L.P_YF;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BeneficiaryPage extends PageObject {

    // Elements for Beneficiary Details

    String AddBeneficiaryXpath = "//*[@id=\"pills-tabContent\"]/beneficiary/div/div/div/div/div/div[2]/button";
    String BeneficiaryTitleXpath = "//*[@id=\"Title\"]";
    String BeneficiaryNameXpath = "//*[@id=\"FirstNames\"]";
    String BeneficiarySurnameXpath = "//*[@id=\"Surname\"]";
    String BeneficiaryIDNumberXpath = "//*[@id=\"IdentityNumber\"]";
    String BeneficiaryDOBXpath = "//*[@id=\"DateOfBirth\"]";
    String BeneficiaryRelationshipXpath = "//*[@id=\"Relation\"]";
    String BeneficiaryAllocationXpath = "//*[@id=\"PercentageInsured\"]";
    String BeneficiarySaveButtonXpath = "//*[@id=\"pills-tabContent\"]/beneficiary/div/div[2]/div/div/div/button";


    // Methods Implemented for Beneficiary

    @Step("Click Add Beneficiary")
    public void AddBeneficiary() {
        $(By.xpath(AddBeneficiaryXpath)).click();
    }

    @Step("Select beneficiary Title")
    public void SelectBeneficiaryTitle(String Title) {
        WebElement beneficiaryTitle = $(By.xpath(BeneficiaryTitleXpath));
        selectFromDropdown(beneficiaryTitle, Title);
    }

    @Step(" Enter the name of the beneficiary")
    public void EnterBeneficiaryName(String name) {
        $(By.xpath(BeneficiaryNameXpath)).sendKeys(name);
    }

    @Step("Enter the surname of the beneficiary")
    public void EnterBeneficiarySurname(String Bsurname) {
        $(By.xpath(BeneficiarySurnameXpath)).sendKeys(Bsurname);
    }

    @Step("Enter the beneficiary ID number")
    public void EnterBeneficiaryIDNumber(String IDnum) {
        $(By.xpath(BeneficiaryIDNumberXpath)).sendKeys(IDnum);
    }


    @Step(" Enter beneficiary date of birth")
    public void EnterDateOfBirth() {

        $(By.xpath(BeneficiaryDOBXpath)).click();

        $(By.xpath(BeneficiaryDOBXpath)).sendKeys("2002-02-11" + Keys.ENTER);

    }

    @Step("Select beneficial relationship")
    public void SelectBeneficiaryRelationship(String BeneficiaryRelationship) {

        WebElement beneficiaryRelation = $(By.xpath(BeneficiaryRelationshipXpath));
        selectFromDropdown(beneficiaryRelation, BeneficiaryRelationship);

    }

    @Step("Select percentage allocation")
    public void SelectPercentageAllocation(String PercentageAllocation) {

        WebElement Allocation = $(By.xpath(BeneficiaryAllocationXpath));
        selectFromDropdown(Allocation, PercentageAllocation);
    }

    @Step("Click Save Buuton")
    public void SaveButton(){
        $(By.xpath(BeneficiarySaveButtonXpath)).click();
    }
}
