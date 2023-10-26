package PageObjects.H.E.L.P_YF;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RewardsPage extends PageObject {

    String SilverRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[1]/td[1]/input";
    String BlueRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[2]/td[1]/input";


    @Step("Click on Sliver Rewards")
    public void SilverRewards() throws InterruptedException {
        Thread.sleep(20000);
        List<WebElement> checkBoxes = getDriver().findElements(By.xpath(BlueRewardsXpath));

    }
}

//    @Step("Click on Blue Rewards")
//    public void BlueRewards(){
//        $(By.xpath(BlueRewardsXpath)).click();
//    }
//}
