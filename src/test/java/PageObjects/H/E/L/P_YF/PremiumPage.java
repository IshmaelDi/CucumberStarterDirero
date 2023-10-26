package PageObjects.H.E.L.P_YF;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PremiumPage extends PageObject {

    String SavePremiumInformation = "//*[@id=\"pills-tabContent\"]/premium/div/div/div/div[4]/div/div/div/button/span";
    String ConvertProductToXpath = "//*[@id=\"productConversion\"]";
    String PremiumCoverAmountXpath = "//*[@id=\"pills-tabContent\"]/premium/div/div/div/div[2]/div/div[1]/div[2]/span";





    @Step("Select ConvertToProduct")
    public void ConvertToProduct(String ConvertProductTo){
        WebElement CP = $(By.xpath(ConvertProductToXpath));
        selectFromDropdown(CP, ConvertProductTo);
    }

    @Step("view total premium and cover amount")
    public void viewPremiumAndCoverAmount() {


        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        boolean isPremiumVisibile =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PremiumCoverAmountXpath))).isDisplayed();


        if (isPremiumVisibile) {
            System.out.println("Premiums are visibile to client based on the information captured");
        } else {

            Assert.fail("Premium is not visible to the user, check for any errors ");

        }


    }




     @Step("Save premium information")
    public void SavePremInfomation(){
        $(By.xpath(SavePremiumInformation)).click();
     }

}
