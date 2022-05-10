package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    public ReasonForTravelPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement cntBtn;
    @FindBy(xpath = "//div[@class='govuk-grid-column-two-thirds']//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> reasonForVisitList;



    public void selectReasonForVisit(String reason){
        for (WebElement visitReason : reasonForVisitList){
            if(visitReason.getText().equalsIgnoreCase(reason)){
                visitReason.click();
            }
        }
    }
    public void clickNextStepButton(){
        clickOnElement(cntBtn);
    }


}
