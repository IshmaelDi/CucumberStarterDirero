package PageObjects.Ultimate_H.E.L.P_YG;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class HomePage extends PageObject {


    String Url = "https://shambawebtest.clientele.co.za/shambaweb/login";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";


    String PasswordXpath = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    @Step("Open shamba website")

    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(1000);

        // Test Active Directory Login Credentials.
     }
    @Step("Login in using AD account")

    public void loginIn(String Username, String Password){

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NextBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(Password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignIn))).click();

    }

    @Step("Navigate to sales page")
    public void CaptureSale() throws InterruptedException {

        Thread.sleep(1000);
        $(By.xpath(ClienteleLogoXpath)).click();
        $(By.xpath(CaptureSaleXpath)).click();


    }
    @Step("Navigate to lead page")
    public void clickLeadBasket()throws InterruptedException{

        Thread.sleep(1000);
        $(By.xpath(LeadBasketXpath)).click();
    }



}
