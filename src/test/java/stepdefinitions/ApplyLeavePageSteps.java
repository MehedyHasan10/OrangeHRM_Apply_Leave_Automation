package stepdefinitions;

import constants.LeaveType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApplyLeavePage;

public class ApplyLeavePageSteps {
    private final ApplyLeavePage applyLeavePage = new ApplyLeavePage();
    
    @Then("Apply Leave page should display {string} text")
    public void getApplyLeavePageHeader(String headerText) {
        Assert.assertTrue(applyLeavePage.getApplyLeavePageHeaderText().toLowerCase().contains(headerText.toLowerCase()), "Apply Page does not contain the expected text.");
    }
    
   @When("User submits the Apply Leave form without filling any fields")
    public void clickOnApplyButton(){
        applyLeavePage.clickApplyButton();
   }
   
   @Then("Error message {string} should be displayed for Leave Type")
   public void getLeaveTypeError(String errorText) {
       Assert.assertTrue(applyLeavePage.getLeaveTypeErrorText().toLowerCase().contains(errorText.toLowerCase()), "Leave Type Error message does not contain the expected text.");
   }

    @And("Error message {string} should be displayed for From Date")
    public void getFromDateError(String errorText) {
        Assert.assertTrue(applyLeavePage.getFromDataErrorText().toLowerCase().contains(errorText.toLowerCase()), "From Date Error message does not contain the expected text.");
    }

    @And("Error message {string} should be displayed for To Date")
    public void getToDateError(String errorText) {
        Assert.assertTrue(applyLeavePage.getToDataErrorText().toLowerCase().contains(errorText.toLowerCase()), "To Date Error message does not contain the expected text.");
    }
    
    @And("The form should remain on the Apply Leave page")
    public void isDisplayedApplyLeavePage(){
        applyLeavePage.state().isDisplayed();
    }
    
    @When("User clicks on the Leave Type dropdown")
    @When ("User clicks on the Leave Type dropdown again")
    public void clickOnLeaveTypeDropdown(){
        applyLeavePage.clickLeaveTypeDropdown();
    }
    
    @Then("Selected First Leave Type should be {string}")
    public void selectFirstLeaveType(String leaveType){
        LeaveType leaveTypeEnum = LeaveType.valueOf(leaveType.toUpperCase());
        applyLeavePage.selectFirstType(leaveTypeEnum);
    }

    @Then("Selected Second Leave Type should be {string}")
    public void selectSecondLeaveType(String leaveType){
        LeaveType leaveTypeEnum = LeaveType.valueOf(leaveType.toUpperCase());
        applyLeavePage.selectSecondType(leaveTypeEnum);
    }
}
