package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement cntBtn;
    @FindBy(xpath = "//div[@class='govuk-radios']//input")
    List<WebElement> radioYandN;
    @FindBy(xpath = "#response-0")
    WebElement Yes;
    @FindBy(xpath = "#response-1")
    WebElement No;

    public void selectImmigrationStatus(String status){

        switch (status){
            case "yes":    clickOnElement(Yes);
            break;
            case "no": clickOnElement(No);
            break;
        }

        }


    public void nextStepButton() {
        clickOnElement(cntBtn);
    }


}
