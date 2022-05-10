package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepBtn;
    @FindBy(xpath = "//a[contains(text(),'Work in the UK')]")
    WebElement workInTheUkLink;
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> workType;

    public void selectJobType(String job){
        for(WebElement type : workType){
            if(type.getText().equalsIgnoreCase(job)){
                clickOnElement(type);
                break;

           }
        }
    }


    public void clickOnWorkInUK(){
        clickOnElement(workInTheUkLink);
    }
    public void clickNextStepButton() {
        clickOnElement(nextStepBtn);
    }
}
