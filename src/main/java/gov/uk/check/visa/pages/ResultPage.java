package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//dd[@class='govuk-summary-list__value']")
    WebElement result;
    @FindBy(xpath = "//div[@data-flow-name='check-uk-visa']/child::h2")
    WebElement verifyText;
    ////h2[contains(text(),'You will not need a visa to come to the UK')]

    public String verifyTextAustralia(){
        return getTextFromElement(verifyText);
    }
    public  String getResultMessage(){
        return getTextFromElement(result);
    }
      public void confirmResultMessage(String expectedMessage){
          if(verifyTextAustralia().equalsIgnoreCase(expectedMessage)){
              Assert.assertTrue(true);
          } else {
              Assert.assertTrue(false);
          }
      }

}
