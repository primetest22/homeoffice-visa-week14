package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImmigrationStatus extends Utility {

       public ImmigrationStatus(){
           PageFactory.initElements(driver,this);
       }

       @FindBy(xpath = "//input[@value='yes']")
    WebElement yes;
       @FindBy(xpath = "//button[contains(text(),'Continue')]")
       WebElement cntBtn;

       public void setYes(){
           clickOnElement(yes);
       }
       public void clkOnBtn(){
           clickOnElement(cntBtn);
       }
}
