package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FicaPage extends PageObject {


    // Fica Declarations Elements


    String Fica1Xpath = "//*[@id=\"IsProminentPublicOfficial\"]";
    String Fica2Xpath = "//*[@id=\"IsProminentInternationalPublicOfficial\"]";

    String SaveFicaBtn = "//*[@id=\"pills-tabContent\"]/fica-declaration/div/div[2]/div/div/button/span";




    // Fica Declaration Methods



    @Step("Accept FICA declaration ")
    public void acceptFICAdecl(String Yes_No) {
        WebElement FD1 = $(By.xpath(Fica1Xpath));
        selectFromDropdown(FD1, Yes_No);
    }

    @Step("Accept FICA declaration ")
    public void acceptFicaDeclaration2(String YES_NO) {
        WebElement FD2 = $(By.xpath(Fica2Xpath));
        selectFromDropdown(FD2, YES_NO);
    }

    @Step("Click the continue button")
    public void clickContinueBt() {
        if ($(By.xpath(SaveFicaBtn)).isClickable()) {
            $(By.xpath(SaveFicaBtn)).click();
        } else {

            Assert.fail("Button not clickable");
        }
    }


}
