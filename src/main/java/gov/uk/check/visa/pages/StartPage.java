package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {

    public void inIt() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Start n")
    WebElement startNowBtn;

    public  void clickStartNow() {
        clickOnElement(startNowBtn);
    }


}
