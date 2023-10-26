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

public class ProductPage extends PageObject {

    String HELPProductXpath = "//img[@src=\"assets/Help.png\"]";

    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";

     String OKBtn = "//button[@class=\"btn btn-success\"]";

     String GetRatesXpath = "//span[@class=\"title\"]";

     String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";

     String ViewXpath = "//span[@class=\"title\"]";

     String InitiateSaleXpath = "//i[@class=\"fa fa-edit\"]";

     String ContinueOnFAISDiscls = "//button[normalize-space()='Continue']";

    String CloseOnFAISDiscls = "//*[@id=\"mat-dialog-9\"]/app-confirmation-dialog/div/div[3]/div/div[1]/button";
    String DOBXapth = "//input[@formcontrolname=\"mainLifeDOB\"]";
    String ClipBoardXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/div/div[4]/div/a/i";
    String SilverRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[1]/td[1]/input";
    String BlueRewardsXpath = "//*[@id=\"bootstrap-table\"]/tbody/tr[2]/td[1]/input";


    public void SelectHELP() throws InterruptedException {

        Thread.sleep(1000);
        $(By.xpath(HELPProductXpath)).click();


    }
    public void selectPlanType(String HELPplanType) throws InterruptedException {
        Thread.sleep(1000);
        Select plan = new Select(getDriver().findElement(By.xpath(PlanTypeDropdown)));
        plan.selectByValue(HELPplanType);

//        WebElement productType = $(By.xpath(ProductTypeDropdown));
//        selectFromDropdown(productType, HELPproductType);

    }


    @Step("Usre click Ok Button")
    public void clickOkBtn(){
        $(By.xpath(OKBtn)).click();
    }

    @Step("Usre click on Get Rates Button")
    public void GetRates(){
        $(By.xpath(GetRatesXpath)).click();
    }



    @Step("Select Plan Option")
    public void SelectPlanOption() throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropdown = $(By.xpath(PlanOptionXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue("Individual");
    }

//        WebElement plan = $(By.xpath(PlanOptionXpath));
//        selectFromDropdown(plan, planOption);


    @Step("Usre enter MainLifeDOB")
    public void mainLifeDOB(){

        $(By.xpath("//input[@formcontrolname=\"mainLifeDOB\"]")).click();
        $(By.xpath(DOBXapth)).click();
        $(By.xpath(DOBXapth)).sendKeys("1978/05/07" + Keys.ENTER);
    }

    @Step("Click on Sliver Rewards")
    public void SilverRewards(){
        $(By.xpath(SilverRewardsXpath)).click();

    }

    @Step("Click on Blue Rewards")
    public void BlueRewards(){
        $(By.xpath(BlueRewardsXpath)).click();
    }

    @Step("Usre click on View Button")
    public void  ClickView(){
        $(By.xpath(ViewXpath)).click();

    }

    @Step("User Initiate a Sale")
    public void InitiateSale(){
        $(By.xpath(InitiateSaleXpath)).click();
    }

    @Step("User Confirms by clicking continue button")
    public void  clickContinueOnFaisDiscl(){
        WebDriverWait wait =  new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement  element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ContinueOnFAISDiscls)));
        element.click();
    }



    public void clickCloseOnFaisDiscl(){
        $(By.xpath(CloseOnFAISDiscls)).click();
    }







}
