package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SpousePage extends PageObject {

    String SpouseTitle = "";

    String Names = "";

    String Surname = "";

    String Gender = "";

    String IDNumber = "";

    String DateOfBirth = "";


    @Step("Select the spouse title")
    public void SpouseTitle(String spouseTitle){
        $(By.xpath(SpouseTitle)).sendKeys(spouseTitle);

    }
    @Step("Enter spouse name")
    public void SpouseName(String spousenam){
        $(By.xpath(Names)).sendKeys(spousenam);
    }
    @Step("enter spouse surname")
    public void spouseSurnme(String sSurname){
        $(By.xpath(Surname)).sendKeys(sSurname);
    }



    @Step("select spouse gender")
    public void SelectSpousegender(String gender){
        Select produuct = new Select(getDriver().findElement(By.xpath(Gender)));
        produuct.selectByValue(gender);


    }



}
