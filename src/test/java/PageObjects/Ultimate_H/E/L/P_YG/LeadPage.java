package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LeadPage extends PageObject {

    String leadCheckBox = "//input[@name=\"undefined\" ]";

    String ActionSaleBtn = "//i[@class=\"bi bi-cash-coin\"]";
//    String ActionSaleBtnXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[1]/td[9]/button[4]/span/i";




    @Step("Select a lead to action a sale")
    public void ActionSale() throws InterruptedException {
        Thread.sleep(20000);
        List<WebElement> checkBoxes = getDriver().findElements(By.xpath(leadCheckBox));
        List<WebElement> startSale = getDriver().findElements(By.xpath(ActionSaleBtn));
        checkBoxes.get(1).click();
        startSale.get(1).click();


    }



}
