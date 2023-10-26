package PageObjects.AccidentPlus_H.E.L.P_YA;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ChildPage extends PageObject {

    String AddChildBtn = "//span[@class=\"title\"]";

    String childName = "//input[@id=\"FirstNames\"]";

    String childSurName = "//input[@id=\"Surname\"]";

    String childGender = "//select[@id=\"Gender\"]";
    String childIDnumber = "";
    String childDateOfBirth = "";
    String ChildisStudent = "//select[@id=\"IsStudent\"]";

    String saveChildBtn = "//*[@id=\"mat-dialog-12\"]/app-shamba-modal/div/div[2]/div/child-create/div/div[3]/div/div/button";


    @Step("Enter child name")
    public void EnterChildName(String Childname){
        $(By.xpath(childName)).sendKeys(Childname);

    }

    @Step("Add a child ")
    public void addChild(){
        $(By.xpath(AddChildBtn)).click();
    }
    @Step("Enter a child surname")
    public void childSurnam(String surname){
        $(By.xpath(childSurName)).sendKeys(surname);
    }
    @Step("Select gender for a child")
    public void childGen(String gender){
        Select c = new Select(getDriver().findElement(By.xpath(childGender)));
        c.selectByValue(gender);

    }
    @Step("select whether child is a student or not")
    public void ChildIsStudent(String  Yes_No){
        Select c = new Select(getDriver().findElement(By.xpath(ChildisStudent)));
        c.selectByValue(Yes_No);

    }

    @Step("Save child details")
    public void SAVEChild(){
        $(By.xpath(saveChildBtn)).click();
    }


}
