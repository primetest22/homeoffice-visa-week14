package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    WorkTypePage workTypePage;
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    ImmigrationStatus immigrationStatus;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        reasonForTravelPage = new ReasonForTravelPage();
        workTypePage = new WorkTypePage();
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        immigrationStatus = new ImmigrationStatus();
    }

    @Test(groups = {"sanity", "regression"})
    public void anAustralianCominToUKForTourism() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clickNextStepButton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");

    }

    @Test(groups = {"smoke", "regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {

        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        Thread.sleep(2000);
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickNextStepButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");

    }

    @Test(groups = {"sanity","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {

        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        immigrationStatus.setYes();
        immigrationStatus.clkOnBtn();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");

    }

}
