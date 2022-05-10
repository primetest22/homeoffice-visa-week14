package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    public DurationOfStayPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement cntBtn;
    @FindBy(xpath = "//input[@value='six_months_or_less']")
    WebElement less6;
    @FindBy(xpath = "//input[@value='longer_than_six_months']")
    WebElement more6;

    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess){
            case "6 months or less":
                clickOnElement(less6);
                break;
            case "longer than 6 months":
                clickOnElement(more6);
                break;
        }
    }
    public void clickNextStepButton(){
        clickOnElement(cntBtn);
    }
}
