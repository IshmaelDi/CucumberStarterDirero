package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;

public class startSalePage extends PageObjects {

    String StartSaleXpath = "//*[@id=bootstrap-table]/tbody/tr/td[9]/button[1]";
    String SilverRewardsCheckBoxXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[1]/td[1]/input";
    String BlueRewardsCheckBoxXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[2]/td[1]/input";


    public startSalePage(WebDriver driver) {
        super(driver);
    }
}
