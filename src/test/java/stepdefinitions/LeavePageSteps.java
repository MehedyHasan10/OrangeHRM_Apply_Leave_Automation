package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LeavePage;

public class LeavePageSteps {
    private final LeavePage leavePage = new LeavePage();

    @Then("Leave page should display {string} text")
    public void getLeavePageHeader(String headerText) {
        Assert.assertTrue(leavePage.getLeavePageHeaderText().toLowerCase().contains(headerText.toLowerCase()), "Dashboard page header does not contain the expected text.");
    }
    @When("User clicks on the Apply Leave option")
    public void clickOnApplyButton(){
        leavePage.clickApplyButton();
    }
}
