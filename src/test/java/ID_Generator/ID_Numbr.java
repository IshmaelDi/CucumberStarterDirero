package ID_Generator;

import net.serenitybdd.core.pages.PageObject;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.io.*;

public class ID_Numbr extends PageObject {

    String AgeXpath = "//*[@id=\"said_age\"]";

    String MonthXpath = "//*[@id=\"said_month\"]";

    String DayXpath = "//*[@id=\"said_day\"]";

    String GenderXpath = "//*[@id=\"said_gender\"]";

    String CountXpath = "//*[@id=\"said_count\"]";

    String GenerateIDXpath = "//*[@id=\"said_generate_object\"]";

    String IDNumber = "//*[@id=\"said_generated_results\"]/table/tbody/tr/td[1]";

    String IDnumberGeneratorUrl = "https://www.axonwireless.com/toolbox/sa-id-number-generator/";


    public void OpenIDnumberGeneratorWebsite() {
        getDriver().switchTo().newWindow(WindowType.TAB).get(IDnumberGeneratorUrl);
        getDriver().manage().window().maximize();

    }


    public void enterAge(String EnterMemberAge) throws IOException {
        $(By.xpath(AgeXpath)).clear();
        $(By.xpath(AgeXpath)).sendKeys(EnterMemberAge);
        $(By.xpath(MonthXpath)).clear();
        $(By.xpath(MonthXpath)).sendKeys("5");
        $(By.xpath(DayXpath)).clear();
        $(By.xpath(DayXpath)).sendKeys("5");
        $(By.xpath(CountXpath)).click();
        WebElement educ = $(By.xpath(GenderXpath));
        selectFromDropdown(educ, "Female");

        $(By.xpath(GenerateIDXpath)).click();
        String Idnumber = $(By.xpath(IDNumber)).getText();

        File file = new File("src\\test\\resources\\TestData\\UltimateDignityPlan.xlsx");

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = wb.getSheet("FuneralDignity");

        int rowCount = sheet.getLastRowNum() + 1;
        while (sheet.getRow(rowCount) != null) {
            rowCount++;
        }

        XSSFRow aa = sheet.createRow(rowCount);
        XSSFCell ID = aa.createCell(0);
        ID.setCellValue(Idnumber);

        FileOutputStream outputStream = new FileOutputStream("src/test/resources/TestData/UltimateDignityPlan.xlsx");
        wb.write(outputStream);
        wb.close();



    }

    public String IDNomber() throws IOException {

        File file = new File("src/test/resources/TestData/UltimateDignityPlan.xlsx");

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = wb.getSheet("FuneralDignity");


        // Incrementally read data from specific cells

        String cellValue = "";
        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum() + 1; rowIndex++) {
            Row rows = sheet.getRow(rowIndex);
            if (rows != null) {
                Cell cells = rows.getCell(0); // Assuming you're reading from the first cell (index 0)
                Cell Status = rows.createCell(2);
                Cell cell = rows.getCell(2);
                if (cells != null) {
                    cellValue = "";
                    if (cells.getCellType() == CellType.STRING || cell.getStringCellValue().isBlank()) {
                        cellValue = cells.getStringCellValue();
                        Status.setCellValue("ID Used");

                    } else if (cells.getCellType() == CellType.NUMERIC) {
                        cellValue = String.valueOf(cells.getNumericCellValue());
                    }

                    FileOutputStream outputStream = new FileOutputStream("src/test/resources/TestData/UltimateDignityPlan.xlsx");
                    wb.write(outputStream);


                }
            }
        }

        return cellValue;
    }

}
















