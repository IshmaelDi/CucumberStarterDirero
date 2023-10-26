package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SummaryPage extends PageObject{


    String ConfirmdebitDate = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[2]/div/div/ul/li[1]/input";

    String explananationOfWaitingPeriod = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[2]/div/div/ul/li[2]/ul/li[1]/input";

    String permissionTodebit = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[2]/div/div/ul/li[2]/ul/li[2]/input";

    String listOFExclusions = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[2]/div/div/ul/li[2]/ul/li[3]/input";

    String detailsCorrect = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[2]/div/div/ul/li[2]/ul/li[4]/input";

    String rewardsExplanantion = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[2]/div/div/ul/li[2]/ul/li[5]/input";

    String ConcludSale = "//*[@id=\"pills-tabContent\"]/accept-sale/div/div[3]/div/div/div/button/span";


    @Step("confirm that that client account will be debit on the specified date")
    public void confirmdebitDate(){
        $(By.xpath(ConfirmdebitDate)).click();
    }

    @Step("confirm that consultant has explained all waiting periods and exclusions as per script")
    public void exclusionsExplanations(){
        $(By.xpath(explananationOfWaitingPeriod)).click();
    }

    @Step("confirm that consultant has obtained permission to debit account of total premium for this policy")
    public void permissionObtained(){
        $(By.xpath(permissionTodebit)).click();

    }

    @Step("confirm that consultant has explained full list of exclusion for selected policy")
    public void listOfExclusions(){
        $(By.xpath(listOFExclusions)).click();
    }

    @Step("confirm that all details are correct")
    public void CorrectDetails(){
        $(By.xpath(detailsCorrect)).click();
    }

    @Step("Confirm that rewards have been explained to client")
    public void explanantionOfRewards(){
        $(By.xpath(rewardsExplanantion)).click();

    }
    @Step("conclude the sale")
    public void ClickConcludeSale(){
        $(By.xpath(ConcludSale)).click();

    }



}
