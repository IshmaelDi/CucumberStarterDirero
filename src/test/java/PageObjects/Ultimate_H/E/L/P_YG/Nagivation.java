package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Nagivation extends PageObject {

    String PayerPage = "";

    String SpousePage = "";

    String ChildPage = "";

    String BeneficiaryPage = "";

    String FicaPage = "";

    String PremiumPage = "";

    String RewardPage = "";

    String SummaryPage = "";





    @Step("Navigate to payer page")
    public void ClickPayer(){
        $(By.xpath(PayerPage)).click();
    }

    @Step("Navigate to  spouse page")
    public void clickSpouse(){
        $(By.xpath(SpousePage)).click();

    }
    @Step("Navigate to child page")
    public void clickChild(){
        $(By.xpath(ChildPage)).click();
    }
    @Step("Navigate to Beneficiary page")
    public void clickBeneficiary(){
        $(By.xpath(BeneficiaryPage)).click();

    }
    @Step("Navigate to FICA page ")
    public void clickFICA(){
        $(By.xpath(FicaPage)).click();

    }
    @Step("Navigate to premium page ")
    public void clickPremium(){
        $(By.xpath(PremiumPage)).click();

    }
    @Step("Navigate to rewards page")
    public void clickRewards(){
        $(By.xpath(RewardPage)).click();
    }

    @Step("Navigate to summary page")
    public void clickSummary(){
        $(By.xpath(SummaryPage)).click();
    }

}
