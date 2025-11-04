package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;

public class DashboardPageSteps {
    private final DashboardPage dashboardPage = new DashboardPage();
    
    @Then("Dashboard page should display {string} text")
    public void getDashboardHeader(String dashboardText) {
        Assert.assertTrue(dashboardPage.getDashboardHeaderText().toLowerCase().contains(dashboardText.toLowerCase()), "Dashboard page header does not contain the expected text.");
    }
    
    @And("User name in the top right corner should be displayed")
    public void isNameDisplayed() {
        Assert.assertTrue(dashboardPage.isUserNameDisplayed(), "User name is not displayed.");
    }
    
    @When("User clicks on the Leave option")
    public void clickOnLeaveButton(){
        dashboardPage.clickLeaveButton();
    }
}
